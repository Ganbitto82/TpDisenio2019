package ar.TpDisenio2019.Dao;




import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import ar.TpDisenio2019.Modelo.Localidad;



public class LocalidadDaoImp implements LocalidadDao {
    
    private final SessionFactory sessionFactory;

    public LocalidadDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Localidad buscarPorId (int idLocalidad){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Localidad> query = builder.createQuery(Localidad.class);
        Root<Localidad> root = query.from(Localidad.class);
        query.select(root);
        query.where(builder.equal(root.get("IdLocalidad"), idLocalidad));
        
        Localidad localidad = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return  localidad;
     }

    @Override
    public void guardar(Localidad localidad) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(localidad);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Localidad> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Localidad> cq = session.getCriteriaBuilder().createQuery(Localidad.class);
	
    	 cq.from(Localidad.class);
    	 List<Localidad> localidades = session.createQuery(cq).getResultList();
    
        session.close();
        
        return localidades;
    }


}

