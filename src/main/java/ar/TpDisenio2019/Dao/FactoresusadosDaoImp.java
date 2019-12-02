package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Factoresusados;


public class FactoresusadosDaoImp implements FactoresusadosDao  {
    
    private final SessionFactory sessionFactory;

    public FactoresusadosDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Factoresusados buscarPorId (int idFactoresusados){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Factoresusados> query = builder.createQuery(Factoresusados.class);
        Root<Factoresusados> root = query.from(Factoresusados.class);
        query.select(root);
        query.where(builder.equal(root.get("idFactoresusados"), idFactoresusados));
        
        Factoresusados factoresusados = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   factoresusados;
    }

    @Override
    public void guardar(Factoresusados factoresusados) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(factoresusados);
        session.getTransaction().commit();
        session.close();
    }


}