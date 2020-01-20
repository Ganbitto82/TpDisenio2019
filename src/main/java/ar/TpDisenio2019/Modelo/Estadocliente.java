package ar.TpDisenio2019.Modelo;
// Generated 19/01/2020 00:05:34 by Hibernate Tools 4.3.5.Final

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
 * DTOEstadocliente generated by hbm2java
 */
@Entity
@Table(name = "estadocliente", catalog = "dbelaseguradov4")
public class Estadocliente implements java.io.Serializable {

	private Integer idEstadoCliente;
	private String tipo;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Estadocliente() {
	}

	public Estadocliente(String tipo, Set<Cliente> clientes) {
		this.tipo = tipo;
		this.clientes = clientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEstadoCliente", unique = true, nullable = false)
	public Integer getIdEstadoCliente() {
		return this.idEstadoCliente;
	}

	public void setIdEstadoCliente(Integer idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	@Column(name = "tipo", length = 30)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadocliente")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
