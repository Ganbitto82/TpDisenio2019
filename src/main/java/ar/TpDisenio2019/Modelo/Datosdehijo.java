package ar.TpDisenio2019.Modelo;
// Generated 16/12/2019 02:56:06 by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Datosdehijo generated by hbm2java
 */
@Entity
@Table(name = "datosdehijo", catalog = "dbelaseguradov4")
public class Datosdehijo implements java.io.Serializable {

	private Integer idDatosHijo;
	private Estadocivil estadocivil;
	private Date fecha;
	private String sexo;
	private Float porcentaje;
	private Set<Modificacionpoliza> modificacionpolizas = new HashSet<Modificacionpoliza>(0);
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Datosdehijo() {
	}

	public Datosdehijo(Estadocivil estadocivil, Date fecha, String sexo, Float porcentaje,
			Set<Modificacionpoliza> modificacionpolizas, Set<Poliza> polizas) {
		this.estadocivil = estadocivil;
		this.fecha = fecha;
		this.sexo = sexo;
		this.porcentaje = porcentaje;
		this.modificacionpolizas = modificacionpolizas;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDatosHijo", unique = true, nullable = false)
	public Integer getIdDatosHijo() {
		return this.idDatosHijo;
	}

	public void setIdDatosHijo(Integer idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstadoCivil")
	public Estadocivil getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(Estadocivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "sexo", length = 9)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datosdehijo")
	public Set<Modificacionpoliza> getModificacionpolizas() {
		return this.modificacionpolizas;
	}

	public void setModificacionpolizas(Set<Modificacionpoliza> modificacionpolizas) {
		this.modificacionpolizas = modificacionpolizas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datosdehijo")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
