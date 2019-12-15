package ar.TpDisenio2019.Modelo;
// Generated 14/12/2019 22:14:56 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Direccion generated by hbm2java
 */
@Entity
@Table(name = "direccion", catalog = "dbelaseguradov4")
public class Direccion implements java.io.Serializable {

	private Integer idDireccion;
	private Localidad localidad;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String departamento;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Direccion() {
	}

	public Direccion(Localidad localidad, String calle, Integer numero, Integer piso, String departamento,
			Set<Cliente> clientes) {
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.clientes = clientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDireccion", unique = true, nullable = false)
	public Integer getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocalidad")
	public Localidad getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	@Column(name = "calle", length = 50)
	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Column(name = "numero")
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Column(name = "piso")
	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	@Column(name = "departamento", length = 50)
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "direccion")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
