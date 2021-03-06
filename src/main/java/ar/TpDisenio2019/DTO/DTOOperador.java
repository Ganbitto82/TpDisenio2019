package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOperador generated by hbm2java
 */
@Entity
@Table(name = "operador", catalog = "dbelaseguradov4")
public class DTOOperador {

	private int idOperador;
	private String nombre;

	public DTOOperador() {
	}

	public DTOOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public DTOOperador(int idOperador, String nombre) {
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
