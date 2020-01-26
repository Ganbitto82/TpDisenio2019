package ar.TpDisenio2019.Dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.TpDisenio2019.Modelo.Vehiculo;

public class VehiculoDaoImp implements VehiculoDao {

	private final SessionFactory sessionFactory;

	public VehiculoDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Vehiculo buscarPorId(int idVehiculo) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Vehiculo> query = builder.createQuery(Vehiculo.class);
		Root<Vehiculo> root = query.from(Vehiculo.class);
		query.select(root);
		query.where(builder.equal(root.get("idVehiculo"), idVehiculo));

		Vehiculo vehiculo = session.createQuery(query).uniqueResult();

		session.close();

		return vehiculo;
	}

	@Override
	public void guardar(Vehiculo vehiculo) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehiculo);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Vehiculo> obtenerTodas() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Vehiculo> cq = session.getCriteriaBuilder().createQuery(Vehiculo.class);

		cq.from(Vehiculo.class);
		List<Vehiculo> listaVehiculo = session.createQuery(cq).getResultList();

		session.close();

		return listaVehiculo;
	}

}