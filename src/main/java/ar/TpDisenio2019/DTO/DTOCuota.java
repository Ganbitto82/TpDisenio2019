package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import java.util.Date;

public class DTOCuota  {

	private int idCuotas;
	private DTORecibo recibo;
	private Integer cuotasPagas;
	private Date vencimiento;
	private Float valorOriginal;
	private Float valorPorMora;
	private Float valorTotalaPagar;
	private Float bonificacion;
	private Float recargoPorMora;

	public DTOCuota() {
		
	}
	public DTOCuota(int idCuotas, Integer cuotasPagas, Date vencimiento, Float valorOriginal,
			Float valorPorMora, Float valorTotalaPagar, Float bonificacion, Float recargoPorMora) {
		super();
		this.idCuotas = idCuotas;
		this.cuotasPagas = cuotasPagas;
		this.vencimiento = vencimiento;
		this.valorOriginal = valorOriginal;
		this.valorPorMora = valorPorMora;
		this.valorTotalaPagar = valorTotalaPagar;
		this.bonificacion = bonificacion;
		this.recargoPorMora = recargoPorMora;
	}


	public DTOCuota(int idCuotas, DTORecibo idRecibo, Integer cuotasPagas, Date vencimiento, Float valorOriginal,
			Float valorPorMora, Float valorTotalaPagar, Float bonificacion, Float recargoPorMora) {
		this.idCuotas = idCuotas;
		this.recibo = idRecibo;
		this.cuotasPagas = cuotasPagas;
		this.vencimiento = vencimiento;
		this.valorOriginal = valorOriginal;
		this.valorPorMora = valorPorMora;
		this.valorTotalaPagar = valorTotalaPagar;
		this.bonificacion = bonificacion;
		this.recargoPorMora = recargoPorMora;
	}


	public int getIdCuotas() {
		return this.idCuotas;
	}

	public void setIdCuotas(int idCuotas) {
		this.idCuotas = idCuotas;
	}

	

	public DTORecibo getRecibo() {
		return recibo;
	}

	public void setRecibo(DTORecibo recibo) {
		this.recibo = recibo;
	}


	public Integer getCuotasPagas() {
		return this.cuotasPagas;
	}

	public void setCuotasPagas(Integer cuotasPagas) {
		this.cuotasPagas = cuotasPagas;
	}

	public Date getVencimiento() {
		return this.vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}


	public Float getValorOriginal() {
		return this.valorOriginal;
	}

	public void setValorOriginal(Float valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public Float getValorPorMora() {
		return this.valorPorMora;
	}

	public void setValorPorMora(Float valorPorMora) {
		this.valorPorMora = valorPorMora;
	}

	
	public Float getValorTotalaPagar() {
		return this.valorTotalaPagar;
	}

	public void setValorTotalaPagar(Float valorTotalaPagar) {
		this.valorTotalaPagar = valorTotalaPagar;
	}


	public Float getBonificacion() {
		return this.bonificacion;
	}

	public void setBonificacion(Float bonificacion) {
		this.bonificacion = bonificacion;
	}


	public Float getRecargoPorMora() {
		return this.recargoPorMora;
	}

	public void setRecargoPorMora(Float recargoPorMora) {
		this.recargoPorMora = recargoPorMora;
	}

}
