package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DTOModificacionpoliza generated by hbm2java
 */
@Entity
@Table(name = "modificacionpoliza", catalog = "dbelaseguradov4")
public class Modificacionpoliza  {

	private int idModificacionPoliza;
	private Vehiculo vehiculo;
	private Medidasdeseguridad medidasdeseguridad;
	private Datosdehijo datosdehijo;
	private Tipocobertura tipocobertura;
	private Poliza poliza;
	private Date anio;
	private String patente;
	private String motor;
	private String chasis;
	private String nroSiniestro;
	private Integer kmPorAnio;
	private Float montoTotal;

	public Modificacionpoliza() {
	}

	public Modificacionpoliza(int idModificacionPoliza, Vehiculo idVehiculo, Medidasdeseguridad idMedidasSeguridad, Datosdehijo idDatosHijo,
			Tipocobertura idTipoCobertura, Poliza identNroPoliza) {
		this.idModificacionPoliza = idModificacionPoliza;
		this.vehiculo = idVehiculo;
		this.medidasdeseguridad = idMedidasSeguridad;
		this.datosdehijo = idDatosHijo;
		this.tipocobertura = idTipoCobertura;
		this.poliza = identNroPoliza;
	}

	public Modificacionpoliza(int idModificacionPoliza, Vehiculo idVehiculo, Medidasdeseguridad idMedidasSeguridad, Datosdehijo idDatosHijo,
			Tipocobertura idTipoCobertura, Poliza identNroPoliza, Date anio, String patente, String motor, String chasis,
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

	@Id

	@Column(name = "idModificacionPoliza", unique = true, nullable = false)
	public int getIdModificacionPoliza() {
		return this.idModificacionPoliza;
	}

	public void setIdModificacionPoliza(int idModificacionPoliza) {
		this.idModificacionPoliza = idModificacionPoliza;
	}

	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Medidasdeseguridad getMedidasdeseguridad() {
		return medidasdeseguridad;
	}

	public void setMedidasdeseguridad(Medidasdeseguridad medidasdeseguridad) {
		this.medidasdeseguridad = medidasdeseguridad;
	}

	public Datosdehijo getDatosdehijo() {
		return datosdehijo;
	}

	public void setDatosdehijo(Datosdehijo datosdehijo) {
		this.datosdehijo = datosdehijo;
	}

	public Tipocobertura getTipocobertura() {
		return tipocobertura;
	}

	public void setTipocobertura(Tipocobertura tipocobertura) {
		this.tipocobertura = tipocobertura;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}



	@Temporal(TemporalType.DATE)
	@Column(name = "anio", length = 0)
	public Date getAnio() {
		return this.anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	@Column(name = "patente", length = 10)
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	@Column(name = "motor", length = 20)
	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Column(name = "chasis", length = 20)
	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	@Column(name = "nroSiniestro", length = 10)
	public String getNroSiniestro() {
		return this.nroSiniestro;
	}

	public void setNroSiniestro(String nroSiniestro) {
		this.nroSiniestro = nroSiniestro;
	}

	@Column(name = "kmPorAnio")
	public Integer getKmPorAnio() {
		return this.kmPorAnio;
	}

	public void setKmPorAnio(Integer kmPorAnio) {
		this.kmPorAnio = kmPorAnio;
	}

	@Column(name = "montoTotal", precision = 12, scale = 0)
	public Float getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

}
