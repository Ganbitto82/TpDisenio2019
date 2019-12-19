package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Tipodedocumento;




public class GestorCliente {

	static GestorBDCliente gestionCliente = new GestorBDCliente();

	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {

		

		List<DTOCliente> dtoListaCliente = new ArrayList<DTOCliente>();

		dtoListaCliente = gestionCliente. obtenerDTOCliente();
	
				
	
			
			return dtoListaCliente;
			
	}

}
