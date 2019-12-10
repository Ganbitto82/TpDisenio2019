package ar.TpDisenio2019.DTO;



public class DTONumeropoliza  {

	private int nroPoliza;
	private int nroSucursal;
	private int aleatorio;
	private int secuencia;

	public DTONumeropoliza() {}
	public DTONumeropoliza(int nroPoliza, int nroSucursal, int aleatorio, int secuencia) {
		super();
		this.nroPoliza = nroPoliza;
		this.nroSucursal = nroSucursal;
		this.aleatorio = aleatorio;
		this.secuencia = secuencia;
	}

	
	public int getNroPoliza() {
		return this.nroPoliza;
	}

	public void setNroPoliza(int nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	
	public int getNroSucursal() {
		return this.nroSucursal;
	}

	public void setNroSucursal(int nroSucursal) {
		this.nroSucursal = nroSucursal;
	}

	public int getAleatorio() {
		return this.aleatorio;
	}

	public void setAleatorio(int aleatorio) {
		this.aleatorio = aleatorio;
	}

	
	public int getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}

}
