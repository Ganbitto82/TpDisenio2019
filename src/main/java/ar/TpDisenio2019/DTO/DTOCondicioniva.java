package ar.TpDisenio2019.DTO;

public class DTOCondicioniva  {

	private int idCondicionIva;
	private String nombre;

	public DTOCondicioniva() {
		
	}
	
	public DTOCondicioniva(int idCondicionIva, String nombre) {
		super();
		this.idCondicionIva = idCondicionIva;
		this.nombre = nombre;
	}

	
	public int getIdCondicionIva() {
		return this.idCondicionIva;
	}

	public void setIdCondicionIva(int idCondicionIva) {
		this.idCondicionIva = idCondicionIva;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
