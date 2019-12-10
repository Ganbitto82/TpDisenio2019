package ar.TpDisenio2019.DTO;



public class DTOLocalidad  {

	private int idLocalidad;
	private DTOProvincia provincia;
	private String nombre;

	public DTOLocalidad() {}
	public DTOLocalidad(int idLocalidad, String nombre) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
	}
	
	
	public DTOLocalidad(int idLocalidad, DTOProvincia idProvincia, String nombre) {
		super();
		this.idLocalidad = idLocalidad;
		this.provincia = idProvincia;
		this.nombre = nombre;
	}

	
	public int getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}


	public DTOProvincia getProvincia() {
		return provincia;
	}

	public void setProvincia(DTOProvincia provincia) {
		this.provincia = provincia;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
