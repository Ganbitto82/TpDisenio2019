package ar.TpDisenio2019.Dao;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import ar.TpDisenio2019.Modelo.Estadocivil;


public class EstadocivilDaoImp implements EstadocivilDao {
    
    private final SessionFactory sessionFactory;

    public EstadocivilDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Estadocivil buscarPorId (int idEstadocivil){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Estadocivil> query = builder.createQuery(Estadocivil.class);
        Root<Estadocivil> root = query.from(Estadocivil.class);
        query.select(root);
        query.where(builder.equal(root.get("idEstadocivil"), idEstadocivil));
        
        Estadocivil estadocivil = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return   estadocivil;
    }

    @Override
    public void guardar(Estadocivil estadocivil) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(estadocivil);
        session.getTransaction().commit();
        session.close();
    }




}