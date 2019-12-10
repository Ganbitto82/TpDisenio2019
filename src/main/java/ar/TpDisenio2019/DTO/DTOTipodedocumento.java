package ar.TpDisenio2019.DTO;



public class DTOTipodedocumento  {

	private int idTipoDeDocumento;
	private String nombre;

	public DTOTipodedocumento(int idTipoDeDocumento, String nombre) {
		super();
		this.idTipoDeDocumento = idTipoDeDocumento;
		this.nombre = nombre;
	}


	public DTOTipodedocumento() {
		
	}


	public int getIdTipoDeDocumento() {
		return this.idTipoDeDocumento;
	}
    


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdTipoDeDocumento(int idTipoDeDocumento) {
		this.idTipoDeDocumento = idTipoDeDocumento;
	}



}
