package ar.TpDisenio2019.DTO;



public class DTOMedidasdeseguridadporc {

	private int idMedPorc;
	private float porcentaje;
	
	public DTOMedidasdeseguridadporc() {}

	public DTOMedidasdeseguridadporc(int idMedPorc, float porcentaje) {
		super();
		this.idMedPorc = idMedPorc;
		this.porcentaje = porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public DTOMedidasdeseguridadporc(int idMedPorc) {
		this.idMedPorc = idMedPorc;
	}
	
	

	
	public int getIdMedPorc() {
		return this.idMedPorc;
	}

	public void setIdMedPorc(int idMedPorc) {
		this.idMedPorc = idMedPorc;
	}

}
