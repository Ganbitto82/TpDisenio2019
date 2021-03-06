package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Parametrosgenerales generated by hbm2java
 */
@Entity
@Table(name = "parametrosgenerales", catalog = "dbelaseguradov4")
public class Parametrosgenerales  {

	private int idParametrosGenerales;
	private Float derechosDeEmision;
	private Float tasaDeInteres;
	private Float tasaDeDescuento;

	public Parametrosgenerales() {
	}

	public Parametrosgenerales(int idParametrosGenerales) {
		this.idParametrosGenerales = idParametrosGenerales;
	}

	public Parametrosgenerales(int idParametrosGenerales, Float derechosDeEmision, Float tasaDeInteres,
			Float tasaDeDescuento) {
		this.idParametrosGenerales = idParametrosGenerales;
		this.derechosDeEmision = derechosDeEmision;
		this.tasaDeInteres = tasaDeInteres;
		this.tasaDeDescuento = tasaDeDescuento;
	}

	@Id

	@Column(name = "idParametrosGenerales", unique = true, nullable = false)
	public int getIdParametrosGenerales() {
		return this.idParametrosGenerales;
	}

	public void setIdParametrosGenerales(int idParametrosGenerales) {
		this.idParametrosGenerales = idParametrosGenerales;
	}

	@Column(name = "derechosDeEmision", precision = 12, scale = 0)
	public Float getDerechosDeEmision() {
		return this.derechosDeEmision;
	}

	public void setDerechosDeEmision(Float derechosDeEmision) {
		this.derechosDeEmision = derechosDeEmision;
	}

	@Column(name = "tasaDeInteres", precision = 12, scale = 0)
	public Float getTasaDeInteres() {
		return this.tasaDeInteres;
	}

	public void setTasaDeInteres(Float tasaDeInteres) {
		this.tasaDeInteres = tasaDeInteres;
	}

	@Column(name = "tasaDeDescuento", precision = 12, scale = 0)
	public Float getTasaDeDescuento() {
		return this.tasaDeDescuento;
	}

	public void setTasaDeDescuento(Float tasaDeDescuento) {
		this.tasaDeDescuento = tasaDeDescuento;
	}

}
