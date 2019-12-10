package ar.TpDisenio2019.DTO;





public class DTOOperador {

	private int idOperador;
	private String nombre;

	public DTOOperador() {}
	public DTOOperador(int idOperador, String nombre) {
		super();
		this.idOperador = idOperador;
		this.nombre = nombre;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
