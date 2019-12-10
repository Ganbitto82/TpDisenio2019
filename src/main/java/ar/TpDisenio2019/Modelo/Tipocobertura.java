package ar.TpDisenio2019.Modelo;
// Generated 10/12/2019 00:35:33 by Hibernate Tools 4.3.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * Tipocobertura generated by hbm2java
 */
@Entity
@Table(name = "tipocobertura", catalog = "dbelaseguradov4")
public class Tipocobertura  {

	private Integer idTipoCobertura;
	private String tipo;
	private Float porcentaje;
	private String descripcion;
	

	public Tipocobertura() {
	}

	public Tipocobertura(String tipo, Float porcentaje, String descripcion) {
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.descripcion = descripcion;
		
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoCobertura", unique = true, nullable = false)
	public Integer getIdTipoCobertura() {
		return this.idTipoCobertura;
	}

	public void setIdTipoCobertura(Integer idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	@Column(name = "tipo", length = 100)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "descripcion", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



}
