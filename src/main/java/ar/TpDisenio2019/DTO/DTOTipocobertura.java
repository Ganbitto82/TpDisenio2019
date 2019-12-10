package ar.TpDisenio2019.DTO;





public class DTOTipocobertura  {

	private int idTipoCobertura;
	private String tipo;
	private Float porcentaje;
	private String descripcion;

	public DTOTipocobertura() {}
	
	public DTOTipocobertura(int idTipoCobertura, String tipo, Float porcentaje, String descripcion) {
		super();
		this.idTipoCobertura = idTipoCobertura;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.descripcion = descripcion;
	}

	
	public int getIdTipoCobertura() {
		return this.idTipoCobertura;
	}

	public void setIdTipoCobertura(int idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
