package ar.TpDisenio2019.DTO;

public class DTOOperador {

	private int idOperador;
	private String nombre;
	private String contrasenia;
	private String cargo;

	public DTOOperador() {}
	public DTOOperador(int idOperador, String nombre, String contrasenia,String cargo ) {
		super();
		this.idOperador = idOperador;
		this.nombre = nombre;
		this.cargo = cargo;
		this.contrasenia = contrasenia;
	}

	
	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return this.cargo;
	}

	public void setcontrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getcontrasenia() {
		return this.contrasenia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}