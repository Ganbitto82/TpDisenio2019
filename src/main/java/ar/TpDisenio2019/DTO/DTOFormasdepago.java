package ar.TpDisenio2019.DTO;



public class DTOFormasdepago  {

	private int idFormasDePago;
	private String nombre;

	public DTOFormasdepago() {}
	public DTOFormasdepago(int idFormasDePago, String nombre) {
		super();
		this.idFormasDePago = idFormasDePago;
		this.nombre = nombre;
	}
	public int getIdFormasDePago() {
		return this.idFormasDePago;
	}

	public void setIdFormasDePago(int idFormasDePago) {
		this.idFormasDePago = idFormasDePago;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
