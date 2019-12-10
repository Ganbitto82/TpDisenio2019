package ar.TpDisenio2019.DTO;

import java.util.Date;

public class DTOModificacionpoliza  {

	private int idModificacionPoliza;
	private DTOVehiculo vehiculo;
	private DTOMedidasdeseguridad medidasdeseguridad;
	private DTODatosdehijo datosdehijo;
	private DTOTipocobertura tipocobertura;
	private DTOPoliza poliza;
	private Date anio;
	private String patente;
	private String motor;
	private String chasis;
	private String nroSiniestro;
	private Integer kmPorAnio;
	private Float montoTotal;

	public DTOModificacionpoliza() {}
	
	public DTOModificacionpoliza(int idModificacionPoliza,  Date anio, String patente, String motor, String chasis,
			String nroSiniestro, Integer kmPorAnio, Float montoTotal) {
		super();
		this.idModificacionPoliza = idModificacionPoliza;
		this.anio = anio;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.nroSiniestro = nroSiniestro;
		this.kmPorAnio = kmPorAnio;
		this.montoTotal = montoTotal;
	}

	public DTOModificacionpoliza(int idModificacionPoliza, DTOVehiculo idVehiculo, DTOMedidasdeseguridad idMedidasSeguridad, DTODatosdehijo idDatosHijo,
			DTOTipocobertura idTipoCobertura, DTOPoliza identNroPoliza, Date anio, String patente, String motor, String chasis,
			String nroSiniestro, Integer kmPorAnio, Float montoTotal) {
		this.idModificacionPoliza = idModificacionPoliza;
		this.vehiculo = idVehiculo;
		this.medidasdeseguridad = idMedidasSeguridad;
		this.datosdehijo = idDatosHijo;
		this.tipocobertura = idTipoCobertura;
		this.poliza = identNroPoliza;
		this.anio = anio;
		this.patente = patente;
		this.motor = motor;
		this.chasis = chasis;
		this.nroSiniestro = nroSiniestro;
		this.kmPorAnio = kmPorAnio;
		this.montoTotal = montoTotal;
	}

	
	public int getIdModificacionPoliza() {
		return this.idModificacionPoliza;
	}

	public void setIdModificacionPoliza(int idModificacionPoliza) {
		this.idModificacionPoliza = idModificacionPoliza;
	}

	
	
	public DTOVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(DTOVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public DTOMedidasdeseguridad getMedidasdeseguridad() {
		return medidasdeseguridad;
	}

	public void setMedidasdeseguridad(DTOMedidasdeseguridad medidasdeseguridad) {
		this.medidasdeseguridad = medidasdeseguridad;
	}

	public DTODatosdehijo getDatosdehijo() {
		return datosdehijo;
	}

	public void setDatosdehijo(DTODatosdehijo datosdehijo) {
		this.datosdehijo = datosdehijo;
	}

	public DTOTipocobertura getTipocobertura() {
		return tipocobertura;
	}

	public void setTipocobertura(DTOTipocobertura tipocobertura) {
		this.tipocobertura = tipocobertura;
	}

	public DTOPoliza getPoliza() {
		return poliza;
	}

	public void setPoliza(DTOPoliza poliza) {
		this.poliza = poliza;
	}
	
	public Date getAnio() {
		return this.anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	
	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	
	public String getNroSiniestro() {
		return this.nroSiniestro;
	}

	public void setNroSiniestro(String nroSiniestro) {
		this.nroSiniestro = nroSiniestro;
	}

	
	public Integer getKmPorAnio() {
		return this.kmPorAnio;
	}

	public void setKmPorAnio(Integer kmPorAnio) {
		this.kmPorAnio = kmPorAnio;
	}

	
	public Float getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

}
