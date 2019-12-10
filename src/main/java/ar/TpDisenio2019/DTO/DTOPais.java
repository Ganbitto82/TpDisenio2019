package ar.TpDisenio2019.DTO;


public class DTOPais  {

	private int idPais;
	private String nombre;

	public DTOPais() {}
	public DTOPais(int idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
	}

	
	public int getIdPais() {
		return this.idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
