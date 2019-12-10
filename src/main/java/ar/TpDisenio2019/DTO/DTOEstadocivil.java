package ar.TpDisenio2019.DTO;



public class DTOEstadocivil {

	private int idEstadoCivil;
	private String nombre;
    
	public DTOEstadocivil() {}
	
	public DTOEstadocivil(int idEstadoCivil, String nombre) {
		super();
		this.idEstadoCivil = idEstadoCivil;
		this.nombre = nombre;
	}

	
	public int getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
