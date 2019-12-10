package ar.TpDisenio2019.DTO;

import java.util.Date;

public class DTORecibo  {

	private int idRecibo;
	private DTOOperador operador;
	private Integer nroRecibo;
	private Date fecha;
	private Integer hora;
	private Date ultimoDiaDePago;
	private Float importeTotal;
	
	public DTORecibo() {}
	
	public DTORecibo(int idRecibo, Integer nroRecibo, Date fecha, Integer hora, Date ultimoDiaDePago,
			Float importeTotal) {
		super();
		this.idRecibo = idRecibo;
		this.nroRecibo = nroRecibo;
		this.fecha = fecha;
		this.hora = hora;
		this.ultimoDiaDePago = ultimoDiaDePago;
		this.importeTotal = importeTotal;
	}
	public DTORecibo(int idRecibo, DTOOperador idOperador, Integer nroRecibo, Date fecha, Integer hora, Date ultimoDiaDePago,
			Float importeTotal) {
		super();
		this.idRecibo = idRecibo;
		this.operador = idOperador;
		this.nroRecibo = nroRecibo;
		this.fecha = fecha;
		this.hora = hora;
		this.ultimoDiaDePago = ultimoDiaDePago;
		this.importeTotal = importeTotal;
	}

	
	public int getIdRecibo() {
		return this.idRecibo;
	}

	public void setIdRecibo(int idRecibo) {
		this.idRecibo = idRecibo;
	}
	
		
	public DTOOperador getIdOperador() {
		return this.operador;
	}

	public void setIdOperador(DTOOperador idOperador) {
		this.operador = idOperador;
	}

	
	public Integer getNroRecibo() {
		return this.nroRecibo;
	}

	public void setNroRecibo(Integer nroRecibo) {
		this.nroRecibo = nroRecibo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	public Integer getHora() {
		return this.hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	
	public Date getUltimoDiaDePago() {
		return this.ultimoDiaDePago;
	}

	public void setUltimoDiaDePago(Date ultimoDiaDePago) {
		this.ultimoDiaDePago = ultimoDiaDePago;
	}

	
	public Float getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(Float importeTotal) {
		this.importeTotal = importeTotal;
	}

}
