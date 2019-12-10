package ar.TpDisenio2019.DTO;



public class DTOEstadocliente {

	private int idEstadoCliente;
	private String tipo;

	public DTOEstadocliente() {}
	public DTOEstadocliente(int idEstadoCliente, String tipo) {
		super();
		this.idEstadoCliente = idEstadoCliente;
		this.tipo = tipo;
	}

	
	public int getIdEstadoCliente() {
		return this.idEstadoCliente;
	}

	public void setIdEstadoCliente(int idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
