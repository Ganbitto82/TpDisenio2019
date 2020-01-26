package ar.TpDisenio2019.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOAniomodelo;
import ar.TpDisenio2019.DTO.DTOAniomodeloId;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.Modelo.Aniomodelo;
import ar.TpDisenio2019.Modelo.Modelo;

public class ModeloDaoImp implements ModeloDao {
	private static Set<DTOAniomodelo> dtolistaAniomodelos;
	private final SessionFactory sessionFactory;

	public ModeloDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Modelo buscarPorId(int idModelo) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Modelo> query = builder.createQuery(Modelo.class);
		Root<Modelo> root = query.from(Modelo.class);
		query.select(root);
		query.where(builder.equal(root.get("idModelo"), idModelo));

		Modelo modelo = session.createQuery(query).uniqueResult();

		session.close();

		return modelo;
	}

	@Override
	public void guardar(Modelo modelo) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(modelo);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<DTOModelo> obtenerTodas() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CriteriaQuery<Modelo> cq = session.getCriteriaBuilder().createQuery(Modelo.class);
		cq.from(Modelo.class);
		List<Modelo> modelos = session.createQuery(cq).getResultList();
		dtolistaAniomodelos = new HashSet<>();
		List<DTOModelo> listaDtoModelo = new ArrayList<>();
		Set<Aniomodelo> Aniomodelos;
		DTOAniomodelo dtoAniomodelo;
		DTOModelo nuevo;
		DTOModelo dtomodelo;
		DTOAniodevehiculo dtoaniodevehiculo;
		DTOMarca dtoMarca;
		DTOAniomodeloId dtAniomodeloId;
		for (Modelo m : modelos) {

			Aniomodelos = m.getAniomodelos();

			for (Aniomodelo aniomodelo : Aniomodelos) {
				dtomodelo = new DTOModelo();
				dtomodelo.setIdModelo(aniomodelo.getModelo().getIdModelo());
				dtomodelo.setNombre(aniomodelo.getModelo().getNombre());

				dtoaniodevehiculo = new DTOAniodevehiculo();
				dtoaniodevehiculo.setIdAnioDeVehiculo(aniomodelo.getAniodevehiculo().getIdAnioDeVehiculo());
				dtoaniodevehiculo.setAnio(aniomodelo.getAniodevehiculo().getAnio());

				dtAniomodeloId = new DTOAniomodeloId();
				dtAniomodeloId.setIdModelo(aniomodelo.getId().getIdAnioModelo());
				dtAniomodeloId.setIdAnioModelo(aniomodelo.getId().getIdAnioDeVehiculo());
				dtAniomodeloId.setIdAnioDeVehiculo(aniomodelo.getId().getIdAnioDeVehiculo());

				dtoAniomodelo = new DTOAniomodelo();
				dtoAniomodelo.setAniodevehiculo(dtoaniodevehiculo);
				dtoAniomodelo.setId(dtAniomodeloId);
				dtoAniomodelo.setModelo(dtomodelo);

				dtolistaAniomodelos.add(dtoAniomodelo);

			}
			dtoMarca = new DTOMarca();
			dtoMarca.setIdMarca(m.getMarca().getIdMarca());
			dtoMarca.setMarca(m.getMarca().getMarca());

			nuevo = new DTOModelo();
			nuevo.setMarca(dtoMarca);
			nuevo.setAniomodelos(dtolistaAniomodelos);
			nuevo.setIdModelo(m.getIdModelo());
			nuevo.setNombre(m.getNombre());
			nuevo.setModelocol(m.getModelocol());
			nuevo.setPorcentaje(m.getPorcentaje());

			listaDtoModelo.add(nuevo);
		}

		session.close();
		return listaDtoModelo;
	}

}