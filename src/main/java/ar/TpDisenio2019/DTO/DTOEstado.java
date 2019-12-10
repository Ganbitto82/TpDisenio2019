package ar.TpDisenio2019.DTO;



public class DTOEstado {

	private int idEstado;
	private String tipo;

	public DTOEstado() {}
	public DTOEstado(int idEstado, String tipo) {
		super();
		this.idEstado = idEstado;
		this.tipo = tipo;
	}

	
	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
