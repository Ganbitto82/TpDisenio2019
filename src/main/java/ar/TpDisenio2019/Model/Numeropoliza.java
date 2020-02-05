package ar.TpDisenio2019.Model;
// Generated 5/02/2020 07:38:19 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Numeropoliza generated by hbm2java
 */
@Entity
@Table(name = "numeropoliza", catalog = "dbelaseguradov4")
public class Numeropoliza implements java.io.Serializable {

	private long nroPoliza;
	private int nroSucursal;
	private int aleatorio;
	private int secuencia;

	public Numeropoliza() {
	}

	public Numeropoliza(long nroPoliza, int nroSucursal, int aleatorio, int secuencia) {
		this.nroPoliza = nroPoliza;
		this.nroSucursal = nroSucursal;
		this.aleatorio = aleatorio;
		this.secuencia = secuencia;
	}

	@Id

	@Column(name = "nroPoliza", unique = true, nullable = false)
	public long getNroPoliza() {
		return this.nroPoliza;
	}

	public void setNroPoliza(long nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	@Column(name = "nroSucursal", nullable = false)
	public int getNroSucursal() {
		return this.nroSucursal;
	}

	public void setNroSucursal(int nroSucursal) {
		this.nroSucursal = nroSucursal;
	}

	@Column(name = "aleatorio", nullable = false)
	public int getAleatorio() {
		return this.aleatorio;
	}

	public void setAleatorio(int aleatorio) {
		this.aleatorio = aleatorio;
	}

	@Column(name = "secuencia", nullable = false)
	public int getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}

}
