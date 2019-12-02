package ar.TpDisenio2019.Dao;




import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Medidasdeseguridadporc;


public class MedidasdeseguridadporcDaoImp implements MedidasdeseguridadporcDao {
    
    private final SessionFactory sessionFactory;

    public MedidasdeseguridadporcDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Medidasdeseguridadporc buscarPorId (int idMedidasdeseguridadporc){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Medidasdeseguridadporc> query = builder.createQuery(Medidasdeseguridadporc.class);
        Root<Medidasdeseguridadporc> root = query.from(Medidasdeseguridadporc.class);
        query.select(root);
        query.where(builder.equal(root.get("idMedidasdeseguridadporc"), idMedidasdeseguridadporc));
        
        Medidasdeseguridadporc medidasdeseguridadporc = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   medidasdeseguridadporc;
    }

    @Override
    public void guardar(Medidasdeseguridadporc medidasdeseguridadporc) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(medidasdeseguridadporc);
        session.getTransaction().commit();
        session.close();
    }


}
