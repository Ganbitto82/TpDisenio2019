package ar.TpDisenio2019.Utilitario;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;

public class ObtenerDtoDeUnCombo {

	public static DTOMarca ObtenerDTOMarca(String textoSeleccionado, List<DTOModelo> listaDtoModelo)
	{
		DTOMarca dtoBuscado = null;
		
		for(DTOModelo dtoModelo :listaDtoModelo)
		{
			
			if(dtoModelo.getNombre().compareTo(textoSeleccionado) == 0) {
				dtoBuscado = dtoModelo.getMarca();
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
	
	
	
}
