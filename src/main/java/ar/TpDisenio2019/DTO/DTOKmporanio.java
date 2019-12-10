package ar.TpDisenio2019.DTO;




public class DTOKmporanio  {

	private int idKmPorAnio;
	private Float porcentaje;

	public DTOKmporanio() {}
	public DTOKmporanio(int idKmPorAnio, Float porcentaje) {
		super();
		this.idKmPorAnio = idKmPorAnio;
		this.porcentaje = porcentaje;
	}

	
	public int getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(int idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
