package ar.TpDisenio2019.Dao;




import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.Modelo.Aniodevehiculo;


public class AniodeVehiculoDaoImp implements AniodeVehiculoDao {
    
    private final SessionFactory sessionFactory;

    public AniodeVehiculoDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Aniodevehiculo buscarPorId(int idAniodevehiculo) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Aniodevehiculo> query = builder.createQuery(Aniodevehiculo.class);
        Root<Aniodevehiculo> root = query.from(Aniodevehiculo.class);
        query.select(root);
        query.where(builder.equal(root.get("idAniodevehiculo"), idAniodevehiculo));
        
        Aniodevehiculo aniodevehiculo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return aniodevehiculo;
    }

    @Override
    public void guardar(Aniodevehiculo aniodevehiculo) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(aniodevehiculo);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<DTOAniodevehiculo> obtenerDTOAnioVehiculo() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Aniodevehiculo> cq = session.getCriteriaBuilder().createQuery(Aniodevehiculo.class);
	
    	 cq.from(Aniodevehiculo.class);
    	 List<Aniodevehiculo> aniosdeVehiculos = session.createQuery(cq).getResultList();
    	 List<DTOAniodevehiculo> listaDtoAnioVehiculo =  new ArrayList<>();
    	 DTOAniodevehiculo dtoAnio;
         for(Aniodevehiculo a : aniosdeVehiculos){
        	 dtoAnio= new DTOAniodevehiculo();
        	 dtoAnio.setIdAnioDeVehiculo(a.getIdAnioDeVehiculo());
        	 dtoAnio.setAnio(a.getAnio());
        	 
        	 listaDtoAnioVehiculo.add(dtoAnio);
         }
    
        session.close();
        
        return  listaDtoAnioVehiculo;
    }
    
}

