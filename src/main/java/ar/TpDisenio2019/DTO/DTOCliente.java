package ar.TpDisenio2019.DTO;


import java.util.Date;



public class DTOCliente {

	private int idCliente;
	private DTOEstadocivil estadoCivil;
	private DTOProfesion profesion;
	private DTODireccion direccion;
	private DTOCondicioniva condicionIva;
	private DTOTipodedocumento tipodedocumento;
	private DTOEstadocliente estadoCliente;
	private String nombre;
	private String apellido;
	private Integer nroDocumento;
	private String correoElectronico;
	private Date anioDeRegistro;
	private Integer nroCuil;
	private Integer nroCliente;
	
	public DTOCliente() {}

	public DTOCliente(int idCliente, Integer nroCliente ,String nombre, String apellido,Integer nroDocumento,DTOTipodedocumento tipo) {
		super();
		this.idCliente = idCliente;
		this.nroCliente = nroCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.tipodedocumento=tipo;
		
		
	}
	
	public DTOCliente(int idCliente, DTOEstadocivil idEstadoCivil, DTOProfesion idProfesion, DTODireccion idDireccion,
			DTOCondicioniva idCondicionIva, DTOTipodedocumento idTipoDeDocumento, DTOEstadocliente idEstadoCliente, String nombre, String apellido,
			Integer nroDocumento, String correoElectronico, Date anioDeRegistro, Integer nroCuil, Integer nroCliente) {
		super();
		this.idCliente = idCliente;
		this.estadoCivil = idEstadoCivil;
		this.profesion = idProfesion;
		this.direccion = idDireccion;
		this.condicionIva = idCondicionIva;
		this.tipodedocumento = idTipoDeDocumento;
		this.estadoCliente = idEstadoCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.correoElectronico = correoElectronico;
		this.anioDeRegistro = anioDeRegistro;
		this.nroCuil = nroCuil;
		this.nroCliente = nroCliente;
	}

	
	public DTOEstadocivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(DTOEstadocivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public DTOProfesion getProfesion() {
		return profesion;
	}

	public void setProfesion(DTOProfesion profesion) {
		this.profesion = profesion;
	}

	public DTODireccion getDireccion() {
		return direccion;
	}

	public void setDireccion(DTODireccion direccion) {
		this.direccion = direccion;
	}

	public DTOCondicioniva getCondicionIva() {
		return condicionIva;
	}

	public void setCondicionIva(DTOCondicioniva condicionIva) {
		this.condicionIva = condicionIva;
	}

	public DTOTipodedocumento getTipodedocumento() {
		return tipodedocumento;
	}

	public void setTipodedocumento(DTOTipodedocumento tipodedocumento) {
		this.tipodedocumento = tipodedocumento;
	}

	public DTOEstadocliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(DTOEstadocliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getNroDocumento() {
		return this.nroDocumento;
	}

	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getAnioDeRegistro() {
		return this.anioDeRegistro;
	}

	public void setAnioDeRegistro(Date anioDeRegistro) {
		this.anioDeRegistro = anioDeRegistro;
	}


	public Integer getNroCuil() {
		return this.nroCuil;
	}

	public void setNroCuil(Integer nroCuil) {
		this.nroCuil = nroCuil;
	}

	public Integer getNroCliente() {
		return this.nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

}
