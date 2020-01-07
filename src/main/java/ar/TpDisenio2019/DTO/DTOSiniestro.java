package ar.TpDisenio2019.DTO;



public class DTOSiniestro {

	private int idSiniestro;
	private Float porcentaje;
	private String cantidad;

	public DTOSiniestro() {}
	public DTOSiniestro(int idSiniestro, Float porcentaje, String cantidad) {
		super();
		this.idSiniestro = idSiniestro;
		this.porcentaje = porcentaje;
		this.cantidad = cantidad;
	}

	
	public int getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

}
