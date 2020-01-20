package ar.TpDisenio2019.Modelo;
// Generated 19/01/2020 00:05:34 by Hibernate Tools 4.3.5.Final

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
 * DTOCliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "dbelaseguradov4")
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private Condicioniva condicioniva;
	private Direccion direccion;
	private Estadocivil estadocivil;
	private Estadocliente estadocliente;
	private Profesion profesion;
	private Tipodedocumento tipodedocumento;
	private String nombre;
	private String apellido;
	private Integer nroDocumento;
	private String correoElectronico;
	private Date anioDeRegistro;
	private Long nroCuil;
	private Long nroCliente;
	private Set<Poliza> polizas = new HashSet<Poliza>(0);

	public Cliente() {
	}

	public Cliente(Condicioniva condicioniva, Direccion direccion, Estadocivil estadocivil, Estadocliente estadocliente,
			Profesion profesion, Tipodedocumento tipodedocumento, String nombre, String apellido, Integer nroDocumento,
			String correoElectronico, Date anioDeRegistro, Long nroCuil, Long nroCliente, Set<Poliza> polizas) {
		this.condicioniva = condicioniva;
		this.direccion = direccion;
		this.estadocivil = estadocivil;
		this.estadocliente = estadocliente;
		this.profesion = profesion;
		this.tipodedocumento = tipodedocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.correoElectronico = correoElectronico;
		this.anioDeRegistro = anioDeRegistro;
		this.nroCuil = nroCuil;
		this.nroCliente = nroCliente;
		this.polizas = polizas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCliente", unique = true, nullable = false)
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCondicionIVA")
	public Condicioniva getCondicioniva() {
		return this.condicioniva;
	}

	public void setCondicioniva(Condicioniva condicioniva) {
		this.condicioniva = condicioniva;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDireccion")
	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstadoCivil")
	public Estadocivil getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(Estadocivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstadoCliente")
	public Estadocliente getEstadocliente() {
		return this.estadocliente;
	}

	public void setEstadocliente(Estadocliente estadocliente) {
		this.estadocliente = estadocliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProfesion")
	public Profesion getProfesion() {
		return this.profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoDeDocumento")
	public Tipodedocumento getTipodedocumento() {
		return this.tipodedocumento;
	}

	public void setTipodedocumento(Tipodedocumento tipodedocumento) {
		this.tipodedocumento = tipodedocumento;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido", length = 50)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "nroDocumento")
	public Integer getNroDocumento() {
		return this.nroDocumento;
	}

	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	@Column(name = "correoElectronico", length = 50)
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "anioDeRegistro", length = 0)
	public Date getAnioDeRegistro() {
		return this.anioDeRegistro;
	}

	public void setAnioDeRegistro(Date anioDeRegistro) {
		this.anioDeRegistro = anioDeRegistro;
	}

	@Column(name = "nroCuil")
	public Long getNroCuil() {
		return this.nroCuil;
	}

	public void setNroCuil(Long nroCuil) {
		this.nroCuil = nroCuil;
	}

	@Column(name = "nroCliente")
	public Long getNroCliente() {
		return this.nroCliente;
	}

	public void setNroCliente(Long nroCliente) {
		this.nroCliente = nroCliente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Poliza> getPolizas() {
		return this.polizas;
	}

	public void setPolizas(Set<Poliza> polizas) {
		this.polizas = polizas;
	}

}
