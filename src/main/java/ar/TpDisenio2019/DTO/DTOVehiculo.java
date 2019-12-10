package ar.TpDisenio2019.DTO;


public class DTOVehiculo  {

	private int idVehiculo;
	private DTOModelo modelo;
	private String motor;
	private String chasis;
	private Integer anio;
	private String patente;

	public DTOVehiculo() {}
	public DTOVehiculo(int idVehiculo, String motor, String chasis, Integer anio, String patente) {
		super();
		this.idVehiculo = idVehiculo;
		this.motor = motor;
		this.chasis = chasis;
		this.anio = anio;
		this.patente = patente;
	}
	public DTOVehiculo(int idVehiculo, DTOModelo idModelo, String motor, String chasis, Integer anio, String patente) {
		super();
		this.idVehiculo = idVehiculo;
		this.modelo = idModelo;
		this.motor = motor;
		this.chasis = chasis;
		this.anio = anio;
		this.patente = patente;
	}

	
	public int getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	
	public DTOModelo getIdModelo() {
		return this.modelo;
	}

	public void setIdModelo(DTOModelo idModelo) {
		this.modelo = idModelo;
	}

	
	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	
	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	
	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}
