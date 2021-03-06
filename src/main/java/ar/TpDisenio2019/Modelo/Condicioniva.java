package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Condicioniva generated by hbm2java
 */
@Entity
@Table(name = "condicioniva", catalog = "dbelaseguradov4")
public class Condicioniva  {

	private int idCondicionIva;
	private String nombre;

	public Condicioniva() {
	}

	public Condicioniva(int idCondicionIva) {
		this.idCondicionIva = idCondicionIva;
	}

	public Condicioniva(int idCondicionIva, String nombre) {
		this.idCondicionIva = idCondicionIva;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idCondicionIva", unique = true, nullable = false)
	public int getIdCondicionIva() {
		return this.idCondicionIva;
	}

	public void setIdCondicionIva(int idCondicionIva) {
		this.idCondicionIva = idCondicionIva;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
