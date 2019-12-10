package ar.TpDisenio2019.DTO;

public class DTOFactoresusados  {

	private int idFacUsados;
	private DTOMedidasdeseguridadporc medidasdeseguridadporc;
	private Float porcentajeCobertura;
	private Float porcentajePorRiesgoDeDomicilio;
	private Float porcentajePorKm;
	private Float porcentajePorModeloVehiculo;
	private Float porcentajePorMedidasDeSeguridad;
	private Float porcentajePorSiniestro;
	private Float porcentajePorHijo;
	private Float importePorDescuentosPagoSemestral;
	private Float descuentoPorUnidad;
	private Float montoTotal;
	private Float prima;

	public DTOFactoresusados() {}
	public DTOFactoresusados(int idFacUsados, Float porcentajeCobertura,
			Float porcentajePorRiesgoDeDomicilio, Float porcentajePorKm, Float porcentajePorModeloVehiculo,
			Float porcentajePorMedidasDeSeguridad, Float porcentajePorSiniestro, Float porcentajePorHijo,
			Float importePorDescuentosPagoSemestral, Float descuentoPorUnidad, Float montoTotal, Float prima) {
		super();
		this.idFacUsados = idFacUsados;
		this.porcentajeCobertura = porcentajeCobertura;
		this.porcentajePorRiesgoDeDomicilio = porcentajePorRiesgoDeDomicilio;
		this.porcentajePorKm = porcentajePorKm;
		this.porcentajePorModeloVehiculo = porcentajePorModeloVehiculo;
		this.porcentajePorMedidasDeSeguridad = porcentajePorMedidasDeSeguridad;
		this.porcentajePorSiniestro = porcentajePorSiniestro;
		this.porcentajePorHijo = porcentajePorHijo;
		this.importePorDescuentosPagoSemestral = importePorDescuentosPagoSemestral;
		this.descuentoPorUnidad = descuentoPorUnidad;
		this.montoTotal = montoTotal;
		this.prima = prima;
	}
	public DTOFactoresusados(int idFacUsados, DTOMedidasdeseguridadporc idMedPorc, Float porcentajeCobertura,
			Float porcentajePorRiesgoDeDomicilio, Float porcentajePorKm, Float porcentajePorModeloVehiculo,
			Float porcentajePorMedidasDeSeguridad, Float porcentajePorSiniestro, Float porcentajePorHijo,
			Float importePorDescuentosPagoSemestral, Float descuentoPorUnidad, Float montoTotal, Float prima) {
		super();
		this.idFacUsados = idFacUsados;
		this.medidasdeseguridadporc = idMedPorc;
		this.porcentajeCobertura = porcentajeCobertura;
		this.porcentajePorRiesgoDeDomicilio = porcentajePorRiesgoDeDomicilio;
		this.porcentajePorKm = porcentajePorKm;
		this.porcentajePorModeloVehiculo = porcentajePorModeloVehiculo;
		this.porcentajePorMedidasDeSeguridad = porcentajePorMedidasDeSeguridad;
		this.porcentajePorSiniestro = porcentajePorSiniestro;
		this.porcentajePorHijo = porcentajePorHijo;
		this.importePorDescuentosPagoSemestral = importePorDescuentosPagoSemestral;
		this.descuentoPorUnidad = descuentoPorUnidad;
		this.montoTotal = montoTotal;
		this.prima = prima;
	}

	
	public int getIdFacUsados() {
		return this.idFacUsados;
	}

	public void setIdFacUsados(int idFacUsados) {
		this.idFacUsados = idFacUsados;
	}


	public DTOMedidasdeseguridadporc getMedidasdeseguridadporc() {
		return medidasdeseguridadporc;
	}

	public void setMedidasdeseguridadporc(DTOMedidasdeseguridadporc medidasdeseguridadporc) {
		this.medidasdeseguridadporc = medidasdeseguridadporc;
	}

	
	public Float getPorcentajeCobertura() {
		return this.porcentajeCobertura;
	}

	public void setPorcentajeCobertura(Float porcentajeCobertura) {
		this.porcentajeCobertura = porcentajeCobertura;
	}

	
	public Float getPorcentajePorRiesgoDeDomicilio() {
		return this.porcentajePorRiesgoDeDomicilio;
	}

	public void setPorcentajePorRiesgoDeDomicilio(Float porcentajePorRiesgoDeDomicilio) {
		this.porcentajePorRiesgoDeDomicilio = porcentajePorRiesgoDeDomicilio;
	}

	
	public Float getPorcentajePorKm() {
		return this.porcentajePorKm;
	}

	public void setPorcentajePorKm(Float porcentajePorKm) {
		this.porcentajePorKm = porcentajePorKm;
	}

	
	public Float getPorcentajePorModeloVehiculo() {
		return this.porcentajePorModeloVehiculo;
	}

	public void setPorcentajePorModeloVehiculo(Float porcentajePorModeloVehiculo) {
		this.porcentajePorModeloVehiculo = porcentajePorModeloVehiculo;
	}

	
	public Float getPorcentajePorMedidasDeSeguridad() {
		return this.porcentajePorMedidasDeSeguridad;
	}

	public void setPorcentajePorMedidasDeSeguridad(Float porcentajePorMedidasDeSeguridad) {
		this.porcentajePorMedidasDeSeguridad = porcentajePorMedidasDeSeguridad;
	}

	
	public Float getPorcentajePorSiniestro() {
		return this.porcentajePorSiniestro;
	}

	public void setPorcentajePorSiniestro(Float porcentajePorSiniestro) {
		this.porcentajePorSiniestro = porcentajePorSiniestro;
	}

	
	public Float getPorcentajePorHijo() {
		return this.porcentajePorHijo;
	}

	public void setPorcentajePorHijo(Float porcentajePorHijo) {
		this.porcentajePorHijo = porcentajePorHijo;
	}

	
	public Float getImportePorDescuentosPagoSemestral() {
		return this.importePorDescuentosPagoSemestral;
	}

	public void setImportePorDescuentosPagoSemestral(Float importePorDescuentosPagoSemestral) {
		this.importePorDescuentosPagoSemestral = importePorDescuentosPagoSemestral;
	}

	
	public Float getDescuentoPorUnidad() {
		return this.descuentoPorUnidad;
	}

	public void setDescuentoPorUnidad(Float descuentoPorUnidad) {
		this.descuentoPorUnidad = descuentoPorUnidad;
	}

	
	public Float getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

	
	public Float getPrima() {
		return this.prima;
	}

	public void setPrima(Float prima) {
		this.prima = prima;
	}

}
