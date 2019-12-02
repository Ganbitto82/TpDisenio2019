package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Cuota;


public class CuotaDaoImp implements CuotaDao {
    
    private final SessionFactory sessionFactory;

    public CuotaDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Cuota buscarPorId(int idCuota) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Cuota> query = builder.createQuery(Cuota.class);
        Root<Cuota> root = query.from(Cuota.class);
        query.select(root);
        query.where(builder.equal(root.get("idCuota"), idCuota));
        
        Cuota cuota = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return cuota;
    }

    @Override
    public void guardar(Cuota cuota) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cuota);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Cuota> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Cuota> cq = session.getCriteriaBuilder().createQuery(Cuota.class);
	
    	 cq.from(Cuota.class);
    	 List<Cuota> cuotas = session.createQuery(cq).getResultList();
    
        session.close();
        
        return cuotas;
    }
    
}

