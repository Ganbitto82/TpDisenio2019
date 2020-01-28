package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.Controladores.GestorPoliza;
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
		
		DTOPoliza dtopoliza=new DTOPoliza();
		
		Long numeroPoliza=1123456700L;
		dtopoliza = GestorPoliza.buscarPoliza(numeroPoliza);
		List<DTOCuota> listaDtoCuota = new ArrayList<DTOCuota>();
		
		List<DTOCuota> listaFechaRecibo = new ArrayList<DTOCuota>();
		
		for (int i = dtopoliza.getCuota().getIdCuotas() + 1; i < dtopoliza.getCuota().getIdCuotas()+ 6; i++) {

			dtocuota = GestorPoliza.buscarPorId(i);

			listaDtoCuota.add(dtocuota);
			}
		
	    Date fecha=listaDtoCuota.get(1).getVencimiento();
		Calendar c = new GregorianCalendar();
		
		
		
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String fechaActual=annio.concat("-").concat(mes).concat("-").concat(dia);
		
		System.out.println( fechaActual);
		System.out.println(fecha.toString());
		
		if (fechaActual.compareTo(fecha.toString()) == 1) 
		    	
			System.out.println( "es mayor");
		else
			System.out.println( "es menor");
			
		

			

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
