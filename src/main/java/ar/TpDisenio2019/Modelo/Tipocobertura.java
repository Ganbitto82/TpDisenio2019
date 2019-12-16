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
 * Tipocobertura generated by hbm2java
 */
@Entity
@Table(name = "tipocobertura", catalog = "dbelaseguradov4")
public class Tipocobertura implements java.io.Serializable {

	private Integer idTipoCobertura;
	private String tipo;
	private Float porcentaje;
	private String descripcion;
	private Set<Modificacionpoliza> modificacionpolizas = new HashSet<Modificacionpoliza>(0);
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Tipocobertura() {
	}

	public Tipocobertura(String tipo, Float porcentaje, String descripcion, Set<Modificacionpoliza> modificacionpolizas,
			Set<Poliza> polizas) {
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.descripcion = descripcion;
		this.modificacionpolizas = modificacionpolizas;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoCobertura", unique = true, nullable = false)
	public Integer getIdTipoCobertura() {
		return this.idTipoCobertura;
	}

	public void setIdTipoCobertura(Integer idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	@Column(name = "tipo", length = 100)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "descripcion", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipocobertura")
	public Set<Modificacionpoliza> getModificacionpolizas() {
		return this.modificacionpolizas;
	}

	public void setModificacionpolizas(Set<Modificacionpoliza> modificacionpolizas) {
		this.modificacionpolizas = modificacionpolizas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipocobertura")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
