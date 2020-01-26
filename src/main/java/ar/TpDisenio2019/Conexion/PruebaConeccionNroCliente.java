package ar.TpDisenio2019.Conexion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Cuota;
import ar.TpDisenio2019.Modelo.Poliza;

public class PruebaConeccionNroCliente {

	public static void main(String[] args) {
        
		DTOCuota dtocuota = new DTOCuota();
		/*Cliente c = new Cliente();
		c = null;

		Long l = 155555551L;

		c = buscarPorId(l);
		if (c == null)
			System.out.println("No existe Cliente");

		else
			System.out.println(c.getApellido());*/
		dtocuota=  buscarPorIdCuota(1);
		System.out.println(dtocuota.getRecibo().getOperador().getNombre());
		

	}

	public static Cliente buscarPorId(Long nroCliente) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
		Root<Cliente> root = query.from(Cliente.class);
		query.select(root);
		query.where(builder.equal(root.get("nroCliente"), nroCliente));

		Cliente cliente = session.createQuery(query).uniqueResult();

		session.close();

		return cliente;
	}
	
	public static DTOCuota buscarPorIdCuota(int idCuota) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Cuota> query = builder.createQuery(Cuota.class);
		Root<Cuota> root = query.from(Cuota.class);
		query.select(root);
		query.where(builder.equal(root.get("idCuotas"), idCuota));

		Cuota cuota = session.createQuery(query).uniqueResult();
		
		DTOCuota dtocuota = new DTOCuota();
		DTORecibo dtorecibo = new DTORecibo();
		DTOOperador dtooperador = new DTOOperador();

		dtooperador.setIdOperador(cuota.getRecibo().getOperador().getIdOperador());
		dtooperador.setNombre(cuota.getRecibo().getOperador().getNombre());

		dtorecibo.setIdRecibo(cuota.getRecibo().getIdRecibo());
		dtorecibo.setFecha(cuota.getRecibo().getFecha());
		dtorecibo.setHora(cuota.getRecibo().getHora());
		dtorecibo.setImporteTotal(cuota.getRecibo().getImporteTotal());
		dtorecibo.setNroRecibo(cuota.getRecibo().getNroRecibo());
		dtorecibo.setUltimoDiaDePago(cuota.getRecibo().getUltimoDiaDePago());
		dtorecibo.setOperador(dtooperador);

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

}
