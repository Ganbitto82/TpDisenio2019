package ar.TpDisenio2019.Dao;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import ar.TpDisenio2019.Modelo.Profesion;


public class ProfesionDaoImp implements ProfesionDao {
    
    private final SessionFactory sessionFactory;

    public ProfesionDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Profesion buscarPorId (int idProfesion){
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Profesion> query = builder.createQuery(Profesion.class);
        Root<Profesion> root = query.from(Profesion.class);
        query.select(root);
        query.where(builder.equal(root.get("IdProfesion"), idProfesion));
        
        Profesion profesion = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return  profesion;
     }

    @Override
    public void guardar(Profesion profesion) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(profesion);
        session.getTransaction().commit();
        session.close();
    }




}
