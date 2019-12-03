package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Siniestro generated by hbm2java
 */
@Entity
@Table(name = "siniestro", catalog = "dbelaseguradov4")
public class Siniestro {

	private int idSiniestro;
	private Float porcentaje;
	private Integer cantidad;

	public Siniestro() {
	}

	public Siniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public Siniestro(int idSiniestro, Float porcentaje, Integer cantidad) {
		this.idSiniestro = idSiniestro;
		this.porcentaje = porcentaje;
		this.cantidad = cantidad;
	}

	@Id

	@Column(name = "idSiniestro", unique = true, nullable = false)
	public int getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
