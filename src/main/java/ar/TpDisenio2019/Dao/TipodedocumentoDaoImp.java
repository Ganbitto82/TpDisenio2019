package ar.TpDisenio2019.Dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.Modelo.Tipodedocumento;

public class TipodedocumentoDaoImp implements TipodedocumentoDao {

	private final SessionFactory sessionFactory;

	public TipodedocumentoDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Tipodedocumento buscarPorId(int idTipodedocumento) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Tipodedocumento> query = builder.createQuery(Tipodedocumento.class);
		Root<Tipodedocumento> root = query.from(Tipodedocumento.class);
		query.select(root);
		query.where(builder.equal(root.get("IdTipodedocumento"), idTipodedocumento));

		Tipodedocumento tipodedocumento = session.createQuery(query).uniqueResult();

		session.close();

		return tipodedocumento;
	}

	@Override
	public void guardar(Tipodedocumento tipodedocumento) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(tipodedocumento);
		session.getTransaction().commit();
		session.close();
	}

	public List<Tipodedocumento> obtenerTodas() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Tipodedocumento> cq = session.getCriteriaBuilder().createQuery(Tipodedocumento.class);

		cq.from(Tipodedocumento.class);
		List<Tipodedocumento> tipos = session.createQuery(cq).getResultList();

		session.close();

		return tipos;
	}

}
