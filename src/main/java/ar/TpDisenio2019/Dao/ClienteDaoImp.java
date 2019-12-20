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
import ar.TpDisenio2019.DTO.DTODireccion;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOPais;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Localidad;
import ar.TpDisenio2019.Modelo.Pais;
import ar.TpDisenio2019.Modelo.Provincia;
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
    
    
   
    public List<DTOCliente> obtenerDTOClientes() {
        
   	 Session session = sessionFactory.openSession();
   	 session.beginTransaction();
   	 CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);
	
   	 cq.from(Cliente.class);
   	 List<DTOCliente> listaDtoCliente = new ArrayList<>();
   	 List<Cliente> clientes = session.createQuery(cq).getResultList();
   	  DTOCliente nuevo;
   	  DTOTipodedocumento tipoDocumento;
   	  Pais pais;
   	  DTOPais dtopais;
      Provincia provincia; 
      DTOProvincia dtoprovincia;
      Localidad localidad; 
      DTOLocalidad dtolocalidad;
      DTODireccion direccion;
      
      for(Cliente c : clientes){
          tipoDocumento = new DTOTipodedocumento(c.getTipodedocumento().getIdTipoDeDocumento(),c.getTipodedocumento().getNombre());
          pais = c.getDireccion().getLocalidad().getProvincia().getPais();
          dtopais = new DTOPais(pais.getIdPais(),pais.getNombre());
          provincia= c.getDireccion().getLocalidad().getProvincia();
          dtoprovincia= new DTOProvincia(provincia.getIdProvincia(),provincia.getNombre(),dtopais);
          localidad = c.getDireccion().getLocalidad();
          dtolocalidad = new DTOLocalidad(localidad.getIdLocalidad(),localidad.getNombre(),dtoprovincia);
          
          direccion = new DTODireccion(c.getDireccion().getIdDireccion(),c.getDireccion().getCalle(),c.getDireccion().getNumero(),c.getDireccion().getPiso(),c.getDireccion().getDepartamento(),dtolocalidad);
          
          
          nuevo = new DTOCliente(c.getNroCliente(),c.getIdCliente(),c.getNroDocumento(),c.getNombre(),c.getApellido(),tipoDocumento, direccion);
          listaDtoCliente.add(nuevo);
      }
       session.close();
       
       return listaDtoCliente;
   }
   
}
