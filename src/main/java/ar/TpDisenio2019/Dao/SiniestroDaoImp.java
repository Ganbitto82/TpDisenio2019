package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Siniestro;


public class SiniestroDaoImp implements SiniestroDao {
    
    private final SessionFactory sessionFactory;

    public SiniestroDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Siniestro buscarPorId(int idSiniestro) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Siniestro> query = builder.createQuery(Siniestro.class);
        Root<Siniestro> root = query.from(Siniestro.class);
        query.select(root);
        query.where(builder.equal(root.get("idSiniestro"), idSiniestro));
        
        Siniestro siniestro = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return siniestro;
    }

    @Override
    public void guardar(Siniestro siniestro) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(siniestro);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Siniestro> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Siniestro> cq = session.getCriteriaBuilder().createQuery(Siniestro.class);
	
    	 cq.from(Siniestro.class);
    	 List<Siniestro> siniestros = session.createQuery(cq).getResultList();
    
        session.close();
        
        return siniestros;
    }
    
}

