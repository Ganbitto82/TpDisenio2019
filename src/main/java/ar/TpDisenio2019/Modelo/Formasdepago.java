package ar.TpDisenio2019.Modelo;
// Generated 10/12/2019 00:35:33 by Hibernate Tools 4.3.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * Formasdepago generated by hbm2java
 */
@Entity
@Table(name = "formasdepago", catalog = "dbelaseguradov4")
public class Formasdepago  {

	private Integer idFormasDePago;
	private String nombre;
	

	public Formasdepago() {
	}

	public Formasdepago(String nombre) {
		this.nombre = nombre;

	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idFormasDePago", unique = true, nullable = false)
	public Integer getIdFormasDePago() {
		return this.idFormasDePago;
	}

	public void setIdFormasDePago(Integer idFormasDePago) {
		this.idFormasDePago = idFormasDePago;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
