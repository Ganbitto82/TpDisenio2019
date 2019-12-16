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
 * Localidad generated by hbm2java
 */
@Entity
@Table(name = "localidad", catalog = "dbelaseguradov4")
public class Localidad implements java.io.Serializable {

	private Integer idLocalidad;
	private Provincia provincia;
	private String nombre;
	private Set<Direccion> direccions = new HashSet<Direccion>(0);

	public Localidad() {
	}

	public Localidad(Provincia provincia, String nombre, Set<Direccion> direccions) {
		this.provincia = provincia;
		this.nombre = nombre;
		this.direccions = direccions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLocalidad", unique = true, nullable = false)
	public Integer getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProvincia")
	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localidad")
	public Set<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(Set<Direccion> direccions) {
		this.direccions = direccions;
	}

}
