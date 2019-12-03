package ar.TpDisenio2019.Modelo;
// Generated 3/12/2019 07:40:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Aniodevehiculo generated by hbm2java
 */
@Entity
@Table(name = "aniodevehiculo", catalog = "dbelaseguradov4")
public class Aniodevehiculo  {

	private int idAnioDeVehiculo;
	private Date anio;

	public Aniodevehiculo() {
	}

	public Aniodevehiculo(int idAnioDeVehiculo) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}

	public Aniodevehiculo(int idAnioDeVehiculo, Date anio) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
		this.anio = anio;
	}

	@Id

	@Column(name = "idAnioDeVehiculo", unique = true, nullable = false)
	public int getIdAnioDeVehiculo() {
		return this.idAnioDeVehiculo;
	}

	public void setIdAnioDeVehiculo(int idAnioDeVehiculo) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "anio", length = 0)
	public Date getAnio() {
		return this.anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

}
