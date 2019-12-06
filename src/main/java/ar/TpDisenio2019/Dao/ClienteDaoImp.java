package ar.TpDisenio2019.Dao;




import java.util.List;

import javax.management.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Cliente;


public class ClienteDaoImp implements ClienteDao {
    
    private final SessionFactory sessionFactory;

    public ClienteDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Cliente buscarPorId(int idCliente) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
        Root<Cliente> root = query.from(Cliente.class);
        query.select(root);
        query.where(builder.equal(root.get("idCliente"), idCliente));
        
        Cliente cliente = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return cliente;
    }

    @Override
    public void guardar(Cliente cliente) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Cliente> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);
	
    	 cq.from(Cliente.class);
    	 List<Cliente> clientes = session.createQuery(cq).getResultList();
    
        session.close();
        
        return clientes;
    }
    
    
    @SuppressWarnings("unchecked")
	public List<Cliente> obtenerCliente(String numeroCliente, String apellido, String nombre, String tipoDocumento , String nroDoc){
    	
    	Session session = sessionFactory.openSession();
    	
    	String hql = ("from Cliente C\r\n" + 
				//		"where (c.idDireccion =  d.idDireccion) and (d.idLocalidad = l.idLocalidad) and (c.idTipoDeDocumento = t.idTipoDeDocumento)\r\n" + 
					//	"and (l.idProvincia = p.idProvincia)"
						 "where C.apellido LIKE "+apellido+" AND C.nombre LIKE "+ nombre+" AND C.nroDocumento ="+nroDoc+" AND \"\r\n");
						
	   Query query = (Query) session.createQuery(hql);
	
	List<Cliente> results= ((org.hibernate.query.Query<Cliente>) query).list();
	
    	session.close();
    	for(Cliente c: results)
    		
        	System.out.println(c.getApellido());
    	
    	return results;
    	
    
    }
    
}

