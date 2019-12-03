package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo generated by hbm2java
 */
@Entity
@Table(name = "modelo", catalog = "dbelaseguradov4")
public class Modelo  {

	private int idModelo;
	private Marca idMarca;
	private Aniodevehiculo idAnioDeVehiculo;
	private String nombre;
	private Float porcentaje;

	public Modelo() {
	}

	public Modelo(int idModelo, Marca idMarca) {
		this.idModelo = idModelo;
		this.idMarca = idMarca;
	}

	public Modelo(int idModelo, Marca idMarca, Aniodevehiculo idAnioDeVehiculo, String nombre, Float porcentaje) {
		this.idModelo = idModelo;
		this.idMarca = idMarca;
		this.idAnioDeVehiculo = idAnioDeVehiculo;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	@Id

	@Column(name = "idModelo", unique = true, nullable = false)
	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name = "idMarca", nullable = false)
	public Marca getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(Marca idMarca) {
		this.idMarca = idMarca;
	}

	@Column(name = "idAnioDeVehiculo")
	public Aniodevehiculo getIdAnioDeVehiculo() {
		return this.idAnioDeVehiculo;
	}

	public void setIdAnioDeVehiculo(Aniodevehiculo idAnioDeVehiculo) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}

	@Column(name = "nombre", length = 40)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
