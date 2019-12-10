package ar.TpDisenio2019.Modelo;
// Generated 10/12/2019 00:35:33 by Hibernate Tools 4.3.5.Final



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * Estadocivil generated by hbm2java
 */
@Entity
@Table(name = "estadocivil", catalog = "dbelaseguradov4")
public class Estadocivil  {

	private Integer idEstadoCivil;
	private String nombre;


	public Estadocivil() {
	}

	public Estadocivil(String nombre) {
		this.nombre = nombre;
	
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEstadoCivil", unique = true, nullable = false)
	public Integer getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
