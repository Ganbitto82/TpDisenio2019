package ar.TpDisenio2019.Dao;



import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import ar.TpDisenio2019.Modelo.Datosdehijo;



public class DatosdehijoDaoImp implements DatosdehijoDao {
    
    private final SessionFactory sessionFactory;

    public DatosdehijoDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Datosdehijo buscarPorId (int idDatosdehijo){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Datosdehijo> query = builder.createQuery(Datosdehijo.class);
        Root<Datosdehijo> root = query.from(Datosdehijo.class);
        query.select(root);
        query.where(builder.equal(root.get("idDatosdehijo"), idDatosdehijo));
        
        Datosdehijo datosdehijo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return  datosdehijo;
    }

    @Override
    public void guardar(Datosdehijo datosdehijo) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(datosdehijo);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<Datosdehijo> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Datosdehijo> cq = session.getCriteriaBuilder().createQuery(Datosdehijo.class);
	
    	 cq.from(Datosdehijo.class);
    	 List<Datosdehijo> datosdehijos = session.createQuery(cq).getResultList();
    
        session.close();
        
        return datosdehijos;
    } 


}