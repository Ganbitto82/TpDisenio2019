package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.Controladores.GestorPoliza;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOEstado;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.DTO.DTOVehiculo;
import ar.TpDisenio2019.Modelo.Poliza;

public class PruebaConeccionBuscarPoliza {
	public static void main(String[] args) {

		DTOPoliza dtopoliza = new DTOPoliza();
		DTOCuota dtocuota=new DTOCuota();
		List<DTOCuota> listaDtoCuota = new ArrayList<DTOCuota>(); 

		dtopoliza = buscarPorNumeroPoliza(1123456700L);
		if (dtopoliza== null)
			System.out.println("No existe Poliza");

		else {

			if (dtopoliza.getFormasdepago().getNombre().equals("MENSUAL")) {

				for (int i = dtopoliza.getCuota().getIdCuotas() + 1; i < dtopoliza.getCuota().getIdCuotas()+ 6; i++) {

					dtocuota = GestorPoliza.buscarPorId(i);

					listaDtoCuota.add(dtocuota);
				}

				for (DTOCuota cuota : listaDtoCuota) {
					System.out.println(cuota.getRecibo().getFecha());

				}
			} else {
				System.out.println("SEMESTRAL");
			}

		}

	}

	
	
	
	
	
	
	public static DTOPoliza buscarPorNumeroPoliza(Long nroPoliza) {
		ConexionBD cone = new ConexionBD();

		Session session = cone.Conexion().openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Poliza> query = builder.createQuery(Poliza.class);
		Root<Poliza> root = query.from(Poliza.class);
		query.select(root);
		query.where(builder.equal(root.get("nroPoliza"), nroPoliza));

		Poliza poliza = session.createQuery(query).uniqueResult();

		
		if (poliza == null)
			return null;
		else {

			DTOPoliza nueva = new DTOPoliza();

			DTOCliente dtoCliente = new DTOCliente();

			DTOTipodedocumento dtotipo = new DTOTipodedocumento();

			DTOCuota dtocuota = new DTOCuota();
			
		

			DTOFormasdepago dtoformasdepago = new DTOFormasdepago();

			DTORecibo dtorecibo = new DTORecibo();

			DTOEstado dtoestado = new DTOEstado();

			DTOVehiculo dtovehiculo = new DTOVehiculo();

			DTOModelo dtomodelo = new DTOModelo();

			DTOMarca dtomarca = new DTOMarca();

			List<DTOCuota> listadtocuotas = new ArrayList<DTOCuota>();

			dtoestado.setIdEstado(poliza.getEstado().getIdEstado());
			dtoestado.setTipo(poliza.getEstado().getTipo());

			dtomarca.setIdMarca(poliza.getVehiculo().getModelo().getMarca().getIdMarca());
			dtomarca.setMarca(poliza.getVehiculo().getModelo().getMarca().getMarca());

			dtomodelo.setIdModelo(poliza.getVehiculo().getModelo().getIdModelo());
			dtomodelo.setNombre(poliza.getVehiculo().getModelo().getNombre());
			dtomodelo.setMarca(dtomarca);

			dtovehiculo.setIdVehiculo(poliza.getVehiculo().getIdVehiculo());
			dtovehiculo.setModelo(dtomodelo);
			dtovehiculo.setPatente(poliza.getVehiculo().getPatente());

			dtotipo.setIdTipoDeDocumento(poliza.getCliente().getTipodedocumento().getIdTipoDeDocumento());
			dtotipo.setNombre(poliza.getCliente().getTipodedocumento().getNombre());

			dtoCliente.setIdCliente(poliza.getCliente().getIdCliente());
			dtoCliente.setApellido(poliza.getCliente().getApellido());
			dtoCliente.setNombre(poliza.getCliente().getNombre());
			dtoCliente.setTipodedocumento(dtotipo);
			dtoCliente.setNroCliente(poliza.getCliente().getNroCliente());
			dtoCliente.setNroDocumento(poliza.getCliente().getNroDocumento());

			dtorecibo.setIdRecibo(poliza.getCuota().getRecibo().getIdRecibo());
			dtorecibo.setFecha(poliza.getCuota().getRecibo().getFecha());
			dtorecibo.setImporteTotal(poliza.getCuota().getRecibo().getImporteTotal());
			
			dtocuota.setIdCuotas(poliza.getCuota().getIdCuotas());
			dtocuota.setRecibo(dtorecibo);
			dtocuota.setVencimiento(poliza.getCuota().getVencimiento());
			dtocuota.setCuotasPagas(poliza.getCuota().getCuotasPagas());
			dtocuota.setValorOriginal(poliza.getCuota().getValorOriginal());
			dtocuota.setValorPorMora(poliza.getCuota().getValorPorMora());
			dtocuota.setValorTotalaPagar(poliza.getCuota().getValorTotalaPagar());
			dtocuota.setBonificacion(poliza.getCuota().getBonificacion());
			dtocuota.setRecargoPorMora(poliza.getCuota().getRecargoPorMora());
			
			

			dtoformasdepago.setIdFormasDePago(poliza.getFormasdepago().getIdFormasDePago());
			dtoformasdepago.setNombre(poliza.getFormasdepago().getNombre());
			nueva.setCliente(dtoCliente);
			nueva.setNroPoliza(poliza.getNroPoliza());
			nueva.setFechaInicioVigencia(poliza.getFechaInicioVigencia());
			nueva.setFechaFinVigencia(poliza.getFechaFinVigencia());
			nueva.setCantidad(poliza.getCantidad());
			nueva.setSumaAsegurada(poliza.getSumaAsegurada());
		
			nueva.setVehiculo(dtovehiculo);
			nueva.setCuota(dtocuota);
			
			nueva.setFormasdepago(dtoformasdepago);

			session.close();

			return nueva;
	}
	}
}
