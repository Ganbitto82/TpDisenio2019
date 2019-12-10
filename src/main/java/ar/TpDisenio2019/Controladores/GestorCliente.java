package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTODireccion;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOPais;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Tipodedocumento;






public class GestorCliente {
	
	static GestorBDCliente gestionCliente =new GestorBDCliente();
	
	

public static List<DTOCliente> buscarCliente(String numeroCliente, String apellido, String nombre, String tipoDocumento , String nroDoc) {
		
		List<Cliente> listacliente = new ArrayList<Cliente>();
		
		List<DTOCliente> dtoListaCliente= new ArrayList<DTOCliente>();
		
		String ape = new String();
		String nomb = new String();
		ape = apellido + "%";
		nomb = nombre + "%";
		
		listacliente  = gestionCliente.buscarCliente(numeroCliente, ape, nomb, tipoDocumento, nroDoc);
          
		for(Cliente cliente :listacliente) {
			
			DTOTipodedocumento dtoTipoDeDocumento =new DTOTipodedocumento(cliente.getNroDocumento().getIdTipoDeDocumento(),cliente.getNroDocumento().getNombre());
			//DTOPais dtoPais = GestorListasDesplegables.crearDTOPais(cliente.getIdDireccion().getIdLocalidad().getIdProvincia().getIdPais());
			//DTOProvincia dtoProvincia = GestorListasDesplegables.crearDTOProvincia(cliente.getIdDireccion().getIdLocalidad().getIdProvincia());
			//dtoProvincia.setIdPais(dtoPais);
			//DTOLocalidad dtoLocalidad = GestorListasDesplegables.crearDTOLocalidad(cliente.getIdDireccion().getIdLocalidad());
			
			DTOCliente dtoCliente = new DTOCliente(cliente.getIdCliente(),cliente.getNroCliente() , cliente.getNombre(),cliente.getApellido(),cliente.getNroDocumento(),dtoTipoDeDocumento);
			
			dtoListaCliente.add(dtoCliente);
		}
		return dtoListaCliente;
		
}

}
		/*	for(Tipodedocumento listaTipo :listaTiposDocumento) {
			
				DTOTipodedocumento dtoTipodedocumento= new DTOTipodedocumento();
			    dtoTipodedocumento.setIdTipoDeDocumento(listaTipo.getIdTipoDeDocumento());
			    dtoTipodedocumento.setNombre(listaTipo.getNombre());
			
			dtoListaTipos.add(dtoTipodedocumento);			
		}*/
			
					

