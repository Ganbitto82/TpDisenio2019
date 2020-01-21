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
 * DTOSiniestro generated by hbm2java
 */
@Entity
@Table(name = "siniestro", catalog = "dbelaseguradov4")
public class Siniestro implements java.io.Serializable {

	private Integer idSiniestro;
	private Float porcentaje;
	private String cantidad;
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Siniestro() {
	}

	public Siniestro(Float porcentaje, String cantidad, Set<Poliza> polizas) {
		this.porcentaje = porcentaje;
		this.cantidad = cantidad;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idSiniestro", unique = true, nullable = false)
	public Integer getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(Integer idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "cantidad")
	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "siniestro")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
