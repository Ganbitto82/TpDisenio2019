package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOKmporanio generated by hbm2java
 */
@Entity
@Table(name = "kmporanio", catalog = "dbelaseguradov4")
public class DTOKmporanio  {

	private int idKmPorAnio;
	private Float porcentaje;

	public DTOKmporanio() {
	}

	public DTOKmporanio(int idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	public DTOKmporanio(int idKmPorAnio, Float porcentaje) {
		this.idKmPorAnio = idKmPorAnio;
		this.porcentaje = porcentaje;
	}

	@Id

	@Column(name = "idKmPorAnio", unique = true, nullable = false)
	public int getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(int idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
