package ar.TpDisenio2019.Dao;




import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Tipodedocumento;





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
	public List<Cliente> buscarCliente(DTOCliente dtoCliente){
		
    	
    	Session session = sessionFactory.openSession();
    	
    	long numeroCliente= dtoCliente.getNroCliente();
		String nombre = dtoCliente.getNombre();
		String apellido =dtoCliente.getApellido();
		int nunmDoc =dtoCliente.getNroDocumento();
				
		String tipo= dtoCliente.getTipodedocumento().getNombre();
		
				
		try{
			session.beginTransaction();
			
			String consulta = new String("select t.nombre, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento from Cliente c ,Tipodedocumento t where ");
			if(numeroCliente != 0) consulta += "CAST(c.numeroCliente as string) LIKE :numeroCliente";
			if (numeroCliente != 0 && nombre != "") consulta += " AND ";
			if (nombre != "") consulta += "c.nombre LIKE :nombre";
			if ((nombre != "" || numeroCliente != 0) && apellido != "") consulta += " AND ";
			if (apellido != "") consulta += "c.apellido LIKE :apellido";
			else if ((nombre != "" || numeroCliente != 0 ||apellido != "") && tipo != "") consulta += " AND ";
			else if (tipo != "") consulta += "t.nombre = :tipo";
			else if ((nombre != "" || numeroCliente != 0||apellido != "" || tipo != "") && nunmDoc != 0) consulta += " AND ";
			else if (nunmDoc!= 0) consulta += "c.mumeroDoc LIKE :mumeroDoc";
			//consulta += " AND eliminado = 'N'";

			Query q = (Query) session.createQuery(consulta);
			if(numeroCliente != 0) ((org.hibernate.query.Query<Cliente>) q).setParameter("numero","%" +  numeroCliente + "%");
			if(nombre != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("nombre","%" +  nombre + "%");
			if(apellido != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("apellido","%" +  apellido + "%");
			
			
			List<Cliente> results = ((org.hibernate.query.Query<Cliente>) q).getResultList();
			List<Cliente> clientes = new ArrayList<Cliente>();
			
			for(Cliente aux : results){
				
				Cliente c = new Cliente();
				
				Tipodedocumento tipoDoc =new Tipodedocumento(); 
				tipoDoc.setIdTipoDeDocumento(aux.getTipodedocumento().getIdTipoDeDocumento());
				tipoDoc.setNombre(aux.getTipodedocumento().getNombre());
				c.setTipodedocumento(tipoDoc);
				c.setNroDocumento(aux.getNroDocumento());
				c.setNombre(aux.getNombre());
				c.setApellido(aux.getApellido());
				c.setNroCliente(aux.getNroCliente());
							 
				
				clientes.add(c);
			}
		
		return clientes;
		
		} catch (RuntimeException re) {
			System.out.println("Problema al buscar");
			throw re;
		}finally{
			session.close();
		}
		
	}
 
}
