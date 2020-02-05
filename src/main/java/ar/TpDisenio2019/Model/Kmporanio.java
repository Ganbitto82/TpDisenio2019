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
 * Kmporanio generated by hbm2java
 */
@Entity
@Table(name = "kmporanio", catalog = "dbelaseguradov4")
public class Kmporanio implements java.io.Serializable {

	private Integer idKmPorAnio;
	private Float porcentaje;
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Kmporanio() {
	}

	public Kmporanio(Float porcentaje, Set<Poliza> polizas) {
		this.porcentaje = porcentaje;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idKmPorAnio", unique = true, nullable = false)
	public Integer getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(Integer idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kmporanio")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
