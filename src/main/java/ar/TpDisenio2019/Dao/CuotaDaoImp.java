package ar.TpDisenio2019.Dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.Modelo.Cuota;
import ar.TpDisenio2019.Modelo.Operador;
import ar.TpDisenio2019.Modelo.Recibo;

public class CuotaDaoImp implements CuotaDao {

	private final SessionFactory sessionFactory;

	public CuotaDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public DTOCuota buscarPorId(int idCuota) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Cuota> query = builder.createQuery(Cuota.class);
		Root<Cuota> root = query.from(Cuota.class);
		query.select(root);
		query.where(builder.equal(root.get("idCuotas"), idCuota));

		Cuota cuota = session.createQuery(query).uniqueResult();
		DTOCuota dtocuota = new DTOCuota();
		DTORecibo dtorecibo = new DTORecibo();
		DTOOperador dtooperador = new DTOOperador();

		if(cuota.getRecibo()!=null) {
		dtooperador.setIdOperador(cuota.getRecibo().getOperador().getIdOperador());
		dtooperador.setNombre(cuota.getRecibo().getOperador().getNombre());

		dtorecibo.setIdRecibo(cuota.getRecibo().getIdRecibo());
		dtorecibo.setFecha(cuota.getRecibo().getFecha());
		dtorecibo.setHora(cuota.getRecibo().getHora());
		dtorecibo.setImporteTotal(cuota.getRecibo().getImporteTotal());
		dtorecibo.setNroRecibo(cuota.getRecibo().getNroRecibo());
		dtorecibo.setUltimoDiaDePago(cuota.getRecibo().getUltimoDiaDePago());
		dtorecibo.setOperador(dtooperador);}

		dtocuota.setIdCuotas(cuota.getIdCuotas());
		dtocuota.setRecibo(dtorecibo);
		dtocuota.setVencimiento(cuota.getVencimiento());
		dtocuota.setValorOriginal(cuota.getValorOriginal());
		dtocuota.setValorPorMora(cuota.getValorPorMora());
		dtocuota.setValorTotalaPagar(cuota.getValorOriginal());
		dtocuota.setBonificacion(cuota.getBonificacion());
		dtocuota.setCuotasPagas(cuota.getCuotasPagas());
		dtocuota.setRecargoPorMora(cuota.getRecargoPorMora());

		session.close();

		return dtocuota;
	}

	@Override
	public void guardar(Cuota cuota) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cuota);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Cuota> obtenerTodas() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Cuota> cq = session.getCriteriaBuilder().createQuery(Cuota.class);

		cq.from(Cuota.class);
		List<Cuota> cuotas = session.createQuery(cq).getResultList();

		session.close();

		return cuotas;
	}
	
	@Override
	public void guardarDTOCuota(DTOCuota dtocuota) {
		Session session = sessionFactory.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Cuota> query = builder.createQuery(Cuota.class);
		Root<Cuota> root = query.from(Cuota.class);
		query.select(root);
		query.where(builder.equal(root.get("idCuotas"), dtocuota.getIdCuotas()));

		Cuota cuota = session.createQuery(query).uniqueResult();
		
		session.beginTransaction();
			
		Recibo recibo=new Recibo();
		recibo.setIdRecibo(cuota.getIdCuotas());
		cuota.setRecibo(recibo);
		cuota.setCuotasPagas(dtocuota.getCuotasPagas());
		cuota.setValorPorMora(dtocuota.getValorPorMora());
		cuota.setValorTotalaPagar(dtocuota.getValorTotalaPagar());
		cuota.setBonificacion(dtocuota.getBonificacion());
		cuota.setRecargoPorMora(dtocuota.getRecargoPorMora());
		
		session.save(cuota);
		session.getTransaction().commit();
		session.close();
	}

}
