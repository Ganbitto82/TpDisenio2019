package ar.TpDisenio2019.ListaDesplegable;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;

import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOPais;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Estadocivil;
import ar.TpDisenio2019.Modelo.Formasdepago;
import ar.TpDisenio2019.Modelo.Localidad;
import ar.TpDisenio2019.Modelo.Pais;
import ar.TpDisenio2019.Modelo.Provincia;
import ar.TpDisenio2019.Modelo.Siniestro;
import ar.TpDisenio2019.Modelo.Tipocobertura;
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
	
	 public static List<DTOSiniestro> buscarDtosSiniestros(){
		 
			List<Siniestro> listaSiniestro = new ArrayList<Siniestro>();
			listaSiniestro = GestorListasBDDesplegable.ObtenerSiniestros();
			List<DTOSiniestro> listaDtosSiniestro = new ArrayList<DTOSiniestro>();
			for(int i = 0; i < listaSiniestro.size(); i++)
			{
				DTOSiniestro dtoSiniestro = new DTOSiniestro();
				dtoSiniestro.setIdSiniestro(listaSiniestro.get(i).getIdSiniestro());
				dtoSiniestro.setCantidad(listaSiniestro.get(i).getCantidad().toString());
				listaDtosSiniestro.add(dtoSiniestro);
			}
			
			return listaDtosSiniestro;
		}
	 
	 public static List<DTOFormasdepago> buscarDtosFormaDePago(){
		 
			List<Formasdepago> listaFormadepago = new ArrayList<Formasdepago>();
			listaFormadepago = GestorListasBDDesplegable.ObtenerFormasdepago();
			List<DTOFormasdepago> listaDtosFormadepago = new ArrayList<DTOFormasdepago>();
			for(int i = 0; i < listaFormadepago.size(); i++)
			{
				DTOFormasdepago dtoFormadepago = new DTOFormasdepago();
				dtoFormadepago.setIdFormasDePago(listaFormadepago.get(i).getIdFormasDePago());
				dtoFormadepago.setNombre(listaFormadepago.get(i).getNombre());
				listaDtosFormadepago.add(dtoFormadepago);
			}
			
		return listaDtosFormadepago;
	}
	 
	 public static List<DTOTipocobertura> buscarDtosTipocobertura(){
	
		 List<Tipocobertura> listaTipocobertura = new ArrayList<Tipocobertura>();
			listaTipocobertura = GestorListasBDDesplegable.ObtenerTipocobertura();
			List<DTOTipocobertura> listaDtosTipocobertura = new ArrayList<DTOTipocobertura>();
			for(int i = 0; i < listaTipocobertura.size(); i++)
			{
				DTOTipocobertura dtoTipocobertura = new DTOTipocobertura();
				dtoTipocobertura.setIdTipoCobertura(listaTipocobertura.get(i).getIdTipoCobertura());
				dtoTipocobertura.setTipo(listaTipocobertura.get(i).getTipo());
				listaDtosTipocobertura.add(dtoTipocobertura);
			}
			
		return listaDtosTipocobertura;
	}
	 
	public static List<DTOLocalidad> buscarDtosLocalidad( ){
			
		List<DTOLocalidad> dtoListaLocalidad = new ArrayList<DTOLocalidad>();

		dtoListaLocalidad = gestionListaDesplegable.ObtenerLocalidad();
				
		return dtoListaLocalidad;
	}
	 
   public static List<DTOModelo> buscarDtosModelo(){
			
		List<DTOModelo> dtoListaModelo = new ArrayList<DTOModelo>();

		dtoListaModelo = gestionListaDesplegable.ObtenerModelo();
			
		return dtoListaModelo;
	}

	public static DTOPais crearDTOPais(Pais pais) {
		DTOPais dtoPais = new DTOPais();
		dtoPais.setIdPais(pais.getIdPais());
		dtoPais.setNombre(pais.getNombre());
		return dtoPais;
	}

	public static DTOProvincia crearDTOProvincia(Provincia provincia) {
		DTOProvincia dtoProvincia = new DTOProvincia();
		dtoProvincia.setIdProvincia(provincia.getIdProvincia());
		dtoProvincia.setNombre(provincia.getNombre());
		return dtoProvincia;
	}

	public static DTOLocalidad crearDTOLocalidad(Localidad localidad) {
		DTOLocalidad dtoLocalidad = new DTOLocalidad();
		dtoLocalidad.setIdLocalidad(localidad.getIdLocalidad());
		dtoLocalidad.setNombre(localidad.getNombre());
		return dtoLocalidad;
	}

	public static DTOEstadocivil crearDTOEstadoCivil(Estadocivil estadoCivil) {
		DTOEstadocivil dtoEstadoCivil = new DTOEstadocivil();
		dtoEstadoCivil.setIdEstadoCivil(estadoCivil.getIdEstadoCivil());
		dtoEstadoCivil.setNombre(estadoCivil.getNombre());
		return dtoEstadoCivil;
	}
	
	public static  List<DTOMarca>  obtenerDTOMarca() {
	
    	List<DTOMarca> listaDtoMarca =GestorListasBDDesplegable.obtenerMarca();
         	
		return listaDtoMarca;
	}
	
    public static  List<DTOAniodevehiculo>  obtenerDTOAniodeVehiculo() {

    	List<DTOAniodevehiculo> listaDtoAniodevehiculo =GestorListasBDDesplegable.obtenerAniodeVehiculo();
         	
		return listaDtoAniodevehiculo;
	}
	
 /*   public static List<DTOModelo> obtenerDTOModelo(DTOMarca dtoMarca,DTOAniodevehiculo dtoAniodeVehiculo){

    	List<DTOModelo> listaDtoModelo=GestorListasBDDesplegable.obtenerModelo(dtoMarca, dtoAniodeVehiculo);
    	
    	return  listaDtoModelo;	
    }*/
    
	public static  List<DTOProvincia>  obtenerDTOProvincia() {
    	
    	List<DTOProvincia> listaDtoProvincia =GestorListasBDDesplegable.obtenerProvincia();
         	
		return listaDtoProvincia;
	}

}