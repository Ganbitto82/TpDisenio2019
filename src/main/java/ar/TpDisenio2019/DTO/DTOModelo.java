package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOModelo generated by hbm2java
 */
@Entity
@Table(name = "modelo", catalog = "dbelaseguradov4")
public class DTOModelo  {

	private int idModelo;
	private DTOMarca marca;
	private DTOAniodevehiculo aniodevehiculo;
	private String nombre;
	private Float porcentaje;

	public DTOModelo() {
	}

	public DTOModelo(int idModelo, DTOMarca idMarca) {
		this.idModelo = idModelo;
		this.marca = idMarca;
	}

	public DTOModelo(int idModelo, DTOMarca idMarca, DTOAniodevehiculo idAniodevehiculo, String nombre, Float porcentaje) {
		this.idModelo = idModelo;
		this.marca = idMarca;
		this.aniodevehiculo = idAniodevehiculo;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public DTOMarca getMarca() {
		return marca;
	}

	public void setMarca(DTOMarca marca) {
		this.marca = marca;
	}

	public DTOAniodevehiculo getAniodevehiculo() {
		return aniodevehiculo;
	}

	public void setAniodevehiculo(DTOAniodevehiculo aniodevehiculo) {
		this.aniodevehiculo = aniodevehiculo;
	}

	@Id

	@Column(name = "idModelo", unique = true, nullable = false)
	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
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
