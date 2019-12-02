package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Recibo;


public class ReciboDaoImp implements ReciboDao {
    
    private final SessionFactory sessionFactory;

    public ReciboDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Recibo buscarPorId(int idRecibo) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recibo> query = builder.createQuery(Recibo.class);
        Root<Recibo> root = query.from(Recibo.class);
        query.select(root);
        query.where(builder.equal(root.get("idRecibo"), idRecibo));
        
        Recibo recibo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return recibo;
    }

    @Override
    public void guardar(Recibo recibo) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(recibo);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Recibo> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Recibo> cq = session.getCriteriaBuilder().createQuery(Recibo.class);
	
    	 cq.from(Recibo.class);
    	 List<Recibo> recibo = session.createQuery(cq).getResultList();
    
        session.close();
        
        return recibo;
    }
    
}