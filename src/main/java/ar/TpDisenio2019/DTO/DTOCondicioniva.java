package ar.TpDisenio2019.DTO;
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
 * DTOCondicioniva generated by hbm2java
 */
@Entity
@Table(name = "condicioniva", catalog = "dbelaseguradov4")
public class DTOCondicioniva implements java.io.Serializable {

	private Integer idCondicionIva;
	private String nombre;
	private Set<DTOCliente> dTOClientes = new HashSet<DTOCliente>(0);

	public DTOCondicioniva() {
	}

	public DTOCondicioniva(String nombre, Set<DTOCliente> dTOClientes) {
		this.nombre = nombre;
		this.dTOClientes = dTOClientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCondicionIVA", unique = true, nullable = false)
	public Integer getIdCondicionIva() {
		return this.idCondicionIva;
	}

	public void setIdCondicionIva(Integer idCondicionIva) {
		this.idCondicionIva = idCondicionIva;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "condicioniva")
	public Set<DTOCliente> getClientes() {
		return this.dTOClientes;
	}

	public void setClientes(Set<DTOCliente> dTOClientes) {
		this.dTOClientes = dTOClientes;
	}

}
