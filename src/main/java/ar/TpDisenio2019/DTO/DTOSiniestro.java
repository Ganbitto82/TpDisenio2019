package ar.TpDisenio2019.DTO;



public class DTOSiniestro {

	private int idSiniestro;
	private Float porcentaje;
	private Integer cantidad;

	public DTOSiniestro() {}
	public DTOSiniestro(int idSiniestro, Float porcentaje, Integer cantidad) {
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

	
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
