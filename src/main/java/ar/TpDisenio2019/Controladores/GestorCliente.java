package ar.TpDisenio2019.Controladores;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Dao.EstadocivilDao;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Estadocivil;
import ar.TpDisenio2019.Modelo.Tipodedocumento;




public class GestorCliente {

	static GestorBDCliente gestionCliente = new GestorBDCliente();

	public static List<DTOCliente> buscarDtoscliente(DTOCliente Cli) {

		List<DTOCliente> dtoListaCliente = new ArrayList<DTOCliente>();

		dtoListaCliente = gestionCliente.obtenerDTOCliente();
	
		return dtoListaCliente;
			
	}
	
	public static List<DTOEstadocivil> buscarDtosEstadoCivil() {
		List<DTOEstadocivil> dtoListaEstadoCivil = new ArrayList<DTOEstadocivil>();
		List<Estadocivil> lista=gestionCliente.obtenerListaEstadoCivil();
		for(int i=0;i<lista.size();i++)
		{
			DTOEstadocivil dtoAux= new DTOEstadocivil();
			dtoAux.setIdEstadoCivil(lista.get(i).getIdEstadoCivil());
			dtoAux.setNombre(lista.get(i).getNombre());
			dtoListaEstadoCivil.add(i, dtoAux);
		}
		
		return dtoListaEstadoCivil;
	}

}
