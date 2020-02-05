package ar.TpDisenio2019.Model;
// Generated 5/02/2020 07:38:19 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Recibo generated by hbm2java
 */
@Entity
@Table(name = "recibo", catalog = "dbelaseguradov4")
public class Recibo implements java.io.Serializable {

	private Integer idRecibo;
	private Operador operador;
	private Integer nroRecibo;
	private Date fecha;
	private Integer hora;
	private Date ultimoDiaDePago;
	private Float importeTotal;
	private Set<Cuota> cuotas = new HashSet<Cuota>(0);

	public Recibo() {
	}

	public Recibo(Operador operador, Integer nroRecibo, Date fecha, Integer hora, Date ultimoDiaDePago,
			Float importeTotal, Set<Cuota> cuotas) {
		this.operador = operador;
		this.nroRecibo = nroRecibo;
		this.fecha = fecha;
		this.hora = hora;
		this.ultimoDiaDePago = ultimoDiaDePago;
		this.importeTotal = importeTotal;
		this.cuotas = cuotas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idRecibo", unique = true, nullable = false)
	public Integer getIdRecibo() {
		return this.idRecibo;
	}

	public void setIdRecibo(Integer idRecibo) {
		this.idRecibo = idRecibo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idOperador")
	public Operador getOperador() {
		return this.operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	@Column(name = "nroRecibo")
	public Integer getNroRecibo() {
		return this.nroRecibo;
	}

	public void setNroRecibo(Integer nroRecibo) {
		this.nroRecibo = nroRecibo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "hora")
	public Integer getHora() {
		return this.hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ultimoDiaDePago", length = 10)
	public Date getUltimoDiaDePago() {
		return this.ultimoDiaDePago;
	}

	public void setUltimoDiaDePago(Date ultimoDiaDePago) {
		this.ultimoDiaDePago = ultimoDiaDePago;
	}

	@Column(name = "importeTotal", precision = 12, scale = 0)
	public Float getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(Float importeTotal) {
		this.importeTotal = importeTotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recibo")
	public Set<Cuota> getCuotas() {
		return this.cuotas;
	}

	public void setCuotas(Set<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

}
