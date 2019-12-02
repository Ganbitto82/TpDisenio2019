package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Direccion;


public class DireccionDaoImp implements DireccionDao {
    
    private final SessionFactory sessionFactory;

    public DireccionDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Direccion buscarPorId (int idDireccion){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Direccion> query = builder.createQuery(Direccion.class);
        Root<Direccion> root = query.from(Direccion.class);
        query.select(root);
        query.where(builder.equal(root.get("idDireccion"), idDireccion));
        
        Direccion direccion = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   direccion;
    }

    @Override
    public void guardar(Direccion direccion) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(direccion);
        session.getTransaction().commit();
        session.close();
    }


}
