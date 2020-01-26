package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Condicioniva;

public class CondicionivaDaoImp implements CondicionivaDao {

	private final SessionFactory sessionFactory;

	public CondicionivaDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Condicioniva buscarPorId(int idCondicioniva) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Condicioniva> query = builder.createQuery(Condicioniva.class);
		Root<Condicioniva> root = query.from(Condicioniva.class);
		query.select(root);
		query.where(builder.equal(root.get("idCondicioniva"), idCondicioniva));

		Condicioniva condicioniva = session.createQuery(query).uniqueResult();

		session.close();

		return condicioniva;
	}

	@Override
	public void guardar(Condicioniva condicioniva) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(condicioniva);
		session.getTransaction().commit();
		session.close();
	}

}
