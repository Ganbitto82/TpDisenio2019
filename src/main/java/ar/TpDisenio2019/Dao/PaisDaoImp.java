package ar.TpDisenio2019.Dao;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import ar.TpDisenio2019.Modelo.Pais;


public class PaisDaoImp implements PaisDao {
    
    private final SessionFactory sessionFactory;

    public PaisDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Pais buscarPorId (int idPais){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Pais> query = builder.createQuery(Pais.class);
        Root<Pais> root = query.from(Pais.class);
        query.select(root);
        query.where(builder.equal(root.get("IdPais"), idPais));
        
        Pais pais = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return  pais;
     }

    @Override
    public void guardar(Pais pais) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(pais);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Pais> obtenerTodas() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Pais> cq = session.getCriteriaBuilder().createQuery(Pais.class);
	
    	 cq.from(Pais.class);
    	 List<Pais> paises = session.createQuery(cq).getResultList();
    
        session.close();
        
        return paises;
    }


}

