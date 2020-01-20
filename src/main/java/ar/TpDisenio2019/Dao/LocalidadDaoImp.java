package ar.TpDisenio2019.Dao;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.Modelo.Localidad;
import ar.TpDisenio2019.Modelo.Modelo;



public class LocalidadDaoImp implements LocalidadDao {
    
    private final SessionFactory sessionFactory;

    public LocalidadDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Localidad buscarPorId (int idLocalidad){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Localidad> query = builder.createQuery(Localidad.class);
        Root<Localidad> root = query.from(Localidad.class);
        query.select(root);
        query.where(builder.equal(root.get("IdLocalidad"), idLocalidad));
        
        Localidad localidad = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return  localidad;
     }

    @Override
    public void guardar(Localidad localidad) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(localidad);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<DTOLocalidad> obtenerDTOLocalidad(DTOProvincia dtoProvincia) {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Localidad> cq = session.getCriteriaBuilder().createQuery(Localidad.class);
	
    	 cq.from(Localidad.class);
    	 List<Localidad> localidad = session.createQuery(cq).getResultList();
    	 List<DTOLocalidad> listaDtoLocalidad = new ArrayList<>();
    	 
    	 DTOLocalidad dtoLocalidad;
         for(Localidad l : localidad){
        	 dtoLocalidad = new DTOLocalidad();
        	 dtoLocalidad.setIdLocalidad(l.getIdLocalidad());
        	 dtoLocalidad.setNombre(l.getNombre());
        	 dtoLocalidad.setProvincia(dtoProvincia);
        	 listaDtoLocalidad.add(dtoLocalidad);
         }
        session.close();
        
        return listaDtoLocalidad;
    }
    
    @Override
    public List<DTOLocalidad> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Localidad> cq = session.getCriteriaBuilder().createQuery(Localidad.class);
	
    	 cq.from(Localidad.class);
    	 List<DTOLocalidad> listaDtoLocalidad = new ArrayList<>();
    	 List<Localidad> localidades = session.createQuery(cq).getResultList();
    	 DTOLocalidad nuevo;
    	 
    	 DTOProvincia dtoProvincia;
         
         for(Localidad l : localidades){
        	 
        	 dtoProvincia = new  DTOProvincia();
        	 dtoProvincia.setIdProvincia(l.getProvincia().getIdProvincia());
        	 dtoProvincia.setNombre(l.getProvincia().getNombre());
                     	         	  
             
             nuevo = new DTOLocalidad();
             nuevo.setIdLocalidad(l.getIdLocalidad());
             nuevo.setNombre(l.getNombre());
             nuevo.setProvincia(dtoProvincia);
 
             listaDtoLocalidad.add(nuevo);
         }
        session.close();
        
        return listaDtoLocalidad;
    }
}

