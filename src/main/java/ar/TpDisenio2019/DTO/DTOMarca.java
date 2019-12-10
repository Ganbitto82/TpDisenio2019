package ar.TpDisenio2019.DTO;



public class DTOMarca  {

	private int idMarca;
	private String marca;

	public DTOMarca() {}
	public DTOMarca(int idMarca, String marca) {
		super();
		this.idMarca = idMarca;
		this.marca = marca;
	}

	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
