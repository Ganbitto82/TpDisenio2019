package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Medidasdeseguridad;


public class MedidasdeseguridadDaoImp implements MedidasdeseguridadDao {
    
    private final SessionFactory sessionFactory;

    public MedidasdeseguridadDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Medidasdeseguridad buscarPorId(int idMedidasdeseguridad) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Medidasdeseguridad> query = builder.createQuery(Medidasdeseguridad.class);
        Root<Medidasdeseguridad> root = query.from(Medidasdeseguridad.class);
        query.select(root);
        query.where(builder.equal(root.get("idMedidasdeseguridad"), idMedidasdeseguridad));
        
        Medidasdeseguridad medidasdeseguridad = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return medidasdeseguridad;
    }

    @Override
    public void guardar(Medidasdeseguridad medidasdeseguridad) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(medidasdeseguridad);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Medidasdeseguridad> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Medidasdeseguridad> cq = session.getCriteriaBuilder().createQuery(Medidasdeseguridad.class);
	
    	 cq.from(Medidasdeseguridad.class);
    	 List<Medidasdeseguridad> listaMedidasdeseguridad = session.createQuery(cq).getResultList();
    
        session.close();
        
        return listaMedidasdeseguridad;
    }
    
}


