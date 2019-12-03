package ar.TpDisenio2019.Mapping;
// Generated 3/12/2019 08:29:13 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Marca generated by hbm2java
 */
@Entity
@Table(name = "marca", catalog = "dbelaseguradov4")
public class Marca  {

	private int idMarca;
	private String marca;

	public Marca() {
	}

	public Marca(int idMarca) {
		this.idMarca = idMarca;
	}

	public Marca(int idMarca, String marca) {
		this.idMarca = idMarca;
		this.marca = marca;
	}

	@Id

	@Column(name = "idMarca", unique = true, nullable = false)
	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	@Column(name = "marca", length = 50)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
