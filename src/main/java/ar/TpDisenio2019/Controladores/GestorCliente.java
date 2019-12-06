package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.Modelo.Cliente;



public class GestorCliente {
	
	static GestorBDCliente gestionCliente =new GestorBDCliente();
	
	
public static List<DTOCliente> buscarDtoscliente(String numeroCliente, String apellido, String nombre, String tipoDocumento , String nroDoc) {
		
		List<Cliente> listacliente = new ArrayList<Cliente>();
		
		List<DTOCliente> dtoListaCliente= new ArrayList<DTOCliente>();
		
		listacliente  = gestionCliente.buscarCliente(numeroCliente, apellido, nombre, tipoDocumento, nroDoc);
          
		/*	for(Tipodedocumento listaTipo :listaTiposDocumento) {
			
				DTOTipodedocumento dtoTipodedocumento= new DTOTipodedocumento();
			    dtoTipodedocumento.setIdTipoDeDocumento(listaTipo.getIdTipoDeDocumento());
			    dtoTipodedocumento.setNombre(listaTipo.getNombre());
			
			dtoListaTipos.add(dtoTipodedocumento);			
		}*/
			
					

 return dtoListaCliente;
	
	
}

}