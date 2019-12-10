package ar.TpDisenio2019.DTO;
 




public class DTOMedidasdeseguridad  {

	private int idMedidasSeguridad;
	private DTOMedidasdeseguridadporc medidasdeseguridadporc;
	private String nombre;
	private Float porcentaje;


	public DTOMedidasdeseguridad() {}
	public DTOMedidasdeseguridad(int idMedidasSeguridad ,String nombre, Float porcentaje) {
		super();
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public DTOMedidasdeseguridad(int idMedidasSeguridad, DTOMedidasdeseguridadporc idMedPorc, String nombre, Float porcentaje) {
		super();
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.medidasdeseguridadporc = idMedPorc;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	
	public int getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(int idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	public DTOMedidasdeseguridadporc getMedidasdeseguridadporc() {
		return medidasdeseguridadporc;
	}

	public void setMedidasdeseguridadporc(DTOMedidasdeseguridadporc medidasdeseguridadporc) {
		this.medidasdeseguridadporc = medidasdeseguridadporc;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
