package ar.TpDisenio2019.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.Modelo.Provincia;

public class ProvinciaDaoImp implements ProvinciaDao {

	private final SessionFactory sessionFactory;

	public ProvinciaDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Provincia buscarPorId(int idProvincia) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Provincia> query = builder.createQuery(Provincia.class);
		Root<Provincia> root = query.from(Provincia.class);
		query.select(root);
		query.where(builder.equal(root.get("IdProvincia"), idProvincia));

		Provincia provincia = session.createQuery(query).uniqueResult();

		session.close();

		return provincia;
	}

	@Override
	public void guardar(Provincia provincia) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(provincia);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<DTOProvincia> obtenerDTOProvincia() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Provincia> cq = session.getCriteriaBuilder().createQuery(Provincia.class);

		cq.from(Provincia.class);
		List<Provincia> provincias = session.createQuery(cq).getResultList();
		List<DTOProvincia> listaDtoProvincia = new ArrayList<>();

		DTOProvincia dtoProvincia;

		for (Provincia p : provincias) {
			dtoProvincia = new DTOProvincia();
			dtoProvincia.setIdProvincia(p.getIdProvincia());
			dtoProvincia.setNombre(p.getNombre());

			listaDtoProvincia.add(dtoProvincia);
		}

		session.close();

		return listaDtoProvincia;
	}
}