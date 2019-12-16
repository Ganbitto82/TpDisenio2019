package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;




public class GestorCliente {



	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {

		List<Cliente> listacliente = new ArrayList<Cliente>();

		List<DTOCliente> dtoListaCliente = new ArrayList<DTOCliente>();

		listacliente = GestorBDCliente.buscarCliente( Cli);

			for(Cliente cliente :listacliente) {
				
				DTOTipodedocumento dtoTipoDeDocumento =new DTOTipodedocumento(cliente.getTipodedocumento().getIdTipoDeDocumento(),cliente.getTipodedocumento().getNombre());
				DTOCliente dtoCliente = new DTOCliente();
				dtoCliente.setTipodedocumento(dtoTipoDeDocumento);
				dtoCliente.setIdCliente(cliente.getIdCliente());
				dtoCliente.setNroCliente(cliente.getNroCliente());
				dtoCliente.setNombre(cliente.getNombre());
				dtoCliente.setApellido(cliente.getApellido());
				dtoCliente.setNroDocumento(cliente.getNroDocumento());
				
				dtoListaCliente.add(dtoCliente);
			}
			return dtoListaCliente;
	}

}
