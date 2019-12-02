package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOProfesion generated by hbm2java
 */
@Entity
@Table(name = "profesion", catalog = "dbelaseguradov4")
public class Profesion  {

	private int idProfesion;
	private String nombre;

	public Profesion() {
	}

	public Profesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	public Profesion(int idProfesion, String nombre) {
		this.idProfesion = idProfesion;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idProfesion", unique = true, nullable = false)
	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
