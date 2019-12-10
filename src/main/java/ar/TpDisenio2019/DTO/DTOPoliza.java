package ar.TpDisenio2019.DTO;

import java.util.Date;

public class DTOPoliza  {

	private int identNroPoliza;
	private DTOCliente cliente;
	private DTOKmporanio kmporanio;
	private DTOMedidasdeseguridad medidasdeseguridad;
	private DTOEstado  estado;
	private DTOEstadocliente estadoCliente;
	private DTONumeropoliza nroPoliza;
	private DTOVehiculo vehiculo;
	private DTOParametrosgenerales parametrosgenerales;
	private DTOFormasdepago formasdepago;
	private DTOTipocobertura tipoCobertura;
	private DTOCuota cuota;
	private DTODatosdehijo datosdehijo;
	private DTOFactoresusados factoresusados;
	private DTOSiniestro siniestro;
	private Date fechaInicioVigencia;
	private Date fechaFinVigencia;
	private Float sumaAsegurada;
	private Character nroSiniestro;
	private Integer cantidad;
	public DTOPoliza() {}
	public DTOPoliza(int identNroPoliza, Date fechaInicioVigencia, Date fechaFinVigencia, Float sumaAsegurada, Character nroSiniestro,
			Integer cantidad) {
		super();
		this.identNroPoliza = identNroPoliza;
		this.fechaInicioVigencia = fechaInicioVigencia;
		this.fechaFinVigencia = fechaFinVigencia;
		this.sumaAsegurada = sumaAsegurada;
		this.nroSiniestro = nroSiniestro;
		this.cantidad = cantidad;
	}
	
	public DTOPoliza(int identNroPoliza, DTOCliente cliente, DTOKmporanio kmporanio, DTOMedidasdeseguridad medidasdeseguridad,
			DTOEstado estado, DTOEstadocliente estadoCliente, DTONumeropoliza nroPoliza, DTOVehiculo vehiculo,
			DTOParametrosgenerales parametrosgenerales, DTOFormasdepago idFormasDePago, DTOTipocobertura tipoCobertura,
			DTOCuota cuota, DTODatosdehijo datosdehijo, DTOFactoresusados factoresusados, DTOSiniestro siniestro,
			Date fechaInicioVigencia, Date fechaFinVigencia, Float sumaAsegurada, Character nroSiniestro,
			Integer cantidad) {
		super();
		this.identNroPoliza = identNroPoliza;
		this.cliente = cliente;
		this.kmporanio = kmporanio;
		this.medidasdeseguridad = medidasdeseguridad;
		this.estado = estado;
		this.estadoCliente = estadoCliente;
		this.nroPoliza = nroPoliza;
		this.vehiculo = vehiculo;
		this.parametrosgenerales = parametrosgenerales;
		this.formasdepago = idFormasDePago;
		this.tipoCobertura = tipoCobertura;
		this.cuota = cuota;
		this.datosdehijo = datosdehijo;
		this.factoresusados = factoresusados;
		this.siniestro = siniestro;
		this.fechaInicioVigencia = fechaInicioVigencia;
		this.fechaFinVigencia = fechaFinVigencia;
		this.sumaAsegurada = sumaAsegurada;
		this.nroSiniestro = nroSiniestro;
		this.cantidad = cantidad;
	}

	
	public DTOCliente getCliente() {
		return cliente;
	}

	public void setCliente(DTOCliente cliente) {
		this.cliente = cliente;
	}

	public DTOKmporanio getKmporanio() {
		return kmporanio;
	}

	public void setKmporanio(DTOKmporanio kmporanio) {
		this.kmporanio = kmporanio;
	}

	public DTOMedidasdeseguridad getMedidasdeseguridad() {
		return medidasdeseguridad;
	}

	public void setMedidasdeseguridad(DTOMedidasdeseguridad medidasdeseguridad) {
		this.medidasdeseguridad = medidasdeseguridad;
	}

	public DTOEstado getEstado() {
		return estado;
	}

	public void setEstado(DTOEstado estado) {
		this.estado = estado;
	}

	public DTOEstadocliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(DTOEstadocliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public DTOVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(DTOVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public DTOParametrosgenerales getParametrosgenerales() {
		return parametrosgenerales;
	}

	public void setParametrosgenerales(DTOParametrosgenerales parametrosgenerales) {
		this.parametrosgenerales = parametrosgenerales;
	}

	public DTOTipocobertura getTipoCobertura() {
		return tipoCobertura;
	}

	public void setTipoCobertura(DTOTipocobertura tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}

	public DTOCuota getCuota() {
		return cuota;
	}

	public void setCuota(DTOCuota cuota) {
		this.cuota = cuota;
	}

	public DTODatosdehijo getDatosdehijo() {
		return datosdehijo;
	}

	public void setDatosdehijo(DTODatosdehijo datosdehijo) {
		this.datosdehijo = datosdehijo;
	}

	public DTOFactoresusados getFactoresusados() {
		return factoresusados;
	}

	public void setFactoresusados(DTOFactoresusados factoresusados) {
		this.factoresusados = factoresusados;
	}

	public DTOSiniestro getSiniestro() {
		return siniestro;
	}

	public void setSiniestro(DTOSiniestro siniestro) {
		this.siniestro = siniestro;
	}

	public void setNroPoliza(DTONumeropoliza nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public void setIdFormasDePago(DTOFormasdepago idFormasDePago) {
		this.formasdepago = idFormasDePago;
	}

	public DTOFormasdepago getFormasdepago() {
		return formasdepago;
	}

	public void setFormasdepago(DTOFormasdepago formasdepago) {
		this.formasdepago = formasdepago;
	}

	public DTONumeropoliza getNroPoliza() {
		return nroPoliza;
	}

	
	public int getIdentNroPoliza() {
		return this.identNroPoliza;
	}

	public void setIdentNroPoliza(int identNroPoliza) {
		this.identNroPoliza = identNroPoliza;
	}
	public Date getFechaInicioVigencia() {
		return this.fechaInicioVigencia;
	}

	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}

	
	public Date getFechaFinVigencia() {
		return this.fechaFinVigencia;
	}

	public void setFechaFinVigencia(Date fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}

	
	public Float getSumaAsegurada() {
		return this.sumaAsegurada;
	}

	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	
	public Character getNroSiniestro() {
		return this.nroSiniestro;
	}

	public void setNroSiniestro(Character nroSiniestro) {
		this.nroSiniestro = nroSiniestro;
	}

	
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
