package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Modificacionpoliza;

public class ModificacionpolizaDaoImp implements ModificacionpolizaDao {

	private final SessionFactory sessionFactory;

	public ModificacionpolizaDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Modificacionpoliza buscarPorId(int idModificacionpoliza) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Modificacionpoliza> query = builder.createQuery(Modificacionpoliza.class);
		Root<Modificacionpoliza> root = query.from(Modificacionpoliza.class);
		query.select(root);
		query.where(builder.equal(root.get("idModificacionpoliza"), idModificacionpoliza));

		Modificacionpoliza modificacionpoliza = session.createQuery(query).uniqueResult();

		session.close();

		return modificacionpoliza;
	}

	@Override
	public void guardar(Modificacionpoliza modificacionpoliza) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(modificacionpoliza);
		session.getTransaction().commit();
		session.close();
	}

}
