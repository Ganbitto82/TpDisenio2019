package ar.TpDisenio2019.DTO;


public class DTODireccion  {

	private int idDireccion;
	private DTOLocalidad localidad;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String departamento;


	public DTODireccion() {}
		
	public DTODireccion(int idDireccion, String calle, Integer numero, Integer piso,
			String departamento) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	
	public DTODireccion(int idDireccion, String calle, Integer numero, Integer piso,
			String departamento, DTOLocalidad idLocalidad) {
		super();
		this.idDireccion = idDireccion;
		this.localidad = idLocalidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
	}

	
	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}


	

	public DTOLocalidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(DTOLocalidad localidad) {
		this.localidad = localidad;
	}


	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
