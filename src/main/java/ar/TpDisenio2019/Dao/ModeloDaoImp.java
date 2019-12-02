package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    public List<Modelo> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Modelo> cq = session.getCriteriaBuilder().createQuery(Modelo.class);
	
    	 cq.from(Modelo.class);
    	 List<Modelo> modelos = session.createQuery(cq).getResultList();
    
        session.close();
        
        return modelos;
    }
    
}
