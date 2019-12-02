package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.Modelo.Localidad;

public interface LocalidadDao {
    
    public Localidad buscarPorId (int idlocalidad);
    
    public void guardar (Localidad localidad);
    
    public List<Localidad> obtenerTodas();
    
}