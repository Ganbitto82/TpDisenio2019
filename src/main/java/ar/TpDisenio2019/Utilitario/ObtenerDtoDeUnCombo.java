package ar.TpDisenio2019.Utilitario;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOProvincia;

public class ObtenerDtoDeUnCombo {

	public static DTOMarca ObtenerDTOMarca(String textoSeleccionado, List<DTOMarca> listaDtoMarca)
	{
		DTOMarca dtoBuscado = null;
		
		for(DTOMarca dtoMarca :listaDtoMarca)
		{
			
			if( dtoMarca.getMarca().compareTo(textoSeleccionado) == 0) {
				dtoBuscado = dtoMarca;
				break;
			}
			
		}
			
		return dtoBuscado;
	}
	
	public static DTOAniodevehiculo ObtenerDTOAnio(String textoSeleccionado, List<DTOModelo> listaDtoModelo)
	{
		DTOAniodevehiculo dtoBuscado = null;
		
		for(DTOModelo dtoModelo :listaDtoModelo)
		{
			if(dtoModelo.getNombre().compareTo(textoSeleccionado) == 0)
				dtoBuscado = dtoModelo.getAniodevehiculo();
			break;
		}
			
		return dtoBuscado;
	}
	
	public static DTOModelo ObtenerDTOModelo(String textoSeleccionado, List<DTOModelo> listaDtoModelo)
	{
		DTOModelo dtoBuscado = null;
		
		for(DTOModelo dtoModelo :listaDtoModelo)
		{
			
			if( dtoModelo.getNombre().compareTo(textoSeleccionado) == 0) {
				dtoBuscado = dtoModelo;
				break;
			}
			
		}
			
		return dtoBuscado;
	}
	
	public static DTOProvincia ObtenerDTOProvincia(String textoSeleccionado, List<DTOProvincia> listaDtoProvincia)
	{
		DTOProvincia dtoBuscado = null;
		
		for(DTOProvincia dtoProvincia :listaDtoProvincia)
		{
			
			if(dtoProvincia.getNombre().compareTo(textoSeleccionado) == 0) {
				dtoBuscado = dtoProvincia;
				break;
			}	
		}
		return dtoBuscado;
	}
}
