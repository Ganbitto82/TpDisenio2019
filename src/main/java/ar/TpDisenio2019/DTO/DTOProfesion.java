package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final


public class DTOProfesion  {

	private int idProfesion;
	private String nombre;

	public DTOProfesion() {}
	public DTOProfesion(int idProfesion, String nombre) {
		super();
		this.idProfesion = idProfesion;
		this.nombre = nombre;
	}

	
	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
