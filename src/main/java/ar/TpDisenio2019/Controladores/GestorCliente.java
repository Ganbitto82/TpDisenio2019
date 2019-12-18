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

		List<Cliente> listacliente = new ArrayList<Cliente>();

		List<DTOCliente> dtoListaCliente = new ArrayList<DTOCliente>();

		listacliente = gestionCliente.obtenerTodas();

			for(Cliente cliente :listacliente) {
				
				DTOCliente dtoCliente = new DTOCliente();
				DTOTipodedocumento dtotipo= new DTOTipodedocumento(); 
				
				dtoCliente.setIdCliente(cliente.getIdCliente());
				dtoCliente.setNroCliente(cliente.getNroCliente());
				dtoCliente.setNombre(cliente.getNombre());
				dtoCliente.setApellido(cliente.getApellido());
				dtoCliente.setNroDocumento(cliente.getNroDocumento());								
				
				Tipodedocumento tipodocumento = gestionCliente.buscarPorId(cliente.getTipodedocumento().getIdTipoDeDocumento());
				
				dtotipo.setIdTipoDeDocumento(tipodocumento.getIdTipoDeDocumento());
				dtotipo.setNombre(tipodocumento.getNombre());
				
				dtoCliente.setTipodedocumento(dtotipo);
				dtoListaCliente.add(dtoCliente);
			}
			
			return dtoListaCliente;
			
	}

}
