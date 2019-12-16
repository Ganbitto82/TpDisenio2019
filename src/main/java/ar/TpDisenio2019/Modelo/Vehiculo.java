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
 * Vehiculo generated by hbm2java
 */
@Entity
@Table(name = "vehiculo", catalog = "dbelaseguradov4")
public class Vehiculo implements java.io.Serializable {

	private Integer idVehiculo;
	private Modelo modelo;
	private String motor;
	private String chasis;
	private Integer anio;
	private String patente;
	private Set<Modificacionpoliza> modificacionpolizas = new HashSet<Modificacionpoliza>(0);
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Vehiculo() {
	}

	public Vehiculo(Modelo modelo, String motor, String chasis, Integer anio, String patente,
			Set<Modificacionpoliza> modificacionpolizas, Set<Poliza> polizas) {
		this.modelo = modelo;
		this.motor = motor;
		this.chasis = chasis;
		this.anio = anio;
		this.patente = patente;
		this.modificacionpolizas = modificacionpolizas;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idVehiculo", unique = true, nullable = false)
	public Integer getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo")
	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Column(name = "motor", length = 20)
	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Column(name = "chasis", length = 20)
	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	@Column(name = "anio")
	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Column(name = "patente", length = 10)
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<Modificacionpoliza> getModificacionpolizas() {
		return this.modificacionpolizas;
	}

	public void setModificacionpolizas(Set<Modificacionpoliza> modificacionpolizas) {
		this.modificacionpolizas = modificacionpolizas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
