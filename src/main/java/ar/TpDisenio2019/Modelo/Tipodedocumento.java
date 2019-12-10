package ar.TpDisenio2019.Modelo;
// Generated 10/12/2019 00:35:33 by Hibernate Tools 4.3.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * Tipodedocumento generated by hbm2java
 */
@Entity
@Table(name = "tipodedocumento", catalog = "dbelaseguradov4")
public class Tipodedocumento  {

	private Integer idTipoDeDocumento;
	private String nombre;


	public Tipodedocumento() {
	}

	public Tipodedocumento(String nombre) {
		this.nombre = nombre;
	
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoDeDocumento", unique = true, nullable = false)
	public Integer getIdTipoDeDocumento() {
		return this.idTipoDeDocumento;
	}

	public void setIdTipoDeDocumento(Integer idTipoDeDocumento) {
		this.idTipoDeDocumento = idTipoDeDocumento;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
