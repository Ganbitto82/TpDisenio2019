package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.Modelo.Estadocliente;

public class EstadoclienteDaoImp implements EstadoclienteDao {

	private final SessionFactory sessionFactory;

	public EstadoclienteDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Estadocliente buscarPorId(int idEstadocliente) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Estadocliente> query = builder.createQuery(Estadocliente.class);
		Root<Estadocliente> root = query.from(Estadocliente.class);
		query.select(root);
		query.where(builder.equal(root.get("idEstadocliente"), idEstadocliente));

		Estadocliente estadocliente = session.createQuery(query).uniqueResult();

		session.close();

		return estadocliente;
	}

	@Override
	public void guardar(Estadocliente estadocliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(estadocliente);
		session.getTransaction().commit();
		session.close();
	}

}