package ar.TpDisenio2019.Model;
// Generated 5/02/2020 07:38:19 PM by Hibernate Tools 4.3.5.Final

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
 * Estadocivil generated by hbm2java
 */
@Entity
@Table(name = "estadocivil", catalog = "dbelaseguradov4")
public class Estadocivil implements java.io.Serializable {

	private Integer idEstadoCivil;
	private String nombre;
	private Set<Datosdehijo> datosdehijos = new HashSet<Datosdehijo>(0);
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Estadocivil() {
	}

	public Estadocivil(String nombre, Set<Datosdehijo> datosdehijos, Set<Cliente> clientes) {
		this.nombre = nombre;
		this.datosdehijos = datosdehijos;
		this.clientes = clientes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadocivil")
	public Set<Datosdehijo> getDatosdehijos() {
		return this.datosdehijos;
	}

	public void setDatosdehijos(Set<Datosdehijo> datosdehijos) {
		this.datosdehijos = datosdehijos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadocivil")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
