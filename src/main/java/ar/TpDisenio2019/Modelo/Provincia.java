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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Provincia generated by hbm2java
 */
@Entity
@Table(name = "provincia", catalog = "dbelaseguradov4")
public class Provincia implements java.io.Serializable {

	private Integer idProvincia;
	private Pais pais;
	private String nombre;
	private Set<Localidad> localidads = new HashSet<Localidad>(0);

	public Provincia() {
	}

	public Provincia(Pais pais, String nombre, Set<Localidad> localidads) {
		this.pais = pais;
		this.nombre = nombre;
		this.localidads = localidads;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idProvincia", unique = true, nullable = false)
	public Integer getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPais")
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provincia")
	public Set<Localidad> getLocalidads() {
		return this.localidads;
	}

	public void setLocalidads(Set<Localidad> localidads) {
		this.localidads = localidads;
	}

}
