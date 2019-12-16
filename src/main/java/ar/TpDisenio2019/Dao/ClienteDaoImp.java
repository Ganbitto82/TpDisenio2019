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
    	
    	Long n= dtoCliente.getNroCliente();
		String nombre = dtoCliente.getNombre();
		String apellido =dtoCliente.getApellido();
		int numDoc=dtoCliente.getNroDocumento();
		DTOTipodedocumento dtoTipo= new DTOTipodedocumento();
		
		String tipo= dtoCliente.getTipodedocumento().getNombre();
		
		String numeroCliente;
		String mumeroDoc;
		
		if(n==-1) numeroCliente=null;
		else numeroCliente= String.valueOf(n);
		
		if(numDoc==-1) mumeroDoc=null;
		else mumeroDoc= String.valueOf(n);
		
		
		
		try{
			
			session.beginTransaction();
			
			String consulta = new String("select t.nombre, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento from Cliente c ,Tipodedocumento t where ");
			if(numeroCliente != null) consulta += "CAST(c.numeroCliente as string) LIKE :numeroCliente";
			if (numeroCliente != null && nombre != null) consulta += " AND ";
			if (nombre != null) consulta += "c.nombre LIKE :nombre";
			if ((nombre != null || numeroCliente != null) && apellido != null) consulta += " AND ";
			if (apellido != null) consulta += "c.apellido LIKE :apellido";
			if ((nombre != null || numeroCliente != null ||apellido != null) && tipo != null) consulta += " AND ";
			if (tipo != null) consulta += "t.nombre LIKE :tipo";
			if ((nombre != null || numeroCliente != null ||apellido != null || tipo != null) && mumeroDoc != null) consulta += " AND ";
			if (mumeroDoc != null) consulta += "c.mumeroDoc LIKE :mumeroDoc";
			consulta += " AND eliminado = 'N'"; //Ni idea por qué funciona esto cuando no le pasas nada pero funciona
			
			Query q = (Query) session.createQuery(consulta);
			if(numeroCliente != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("numero","%" +  numeroCliente + "%");
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
/*	select t.nombre, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento from Cliente c ,tipodedocumento t where
CAST(nrCliente as string) LIKE :numero
 AND c.nombre LIKE :nombre
 AND c.apellido LIKE :apellido
 AND c.nroDocumento like : nroDocumento
 AND t.nombre like : tipo*/
