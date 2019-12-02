package ar.TpDisenio2019.Dao;




import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Tipocobertura;


public class TipocoberturaDaoImp implements TipocoberturaDao {
    
    private final SessionFactory sessionFactory;

    public TipocoberturaDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Tipocobertura buscarPorId(int idTipocobertura) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Tipocobertura> query = builder.createQuery(Tipocobertura.class);
        Root<Tipocobertura> root = query.from(Tipocobertura.class);
        query.select(root);
        query.where(builder.equal(root.get("idTipocobertura"), idTipocobertura));
        
        Tipocobertura tipocobertura = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return tipocobertura;
    }

    @Override
    public void guardar(Tipocobertura tipocobertura) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(tipocobertura);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Tipocobertura> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Tipocobertura> cq = session.getCriteriaBuilder().createQuery(Tipocobertura.class);
	
    	 cq.from(Tipocobertura.class);
    	 List<Tipocobertura> listaTipocobertura = session.createQuery(cq).getResultList();
    
        session.close();
        
        return listaTipocobertura;
    }
    
}