package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vehiculo generated by hbm2java
 */
@Entity
@Table(name = "vehiculo", catalog = "dbelaseguradov4")
public class Vehiculo  {

	private int idVehiculo;
	private Modelo idModelo;
	private String motor;
	private String chasis;
	private Integer anio;
	private String patente;

	public Vehiculo() {
	}

	public Vehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Vehiculo(int idVehiculo, Modelo idModelo, String motor, String chasis, Integer anio, String patente) {
		this.idVehiculo = idVehiculo;
		this.idModelo = idModelo;
		this.motor = motor;
		this.chasis = chasis;
		this.anio = anio;
		this.patente = patente;
	}

	@Id

	@Column(name = "idVehiculo", unique = true, nullable = false)
	public int getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	@Column(name = "idModelo")
	public Modelo getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(Modelo idModelo) {
		this.idModelo = idModelo;
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

	@Column(name = "anio")
	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Column(name = "patente", length = 10)
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}
