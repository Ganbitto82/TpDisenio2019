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
				dtoCliente.setIdCliente(cliente.getIdCliente());
				dtoCliente.setNroCliente(cliente.getNroCliente());
				dtoCliente.setNombre(cliente.getNombre());
				dtoCliente.setApellido(cliente.getApellido());
				dtoCliente.setNroDocumento(cliente.getNroDocumento());
				dtoCliente.setTipodedocumento(dtoTipoDeDocumento);
				
				
				dtoListaCliente.add(dtoCliente);
			}
			return dtoListaCliente;
	}

}
/*
 * 
 * 
 * public class GestorCandidato {
	public static List <DTOCandidato> buscarCandidatos(DTOCandidato cand){
		
		List<Candidato> resultado = CandidatoDAO.finder(cand);
		
		List <DTOCandidato> candidatos = new ArrayList<DTOCandidato>();
		for(Candidato aux : resultado){
			DTOCandidato c = new DTOCandidato();
			c.setApellido(aux.getApellido());
			c.setNombre(aux.getNombre());
			c.setNroDoc(aux.getNroDoc());
			c.setTipoDoc(aux.getTipoDoc());
			c.setNroCandidato(aux.getNroCandidato());
			candidatos.add(c);
		}
		
		return candidatos;
	}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
