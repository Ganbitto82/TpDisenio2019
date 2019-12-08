package ar.TpDisenio2019.ListaDesplegable;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Tipodedocumento;

public class GestorListasDesplegables {

	static GestorListasBDDesplegable gestionListaDesplegableTipoDocumento = new GestorListasBDDesplegable();
	
	
	public static List<DTOTipodedocumento> buscarDtosTipoDeDocumento() {

		List<Tipodedocumento> listaTiposDocumento = new ArrayList<Tipodedocumento>();

		List<DTOTipodedocumento> dtoListaTipos = new ArrayList<DTOTipodedocumento>();

		listaTiposDocumento = gestionListaDesplegableTipoDocumento.ObtenerTiposDocumento();

		for (Tipodedocumento listaTipo : listaTiposDocumento) {

			DTOTipodedocumento dtoTipodedocumento = new DTOTipodedocumento();
			dtoTipodedocumento.setIdTipoDeDocumento(listaTipo.getIdTipoDeDocumento());
			dtoTipodedocumento.setNombre(listaTipo.getNombre());

			dtoListaTipos.add(dtoTipodedocumento);
		}

		return dtoListaTipos;

	}
	
	
}