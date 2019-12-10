package ar.TpDisenio2019.DTO;


import java.util.Date;



public class DTOAniodevehiculo {

	private int idAnioDeVehiculo;
	private Date anio;

	public DTOAniodevehiculo(int idAnioDeVehiculo, Date anio) {
		super();
		this.idAnioDeVehiculo = idAnioDeVehiculo;
		this.anio = anio;
	}

	public DTOAniodevehiculo() {
		
	}

	public int getIdAnioDeVehiculo() {
		return this.idAnioDeVehiculo;
	}

	public void setIdAnioDeVehiculo(int idAnioDeVehiculo) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}



	public Date getAnio() {
		return this.anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

}
