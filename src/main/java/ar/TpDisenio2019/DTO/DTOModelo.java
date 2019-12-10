package ar.TpDisenio2019.DTO;

public class DTOModelo  {

	private int idModelo;
	private DTOMarca marca;
	private DTOAniodevehiculo aniodevehiculo;
	private String nombre;
	private Float porcentaje;

	public DTOModelo() {}
	public DTOModelo(int idModelo, String nombre, Float porcentaje) {
		super();
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public DTOModelo(int idModelo, DTOMarca idMarca, DTOAniodevehiculo idAniodevehiculo, String nombre, Float porcentaje) {
		this.idModelo = idModelo;
		this.marca = idMarca;
		this.aniodevehiculo = idAniodevehiculo;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public DTOMarca getMarca() {
		return marca;
	}

	public void setMarca(DTOMarca marca) {
		this.marca = marca;
	}

	public DTOAniodevehiculo getAniodevehiculo() {
		return aniodevehiculo;
	}

	public void setAniodevehiculo(DTOAniodevehiculo aniodevehiculo) {
		this.aniodevehiculo = aniodevehiculo;
	}


	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
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
