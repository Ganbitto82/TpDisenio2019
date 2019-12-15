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
    
  
	@SuppressWarnings("rawtypes")
	public List<Cliente> buscarCliente(DTOCliente cliente){
    	
    	Session session = sessionFactory.openSession();
    	int numeroCliente=cliente.getNroCliente();
		String nombre = cliente.getNombre();
		String apellido = cliente.getApellido();
		
		String numero;
		if(numeroCliente==-1) numero=null;
		else numero= String.valueOf(numeroCliente);
		

		
		try{
			
			session.beginTransaction();
			
			String consulta = new String("SELECT  c.tipoDoc, c.nroDoc, c.nombre, c.apellido, c.nroCandidato FROM Cliente c WHERE ");
			if(numero != null) consulta += "CAST(nroCandidato as string) LIKE :numero";
			if (numero != null && nombre != null) consulta += " AND ";
			if (nombre != null) consulta += "nombre LIKE :nombre";
			if ((nombre != null || numero != null) && apellido != null) consulta += " AND ";
			if (apellido != null) consulta += "apellido LIKE :apellido";
			consulta += " AND eliminado = 'N'"; //Ni idea por qué funciona esto cuando no le pasas nada pero funciona
			
			org.hibernate.query.Query q =  session.createQuery(consulta);
			if(numero != null) q.setParameter("numero","%" +  numero + "%");
			if(nombre != null) q.setParameter("nombre","%" +  nombre + "%");
			if(apellido != null) q.setParameter("apellido","%" +  apellido + "%");
			
			
			List<Cliente> results = q.getResultList();
			List<Cliente> clientes = new ArrayList<Cliente>();
			
			for(Cliente aux : results){
				
				Cliente c = new Cliente();
				Tipodedocumento tipo=new Tipodedocumento (); 
				
				c.setTipodedocumento(tipodedocumento);((String) aux[0]);
				c.setNroDoc((int) aux[1]);
				c.setNombre((String) aux[2]);
				c.setApellido((String) aux[3]);
				c.setNroCandidato((int) aux[4]); 
				
				cliente.add(c);
			}
		
		return clientes;
		
		} catch (RuntimeException re) {
			System.out.println("Problema al buscar");
			throw re;
		}finally{
			s.close();
		}
    	
    
    }
    
 
}

