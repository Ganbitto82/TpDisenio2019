package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Estado;


public class EstadoDaoImp implements EstadoDao  {
    
    private final SessionFactory sessionFactory;

    public EstadoDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Estado buscarPorId (int idEstado){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Estado> query = builder.createQuery(Estado.class);
        Root<Estado> root = query.from(Estado.class);
        query.select(root);
        query.where(builder.equal(root.get("idEstado"), idEstado));
        
        Estado estado = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   estado;
    }

    @Override
    public void guardar(Estado estado) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(estado);
        session.getTransaction().commit();
        session.close();
    }


}