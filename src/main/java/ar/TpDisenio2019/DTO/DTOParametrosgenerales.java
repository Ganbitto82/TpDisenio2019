package ar.TpDisenio2019.DTO;

public class DTOParametrosgenerales  {

	private int idParametrosGenerales;
	private Float derechosDeEmision;
	private Float tasaDeInteres;
	private Float tasaDeDescuento;

	public DTOParametrosgenerales() {}
	public DTOParametrosgenerales(int idParametrosGenerales, Float derechosDeEmision, Float tasaDeInteres,
			Float tasaDeDescuento) {
		super();
		this.idParametrosGenerales = idParametrosGenerales;
		this.derechosDeEmision = derechosDeEmision;
		this.tasaDeInteres = tasaDeInteres;
		this.tasaDeDescuento = tasaDeDescuento;
	}

	
	public int getIdParametrosGenerales() {
		return this.idParametrosGenerales;
	}

	public void setIdParametrosGenerales(int idParametrosGenerales) {
		this.idParametrosGenerales = idParametrosGenerales;
	}

	
	public Float getDerechosDeEmision() {
		return this.derechosDeEmision;
	}

	public void setDerechosDeEmision(Float derechosDeEmision) {
		this.derechosDeEmision = derechosDeEmision;
	}

	
	public Float getTasaDeInteres() {
		return this.tasaDeInteres;
	}

	public void setTasaDeInteres(Float tasaDeInteres) {
		this.tasaDeInteres = tasaDeInteres;
	}

	
	public Float getTasaDeDescuento() {
		return this.tasaDeDescuento;
	}

	public void setTasaDeDescuento(Float tasaDeDescuento) {
		this.tasaDeDescuento = tasaDeDescuento;
	}

}
