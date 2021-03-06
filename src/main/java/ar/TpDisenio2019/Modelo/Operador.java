package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Operador generated by hbm2java
 */
@Entity
@Table(name = "operador", catalog = "dbelaseguradov4")
public class Operador {

	private int idOperador;
	private String nombre;

	public Operador() {
	}

	public Operador(int idOperador) {
		this.idOperador = idOperador;
	}

	public Operador(int idOperador, String nombre) {
		this.idOperador = idOperador;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idOperador", unique = true, nullable = false)
	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
