package ar.TpDisenio2019.Controladores;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOMedidasdeseguridad;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Modelo.Cuota;
import ar.TpDisenio2019.Modelo.Datosdehijo;
import ar.TpDisenio2019.Modelo.Factoresusados;
import ar.TpDisenio2019.Modelo.Kmporanio;
import ar.TpDisenio2019.Modelo.Medidasdeseguridad;
import ar.TpDisenio2019.Modelo.Medidasdeseguridadporc;
import ar.TpDisenio2019.Modelo.Modificacionpoliza;
import ar.TpDisenio2019.Modelo.Parametrosgenerales;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.Modelo.Poliza;
import ar.TpDisenio2019.Modelo.Vehiculo;
import ar.TpDisenio2019.Utilitario.Fechas;

public class GestorPoliza {

	static GestorCliente gestorCliente;

	static GestorBDPoliza gestionPoliza = new GestorBDPoliza();

	public static List<DTOCliente> buscarDtoscliente() {
		return GestorCliente.buscarDtoscliente();
	}

	public static void agregarDtosHijos(DTOPoliza dtoPoliza, List<DTODatosdehijo> listaDtosHijos) {
		for(DTODatosdehijo tipo : listaDtosHijos) {
		//for (int i = 0; i < listaDtosHijos.size(); i++) {
			//dtoPoliza.setDatosdehijo(listaDtosHijos.get(i));
			dtoPoliza.setDatosdehijo(tipo);
		}
	}

	public static DTOEstadocivil buscarEstadoCivilPorNombre(String nombre) {
		List<DTOEstadocivil> listaEstadoCivil = GestorCliente.buscarDtosEstadoCivil();
		for (int i = 0; i < listaEstadoCivil.size(); i++) {
			if (nombre.equals(listaEstadoCivil.get(i).getNombre())) {
				return listaEstadoCivil.get(i); /* Retorna un elemento de la lista de DTOEstado Civil */
			}
		}
		return null;

	}

	public static Boolean validarElementosHijos(List<DTODatosdehijo> listaDtosHijos) {

		if (!listaDtosHijos.isEmpty()) {
			int i = 0;
			for (DTODatosdehijo hijo : listaDtosHijos) {
				try {
					hijo.getFecha();
					hijo.getSexo().toString();
					hijo.getEstadocivil().toString();

				} catch (Exception e) {

					listaDtosHijos.remove(i);
					return false;
				}
				i++;
			}
		}
		return true;
	}

	public static boolean validarFechaHijo(java.util.Date fechaNacimiento) {
		System.out.println("\nSi la fecha de Nacimiento es " + fechaNacimiento.toString() + "la edad es: "
				+ Fechas.obtenerEdad((Date) fechaNacimiento));
		if ((Fechas.obtenerEdad((Date) fechaNacimiento) > 17) && (Fechas.obtenerEdad((Date) fechaNacimiento) < 31))
			return true;
		else
			return false;
	}
	
	public static DTOMedidasdeseguridad buscarMedidaSeguridadPorNombre(String nombre) {
		List<DTOMedidasdeseguridad> listaMedidaDeSeguridad = GestorPoliza.buscarDtosMedidasdeseguridad();
		for(DTOMedidasdeseguridad tipo : listaMedidaDeSeguridad) {
			if (nombre.equals(tipo.getNombre().toString())) {
				return tipo; /* Retorna un elemento de la lista de Medidasdeseguridad */
			}
		}
		return null;
	}
	
	public static List<DTOMedidasdeseguridad> buscarDtosMedidasdeseguridad() {
		List<DTOMedidasdeseguridad> dtoMedidasdeseguridad = new ArrayList<DTOMedidasdeseguridad>();
		List<Medidasdeseguridad> lista = gestionPoliza.obtenerListaMedidasdeseguridad();
		for (int i = 0; i < lista.size(); i++) {
			DTOMedidasdeseguridad dtoAux = new DTOMedidasdeseguridad();
			dtoAux.setIdMedidasSeguridad(lista.get(i).getIdMedidasSeguridad().intValue());
			dtoAux.setNombre(lista.get(i).getNombre().toString());
			dtoMedidasdeseguridad.add(dtoAux);
		}

		return dtoMedidasdeseguridad;
	}

/*
	public static void guardarVehiculo(Vehiculo vehiculo) {
		GestorBDPoliza.guardarVehiculoAux(vehiculo);
	}

	public static void guardarPoliza(Poliza poliza) {
		GestorBDPoliza.guardarPolizaAux(poliza);
	}
*/
	public static DTOPoliza buscarPoliza(Long numPoliza) {
		return GestorBDPoliza.BuscarPoliza(numPoliza);

	}

	public static DTOCuota buscarPorId(int idCuota) {

		return GestorBDPoliza.buscarPorId(idCuota);

	}
	public static void guardarRecibo(DTORecibo dtoRecibo) {
		GestorBDPoliza.guardarRecibo(dtoRecibo);
	}
	
	public static void guardarCuota(DTOCuota dtocuota) {
		GestorBDPoliza.guardarDTOCuota(dtocuota);	
	}
	
	public static void guardarVehiculo(Vehiculo vehiculo) {
		GestorBDPoliza.guardarVehiculoAux(vehiculo);
	}
	
	public static void guardarPoliza(Poliza poliza) {
		GestorBDPoliza.guardarPolizaAux(poliza);
	}
	
	public static void guardarKm(Kmporanio km) {
		GestorBDPoliza.guardarKmAux(km);
	}
	
	public static void guardarCuota(Cuota cuota) {
		GestorBDPoliza.guardarCuotaAux(cuota);
	}
	
	public static void guardarFactores(Factoresusados f) {
		GestorBDPoliza.guardarFactoresAux(f);
	}
	
	public static void guardarParametros(Parametrosgenerales parametros) {
		GestorBDPoliza.guardarParametrosAux(parametros);
	}
	public static void guardarModificacionDePoliza(Modificacionpoliza modificacionPoliza) {
		GestorBDPoliza.guardarModificacionDePolizaAux(modificacionPoliza);
	}
	
	public static void guardarMedidasPorc(Medidasdeseguridadporc medidas) {
		GestorBDPoliza.guardarMedidasPorcAux(medidas);
	}
/*	
	public static void guardarHijos(Datosdehijo hijos) {
		GestorBDPoliza.guardarHijosAux(hijos);
	}
*/	
	public static DTOSiniestro buscarPorCantidad(String cant) {
		return GestorBDPoliza.BuscarSiniestro(cant);
	}
	
	public static DTOFormasdepago buscarPorTipo(String tipo) {
		return GestorBDPoliza.BuscarFormasdepago(tipo);
	}
	
	public static DTOTipocobertura buscarPorTipodecobertura(String tipo) {
		return GestorBDPoliza.BuscarTipocobertura(tipo);
	}

}
