package ar.TpDisenio2019.Modelo;
// Generated 06/02/2020 17:41:53 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipodedocumento generated by hbm2java
 */
@Entity
@Table(name = "tipodedocumento", catalog = "dbelaseguradov4")
public class Tipodedocumento implements java.io.Serializable {

	private Integer idTipoDeDocumento;
	private String nombre;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Tipodedocumento() {
	}

	public Tipodedocumento(String nombre, Set<Cliente> clientes) {
		this.nombre = nombre;
		this.clientes = clientes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipodedocumento")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
