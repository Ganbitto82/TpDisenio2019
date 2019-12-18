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
    
    
   /* public  List<Cliente> finder(DTOCliente dtocliente){

    	Session session = sessionFactory.openSession();
    	
    	long n= dtocliente.getNroCliente();
		String nombre = dtocliente.getNombre();
		String apellido =dtocliente.getApellido();
		int numDoc =dtocliente.getNroDocumento();
				
		String tipo= dtocliente.getTipodedocumento().getNombre();
		
		String numero;
		if(n==-1) numero=null;
		else numero= String.valueOf(n);
		
		
		
		try{
			session.beginTransaction();
			
			
			String consulta = new String("select c.idCliente, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento ,t.idTipoDeDocumento,"
					+ "t.nombre from Cliente c , Tipodedocumento t where ");
			if(numero != null) consulta += "CAST(nroCandidato as string) LIKE :numero";
			if (numero != null && nombre != null) consulta += " AND ";
			if (nombre != null) consulta += "nombre LIKE :nombre";
			if ((nombre != null || numero != null) && apellido != null) consulta += " AND ";
			if (apellido != null) consulta += "apellido LIKE :apellido";
			consulta += " AND eliminado = 'N'"; //Ni idea por qué funciona esto cuando no le pasas nada pero funciona
			
			Query q = (Query) session.createQuery(consulta);
			if(numero != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("numero","%" +  numero + "%");
			if(nombre != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("nombre","%" +  nombre + "%");
			if(apellido != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("apellido","%" +  apellido + "%");
			
			
			
			List<Cliente> results = ((org.hibernate.query.Query<Cliente>) q).getResultList();
			List<Cliente> candidatos = new ArrayList<Cliente>();
			
			for(Cliente aux : results){
				
				Cliente c = new Cliente();
				
				Tipodedocumento tipoDoc =new Tipodedocumento(); 
				tipoDoc.setIdTipoDeDocumento(c.setTipodedocumento(tipodedocumento););
				tipoDoc.setNombre(aux.getTipodedocumento().getNombre());
				c.setTipodedocumento(tipoDoc);
				c.setNroDocumento(aux.getNroDocumento());
				c.setNombre(aux.getNombre());
				c.setApellido(aux.getApellido());
				c.setNroCliente(aux.getNroCliente());
				clientes.add(c);
			}
		
		return candidatos;
		
		} catch (RuntimeException re) {
			System.out.println("Problema al buscar");
			throw re;
		}finally{
			session.close();
		}
		
	}*/
	
    
  
   @SuppressWarnings("unchecked")
	public List<Cliente> buscarCliente(DTOCliente dtoCliente){
		
    	
    	Session session = sessionFactory.openSession();
    	
    	long numeroCliente= dtoCliente.getNroCliente();
		String nombre = dtoCliente.getNombre();
		String apellido =dtoCliente.getApellido();
		int nunmDoc =dtoCliente.getNroDocumento();
				
		String tipo= dtoCliente.getTipodedocumento().getNombre();
		
				
		try{
				
			String consulta = new String("select c.idCliente, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento ,t.idTipoDeDocumento,"
					+ "t.nombre from Cliente c , Tipodedocumento t where ");
			if(numeroCliente != 0) consulta += "c.nroCliente = numeroCliente";
			
			
			/*if (numeroCliente != 0 && nombre != "") consulta += " AND ";
			if (nombre != "") consulta += "c.nombre LIKE :nombre";
			if ((nombre != "" || numeroCliente != 0) && apellido != "") consulta += " AND ";
			if (apellido != "") consulta += "c.apellido LIKE :apellido";
			else if ((nombre != "" || numeroCliente != 0 ||apellido != "") && tipo != "") consulta += " AND ";
			else if (tipo != "") consulta += "t.nombre = :tipo";
			else if ((nombre != "" || numeroCliente != 0||apellido != "" || tipo != "") && nunmDoc != 0) consulta += " AND ";
			else if (nunmDoc!= 0) consulta += "c.mumeroDoc LIKE :mumeroDoc";
			//consulta += " AND eliminado = 'N'";*/

			Query q = (Query) session.createQuery(consulta);
			if(numeroCliente != 0)  ((org.hibernate.query.Query<Cliente>) q).setParameter("numeroCliente","%" +  numeroCliente + "%");
			//if(nombre != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("nombre","%" +  nombre + "%");
			//if(apellido != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("apellido","%" +  apellido + "%");
			
			
			List<String> results = ((org.hibernate.query.Query<String>) q).getResultList();
			//List<Cliente> clientes = new ArrayList<Cliente>();
			
			for(String aux : results)
				System.out.println(aux);
			
			/*for(String aux : results){
				
				Cliente c = new Cliente();
				
				Tipodedocumento tipoDoc =new Tipodedocumento(); 
				tipoDoc.setIdTipoDeDocumento(c.setTipodedocumento(tipodedocumento););
				tipoDoc.setNombre(aux.getTipodedocumento().getNombre());
				c.setTipodedocumento(tipoDoc);
				c.setNroDocumento(aux.getNroDocumento());
				c.setNombre(aux.getNombre());
				c.setApellido(aux.getApellido());
				c.setNroCliente(aux.getNroCliente());
							 
				
				clientes.add(c);*/
			return null;
		
		//return clientes;
		
		} catch (RuntimeException re) {
			System.out.println("Problema al buscar");
			throw re;
		}finally{
			session.close();
		}
		
	}
 
}
