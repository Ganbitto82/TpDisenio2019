package ar.TpDisenio2019.Dao;




import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.Modelo.Modelo;


public class ModeloDaoImp implements ModeloDao {
    
    private final SessionFactory sessionFactory;

    public ModeloDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Modelo buscarPorId(int idModelo) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Modelo> query = builder.createQuery(Modelo.class);
        Root<Modelo> root = query.from(Modelo.class);
        query.select(root);
        query.where(builder.equal(root.get("idModelo"), idModelo));
        
        Modelo modelo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return modelo;
    }

    @Override
    public void guardar(Modelo modelo) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(modelo);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<DTOModelo> obtenerDTOModelo(DTOMarca dtoMarca, DTOAniodevehiculo dtoAniodeVehiculo) {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Modelo> cq = session.getCriteriaBuilder().createQuery(Modelo.class);
	
    	 cq.from(Modelo.class);
    	 List<Modelo> modelos = session.createQuery(cq).getResultList();
    	 List<DTOModelo> listaDtoModelo = new ArrayList<>();
    	 
    	 DTOModelo dtoModelo;
         for(Modelo m : modelos){
        	  dtoModelo = new DTOModelo(m.getIdModelo(),dtoMarca,dtoAniodeVehiculo,m.getNombre(),m.getPorcentaje());
        	  listaDtoModelo.add(dtoModelo);
         }
    
        session.close();
        
        return listaDtoModelo;
    }
    
    
    @Override
    public List<DTOModelo> obtenerTodas() {
    	 Session session = sessionFactory.openSession();
       	 session.beginTransaction();
       	 CriteriaQuery<Modelo> cq = session.getCriteriaBuilder().createQuery(Modelo.class);
    	
       	 cq.from(Modelo.class);
       	 
       	 List<DTOModelo> listaDtoModelo = new ArrayList<>();
       	 List<Modelo> modelos= session.createQuery(cq).getResultList();
       	 DTOModelo nuevo;
       
         DTOAniodevehiculo dtoAnioVehiculo;
       
         DTOMarca dtoMarca;
          
          for(Modelo m : modelos){
             
      
        	  dtoAnioVehiculo=new DTOAniodevehiculo(); 
        	  dtoAnioVehiculo.setIdAnioDeVehiculo(m.getAniodevehiculo().getIdAnioDeVehiculo());
        	  dtoAnioVehiculo.setAnio(m.getAniodevehiculo().getAnio());
        	  
              
              dtoMarca=new  DTOMarca();
              dtoMarca.setIdMarca(m.getMarca().getIdMarca());
              dtoMarca.setMarca(m.getMarca().getMarca());
                      	         	  
              
              nuevo = new DTOModelo();
              nuevo.setIdModelo(m.getIdModelo());
              nuevo.setNombre(m.getNombre());
              nuevo.setPorcentaje(m.getPorcentaje());
              nuevo.setMarca(dtoMarca);
              nuevo.setAniodevehiculo(dtoAnioVehiculo);
              
              listaDtoModelo.add(nuevo);
          }
           session.close();
           
           return listaDtoModelo;
       }
    
}
