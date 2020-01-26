package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Kmporanio;

public class KmporanioDaoImp implements KmporanioDao {

	private final SessionFactory sessionFactory;

	public KmporanioDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Kmporanio buscarPorId(int idKmporanio) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kmporanio> query = builder.createQuery(Kmporanio.class);
		Root<Kmporanio> root = query.from(Kmporanio.class);
		query.select(root);
		query.where(builder.equal(root.get("idKmporanio"), idKmporanio));

		Kmporanio kmporanio = session.createQuery(query).uniqueResult();

		session.close();

		return kmporanio;
	}

	@Override
	public void guardar(Kmporanio kmporanio) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(kmporanio);
		session.getTransaction().commit();
		session.close();
	}

}