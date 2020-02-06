package ar.TpDisenio2019.Modelo;
// Generated 06/02/2020 17:41:53 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AniomodeloId generated by hbm2java
 */
@Embeddable
public class AniomodeloId implements java.io.Serializable {

	private int idAnioModelo;
	private int idModelo;
	private int idAnioDeVehiculo;

	public AniomodeloId() {
	}

	public AniomodeloId(int idAnioModelo, int idModelo, int idAnioDeVehiculo) {
		this.idAnioModelo = idAnioModelo;
		this.idModelo = idModelo;
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}

	@Column(name = "idAnioModelo", nullable = false)
	public int getIdAnioModelo() {
		return this.idAnioModelo;
	}

	public void setIdAnioModelo(int idAnioModelo) {
		this.idAnioModelo = idAnioModelo;
	}

	@Column(name = "idModelo", nullable = false)
	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name = "idAnioDeVehiculo", nullable = false)
	public int getIdAnioDeVehiculo() {
		return this.idAnioDeVehiculo;
	}

	public void setIdAnioDeVehiculo(int idAnioDeVehiculo) {
		this.idAnioDeVehiculo = idAnioDeVehiculo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AniomodeloId))
			return false;
		AniomodeloId castOther = (AniomodeloId) other;

		return (this.getIdAnioModelo() == castOther.getIdAnioModelo())
				&& (this.getIdModelo() == castOther.getIdModelo())
				&& (this.getIdAnioDeVehiculo() == castOther.getIdAnioDeVehiculo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAnioModelo();
		result = 37 * result + this.getIdModelo();
		result = 37 * result + this.getIdAnioDeVehiculo();
		return result;
	}

}
