package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Poliza;


public class PolizaDaoImp implements PolizaDao {
    
    private final SessionFactory sessionFactory;

    public PolizaDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Poliza buscarPorNumeroPoliza (Long numPoliza){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Poliza> query = builder.createQuery(Poliza.class);
        Root<Poliza> root = query.from(Poliza.class);
        query.select(root);
        query.where(builder.equal(root.get("nroPoliza"), numPoliza));
        
        Poliza poliza = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   poliza;
    }

    @Override
    public void guardar(Poliza poliza) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(poliza);
        session.getTransaction().commit();
        session.close();
    }


}