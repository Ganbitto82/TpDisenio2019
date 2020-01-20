package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.Modelo.Modelo;


public interface ModeloDao {
    
    public Modelo buscarPorId (int idModelo);
    
    public void guardar (Modelo modelo);
    
  //  public List<DTOModelo> obtenerDTOModelo(DTOMarca dtoMarca, DTOAniodevehiculo dtoAniodeVehiculo);
    
    public List<DTOModelo> obtenerTodas();
}