package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;




public class GestorCliente {

	static GestorBDCliente gestionCliente = new GestorBDCliente();

	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {

		List<Cliente> listacliente = new ArrayList<Cliente>();

		List<DTOCliente> dtoListaCliente = new ArrayList<DTOCliente>();

		listacliente = gestionCliente.obtenerTodas();

			for(Cliente cliente :listacliente) {
				
				System.out.println(cliente.getIdCliente().toString());
				System.out.println(cliente.getNombre().toString());
				System.out.println(cliente.getApellido().toString());
				
				System.out.println(cliente.getTipodedocumento().getIdTipoDeDocumento().toString());
//				System.out.println(cliente.getTipodedocumento().getNombre().toString());
				
				DTOCliente dtoCliente = new DTOCliente();
				dtoCliente.setIdCliente(cliente.getIdCliente());
				dtoCliente.setNroCliente(cliente.getNroCliente());
				dtoCliente.setNombre(cliente.getNombre());
				dtoCliente.setApellido(cliente.getApellido());
				
								
				DTOTipodedocumento dtoTipoDeDocumento =new DTOTipodedocumento(cliente.getTipodedocumento().getIdTipoDeDocumento(),cliente.getTipodedocumento().getNombre());
				
				dtoCliente.setNroDocumento(cliente.getNroDocumento());
				
				dtoCliente.setTipodedocumento(dtoTipoDeDocumento);
				dtoListaCliente.add(dtoCliente);
			}
			return dtoListaCliente;
	}

}
