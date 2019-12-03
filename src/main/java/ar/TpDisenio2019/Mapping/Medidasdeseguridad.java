package ar.TpDisenio2019.Mapping;
// Generated 3/12/2019 08:29:13 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Medidasdeseguridad generated by hbm2java
 */
@Entity
@Table(name = "medidasdeseguridad", catalog = "dbelaseguradov4")
public class Medidasdeseguridad  {

	private int idMedidasSeguridad;
	private int idMedPorc;
	private String nombre;
	private Float porcentaje;

	public Medidasdeseguridad() {
	}

	public Medidasdeseguridad(int idMedidasSeguridad, int idMedPorc) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.idMedPorc = idMedPorc;
	}

	public Medidasdeseguridad(int idMedidasSeguridad, int idMedPorc, String nombre, Float porcentaje) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.idMedPorc = idMedPorc;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	@Id

	@Column(name = "idMedidasSeguridad", unique = true, nullable = false)
	public int getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(int idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	@Column(name = "idMedPorc", nullable = false)
	public int getIdMedPorc() {
		return this.idMedPorc;
	}

	public void setIdMedPorc(int idMedPorc) {
		this.idMedPorc = idMedPorc;
	}

	@Column(name = "nombre", length = 50)
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
