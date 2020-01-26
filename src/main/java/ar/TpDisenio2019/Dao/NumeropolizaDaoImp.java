package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Numeropoliza;

public class NumeropolizaDaoImp implements NumeropolizaDao {

	private final SessionFactory sessionFactory;

	public NumeropolizaDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Numeropoliza buscarPorId(int idNumeropoliza) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Numeropoliza> query = builder.createQuery(Numeropoliza.class);
		Root<Numeropoliza> root = query.from(Numeropoliza.class);
		query.select(root);
		query.where(builder.equal(root.get("idNumeropoliza"), idNumeropoliza));

		Numeropoliza numeropoliza = session.createQuery(query).uniqueResult();

		session.close();

		return numeropoliza;
	}

	@Override
	public void guardar(Numeropoliza numeropoliza) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(numeropoliza);
		session.getTransaction().commit();
		session.close();
	}

}
