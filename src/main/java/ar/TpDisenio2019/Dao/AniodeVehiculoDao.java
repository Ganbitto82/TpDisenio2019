package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.Modelo.Aniodevehiculo;


public interface AniodeVehiculoDao {
    
    public Aniodevehiculo buscarPorId (int idAniodevehiculo);
    
    public void guardar (Aniodevehiculo aniodevehiculo);
    
   
	public List<DTOAniodevehiculo> obtenerDTOAnioVehiculo();
}

