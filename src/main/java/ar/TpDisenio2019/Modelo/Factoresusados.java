package ar.TpDisenio2019.Modelo;
// Generated 14/12/2019 22:14:56 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Factoresusados generated by hbm2java
 */
@Entity
@Table(name = "factoresusados", catalog = "dbelaseguradov4")
public class Factoresusados implements java.io.Serializable {

	private int idFacUsados;
	private Medidasdeseguridadporc medidasdeseguridadporc;
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
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Factoresusados() {
	}

	public Factoresusados(int idFacUsados, Medidasdeseguridadporc medidasdeseguridadporc) {
		this.idFacUsados = idFacUsados;
		this.medidasdeseguridadporc = medidasdeseguridadporc;
	}

	public Factoresusados(int idFacUsados, Medidasdeseguridadporc medidasdeseguridadporc, Float porcentajeCobertura,
			Float porcentajePorRiesgoDeDomicilio, Float porcentajePorKm, Float porcentajePorModeloVehiculo,
			Float porcentajePorMedidasDeSeguridad, Float porcentajePorSiniestro, Float porcentajePorHijo,
			Float importePorDescuentosPagoSemestral, Float descuentoPorUnidad, Float montoTotal, Float prima,
			Set<Poliza> polizas) {
		this.idFacUsados = idFacUsados;
		this.medidasdeseguridadporc = medidasdeseguridadporc;
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
		this.polizas = polizas;
	}

	@Id

	@Column(name = "idFacUsados", unique = true, nullable = false)
	public int getIdFacUsados() {
		return this.idFacUsados;
	}

	public void setIdFacUsados(int idFacUsados) {
		this.idFacUsados = idFacUsados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMedPorc", nullable = false)
	public Medidasdeseguridadporc getMedidasdeseguridadporc() {
		return this.medidasdeseguridadporc;
	}

	public void setMedidasdeseguridadporc(Medidasdeseguridadporc medidasdeseguridadporc) {
		this.medidasdeseguridadporc = medidasdeseguridadporc;
	}

	@Column(name = "porcentajeCobertura", precision = 12, scale = 0)
	public Float getPorcentajeCobertura() {
		return this.porcentajeCobertura;
	}

	public void setPorcentajeCobertura(Float porcentajeCobertura) {
		this.porcentajeCobertura = porcentajeCobertura;
	}

	@Column(name = "porcentajePorRiesgoDeDomicilio", precision = 12, scale = 0)
	public Float getPorcentajePorRiesgoDeDomicilio() {
		return this.porcentajePorRiesgoDeDomicilio;
	}

	public void setPorcentajePorRiesgoDeDomicilio(Float porcentajePorRiesgoDeDomicilio) {
		this.porcentajePorRiesgoDeDomicilio = porcentajePorRiesgoDeDomicilio;
	}

	@Column(name = "porcentajePorKm", precision = 12, scale = 0)
	public Float getPorcentajePorKm() {
		return this.porcentajePorKm;
	}

	public void setPorcentajePorKm(Float porcentajePorKm) {
		this.porcentajePorKm = porcentajePorKm;
	}

	@Column(name = "porcentajePorModeloVehiculo", precision = 12, scale = 0)
	public Float getPorcentajePorModeloVehiculo() {
		return this.porcentajePorModeloVehiculo;
	}

	public void setPorcentajePorModeloVehiculo(Float porcentajePorModeloVehiculo) {
		this.porcentajePorModeloVehiculo = porcentajePorModeloVehiculo;
	}

	@Column(name = "porcentajePorMedidasDeSeguridad", precision = 12, scale = 0)
	public Float getPorcentajePorMedidasDeSeguridad() {
		return this.porcentajePorMedidasDeSeguridad;
	}

	public void setPorcentajePorMedidasDeSeguridad(Float porcentajePorMedidasDeSeguridad) {
		this.porcentajePorMedidasDeSeguridad = porcentajePorMedidasDeSeguridad;
	}

	@Column(name = "porcentajePorSiniestro", precision = 12, scale = 0)
	public Float getPorcentajePorSiniestro() {
		return this.porcentajePorSiniestro;
	}

	public void setPorcentajePorSiniestro(Float porcentajePorSiniestro) {
		this.porcentajePorSiniestro = porcentajePorSiniestro;
	}

	@Column(name = "porcentajePorHijo", precision = 12, scale = 0)
	public Float getPorcentajePorHijo() {
		return this.porcentajePorHijo;
	}

	public void setPorcentajePorHijo(Float porcentajePorHijo) {
		this.porcentajePorHijo = porcentajePorHijo;
	}

	@Column(name = "importePorDescuentosPagoSemestral", precision = 12, scale = 0)
	public Float getImportePorDescuentosPagoSemestral() {
		return this.importePorDescuentosPagoSemestral;
	}

	public void setImportePorDescuentosPagoSemestral(Float importePorDescuentosPagoSemestral) {
		this.importePorDescuentosPagoSemestral = importePorDescuentosPagoSemestral;
	}

	@Column(name = "descuentoPorUnidad", precision = 12, scale = 0)
	public Float getDescuentoPorUnidad() {
		return this.descuentoPorUnidad;
	}

	public void setDescuentoPorUnidad(Float descuentoPorUnidad) {
		this.descuentoPorUnidad = descuentoPorUnidad;
	}

	@Column(name = "montoTotal", precision = 12, scale = 0)
	public Float getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Column(name = "prima", precision = 12, scale = 0)
	public Float getPrima() {
		return this.prima;
	}

	public void setPrima(Float prima) {
		this.prima = prima;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "factoresusados")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
