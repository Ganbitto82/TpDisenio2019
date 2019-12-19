package ar.TpDisenio2019.DTO;


public class DTOProvincia  {

	private int idProvincia;
	private DTOPais pais;
	private String nombre;

	public DTOProvincia() {}
	public DTOProvincia(int idProvincia, String nombre) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}
	
	
	
	public DTOProvincia(int idProvincia, String nombre, DTOPais idPais) {
		super();
		this.idProvincia = idProvincia;
		this.pais = idPais;
		this.nombre = nombre;
	}
	
	public int getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	
	public DTOPais getIdPais() {
		return this.pais;
	}

	public void setIdPais(DTOPais idPais) {
		this.pais = idPais;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
