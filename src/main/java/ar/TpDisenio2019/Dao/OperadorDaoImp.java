package ar.TpDisenio2019.Dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.Modelo.Operador;

public class OperadorDaoImp implements OperadorDao {

	private final SessionFactory sessionFactory;

	public OperadorDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Operador buscarPorId(int idOperador) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Operador> query = builder.createQuery(Operador.class);
		Root<Operador> root = query.from(Operador.class);
		query.select(root);
		query.where(builder.equal(root.get("idOperador"), idOperador));

		Operador operador = session.createQuery(query).uniqueResult();

		session.close();

		return operador;
	}

	@Override
	public void guardar(Operador operador) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(operador);
		session.getTransaction().commit();
		session.close();
	}
	@Override
	public DTOOperador buscarPorNombre(String nombre ) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Operador> query = builder.createQuery(Operador.class);
		Root<Operador> root = query.from(Operador.class);
		query.select(root);
		query.where(builder.equal(root.get("nombre"), nombre));

		 System.out.println();
		Operador operador = session.createQuery(query).uniqueResult();

		
		
		DTOOperador dtoOperador =new DTOOperador();
		dtoOperador.setIdOperador(operador.getIdOperador());
		dtoOperador.setNombre(operador.getNombre());

		session.close();
		return dtoOperador;
		
		
		
		
	}

}
