package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.DTO.DTOPoliza;

public class GestorPoliza {

	static GestorCliente gestorCliente;
	
	static GestorBDPoliza gestionPoliza = new GestorBDPoliza();


	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {
		return gestorCliente.buscarDtoscliente(Cli);
	}


	public static void agregarDtosHijos(List<DTODatosdehijo> listaDtosHijos) {
		// TODO Auto-generated method stub
		DTOPoliza dtoPoliza = new  DTOPoliza();
		//dtoPoliza.setDatosdehijo(listaDtosHijos);
		
	}
}
