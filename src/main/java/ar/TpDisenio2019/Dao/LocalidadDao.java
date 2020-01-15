package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.Modelo.Localidad;

public interface LocalidadDao {
    
    public Localidad buscarPorId (int idlocalidad);
    
    public void guardar (Localidad localidad);
    
    public List<DTOLocalidad> obtenerDTOLocalidad(DTOProvincia dtoProvincia);
    
    public List<DTOLocalidad> obtenerTodas();
    
}