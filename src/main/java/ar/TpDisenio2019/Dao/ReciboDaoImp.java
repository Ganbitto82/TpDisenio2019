package ar.TpDisenio2019.Dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.Modelo.Operador;
import ar.TpDisenio2019.Modelo.Recibo;

public class ReciboDaoImp implements ReciboDao {

	private final SessionFactory sessionFactory;

	public ReciboDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Recibo buscarPorId(int idRecibo) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Recibo> query = builder.createQuery(Recibo.class);
		Root<Recibo> root = query.from(Recibo.class);
		query.select(root);
		query.where(builder.equal(root.get("idRecibo"), idRecibo));

		Recibo recibo = session.createQuery(query).uniqueResult();

		session.close();

		return recibo;
	}

	@Override
	public void guardar(DTORecibo dtorecibo) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        Recibo recibo=new Recibo();
		Operador operador =new Operador();
		
		operador.setIdOperador(dtorecibo.getOperador().getIdOperador());
		operador.setNombre(dtorecibo.getOperador().getNombre());
		
		
		recibo.setIdRecibo(dtorecibo.getIdRecibo());
		recibo.setOperador(operador);
		recibo.setNroRecibo(dtorecibo.getNroRecibo());
		recibo.setFecha(dtorecibo.getFecha());
		recibo.setHora(dtorecibo.getHora());
		recibo.setUltimoDiaDePago(dtorecibo.getUltimoDiaDePago());
		recibo.setImporteTotal(dtorecibo.getImporteTotal());
		
		/*System.out.println(dtorecibo.getIdRecibo());
		System.out.println(operador.getNombre());
		System.out.println(dtorecibo.getNroRecibo());
		System.out.println(dtorecibo.getFecha());
		System.out.println(dtorecibo.getHora());
		System.out.println(dtorecibo.getUltimoDiaDePago());
		System.out.println(dtorecibo.getImporteTotal());*/
		System.out.println();
		
		session.save(recibo);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Recibo> obtenerTodas() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Recibo> cq = session.getCriteriaBuilder().createQuery(Recibo.class);

		cq.from(Recibo.class);
		List<Recibo> recibo = session.createQuery(cq).getResultList();

		session.close();

		return recibo;
	}

}