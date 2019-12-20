package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;

public class GestorPoliza {

	static GestorCliente gestorCliente;
	
	static GestorBDPoliza gestionPoliza = new GestorBDPoliza();


	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {
		return gestorCliente.buscarDtoscliente(Cli);
	}
}
