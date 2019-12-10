package ar.TpDisenio2019.DTO;


import java.util.Date;



public class DTODatosdehijo {

	private int idDatosHijo;
	private DTOEstadocivil estadocivil;
	private Date fecha;
	private String sexo;
	private Float porcentaje;

	public DTODatosdehijo() {}

	public DTODatosdehijo(int idDatosHijo, Date fecha, String sexo, Float porcentaje) {
		super();
		this.idDatosHijo = idDatosHijo;
		this.fecha = fecha;
		this.sexo = sexo;
		this.porcentaje = porcentaje;
	}
	
	
	public DTODatosdehijo(int idDatosHijo, DTOEstadocivil idEstadoCivil, Date fecha, String sexo, Float porcentaje) {
		super();
		this.idDatosHijo = idDatosHijo;
		this.estadocivil = idEstadoCivil;
		this.fecha = fecha;
		this.sexo = sexo;
		this.porcentaje = porcentaje;
	}


	public int getIdDatosHijo() {
		return this.idDatosHijo;
	}

	public void setIdDatosHijo(int idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}



	public DTOEstadocivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(DTOEstadocivil estadocivil) {
		this.estadocivil = estadocivil;
	}


	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
