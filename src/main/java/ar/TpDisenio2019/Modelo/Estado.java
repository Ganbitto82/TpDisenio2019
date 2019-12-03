package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name = "estado", catalog = "dbelaseguradov4")
public class Estado  {

	private int idEstado;
	private String tipo;

	public Estado() {
	}

	public Estado(int idEstado) {
		this.idEstado = idEstado;
	}

	public Estado(int idEstado, String tipo) {
		this.idEstado = idEstado;
		this.tipo = tipo;
	}

	@Id

	@Column(name = "idEstado", unique = true, nullable = false)
	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	@Column(name = "tipo", length = 30)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
