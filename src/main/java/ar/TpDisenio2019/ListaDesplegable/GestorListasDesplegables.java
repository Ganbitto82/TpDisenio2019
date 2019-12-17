package ar.TpDisenio2019.ListaDesplegable;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOPais;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Estadocivil;
import ar.TpDisenio2019.Modelo.Localidad;
import ar.TpDisenio2019.Modelo.Pais;
import ar.TpDisenio2019.Modelo.Provincia;
import ar.TpDisenio2019.Modelo.Tipodedocumento;
import ar.TpDisenio2019.ListaDesplegable.GestorListasBDDesplegable;

public class GestorListasDesplegables {

	static GestorListasBDDesplegable gestionListaDesplegable = new GestorListasBDDesplegable();

	public static List<DTOTipodedocumento> buscarDtosTipoDeDocumento() {

		List<Tipodedocumento> listaTiposDocumento = new ArrayList<Tipodedocumento>();

		List<DTOTipodedocumento> dtoListaTipos = new ArrayList<DTOTipodedocumento>();

		listaTiposDocumento = gestionListaDesplegable.ObtenerTiposDocumento();

		for (Tipodedocumento listaTipo : listaTiposDocumento) {

			DTOTipodedocumento dtoTipodedocumento = new DTOTipodedocumento();
			dtoTipodedocumento.setIdTipoDeDocumento(listaTipo.getIdTipoDeDocumento());
			dtoTipodedocumento.setNombre(listaTipo.getNombre());

			dtoListaTipos.add(dtoTipodedocumento);
		}

		return dtoListaTipos;

	}
	
	public static List<DTOProvincia> buscarDtosProvincia( )
	{
		List<Provincia> listaProvincias = new ArrayList<Provincia>();
		listaProvincias = GestorListasBDDesplegable.ObtenerProvincias();
		List<DTOProvincia> listaDtosProvincia = new ArrayList<DTOProvincia>();
		for(int i = 0; i < listaProvincias.size(); i++)
		{
			DTOProvincia dtoProvincia = new DTOProvincia( );
			dtoProvincia.setIdProvincia(listaProvincias.get(i).getIdProvincia());
			dtoProvincia.setNombre(listaProvincias.get(i).getNombre());
			listaDtosProvincia.add(dtoProvincia);
		}
		
		return listaDtosProvincia;
	}

	public static DTOPais crearDTOPais(Pais pais) {
		DTOPais dtoPais = new DTOPais(pais.getIdPais(), pais.getNombre());
		return dtoPais;
	}

	public static DTOProvincia crearDTOProvincia(Provincia provincia) {
		DTOProvincia dtoProvincia = new DTOProvincia(provincia.getIdProvincia(), provincia.getNombre());
		return dtoProvincia;
	}

	public static DTOLocalidad crearDTOLocalidad(Localidad localidad) {
		DTOLocalidad dtoLocalidad = new DTOLocalidad(localidad.getIdLocalidad(), localidad.getNombre());
		return dtoLocalidad;
	}

	public static DTOEstadocivil crearDTOEstadoCivil(Estadocivil estadoCivil) {
		DTOEstadocivil dtoEstadoCivil = new DTOEstadocivil(estadoCivil.getIdEstadoCivil(), estadoCivil.getNombre());

		return dtoEstadoCivil;
	}

}