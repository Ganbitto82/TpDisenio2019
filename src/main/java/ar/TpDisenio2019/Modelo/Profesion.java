package ar.TpDisenio2019.Modelo;
// Generated 16/12/2019 02:56:06 by Hibernate Tools 4.3.5.Final

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
 * Profesion generated by hbm2java
 */
@Entity
@Table(name = "profesion", catalog = "dbelaseguradov4")
public class Profesion implements java.io.Serializable {

	private Integer idProfesion;
	private String nombre;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Profesion() {
	}

	public Profesion(String nombre, Set<Cliente> clientes) {
		this.nombre = nombre;
		this.clientes = clientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idProfesion", unique = true, nullable = false)
	public Integer getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(Integer idProfesion) {
		this.idProfesion = idProfesion;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesion")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
