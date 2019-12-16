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
 * Formasdepago generated by hbm2java
 */
@Entity
@Table(name = "formasdepago", catalog = "dbelaseguradov4")
public class Formasdepago implements java.io.Serializable {

	private Integer idFormasDePago;
	private String nombre;
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Formasdepago() {
	}

	public Formasdepago(String nombre, Set<Poliza> polizas) {
		this.nombre = nombre;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idFormasDePago", unique = true, nullable = false)
	public Integer getIdFormasDePago() {
		return this.idFormasDePago;
	}

	public void setIdFormasDePago(Integer idFormasDePago) {
		this.idFormasDePago = idFormasDePago;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formasdepago")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
