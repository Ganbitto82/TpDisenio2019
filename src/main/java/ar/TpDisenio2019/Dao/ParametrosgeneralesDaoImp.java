package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Parametrosgenerales;


public class ParametrosgeneralesDaoImp implements ParametrosgeneralesDao {
    
    private final SessionFactory sessionFactory;

    public ParametrosgeneralesDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Parametrosgenerales buscarPorId (int idParametrosgenerales){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Parametrosgenerales> query = builder.createQuery(Parametrosgenerales.class);
        Root<Parametrosgenerales> root = query.from(Parametrosgenerales.class);
        query.select(root);
        query.where(builder.equal(root.get("idParametrosgenerales"), idParametrosgenerales));
        
        Parametrosgenerales parametrosgenerales = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   parametrosgenerales;
    }

    @Override
    public void guardar(Parametrosgenerales parametrosgenerales) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(parametrosgenerales);
        session.getTransaction().commit();
        session.close();
    }


}