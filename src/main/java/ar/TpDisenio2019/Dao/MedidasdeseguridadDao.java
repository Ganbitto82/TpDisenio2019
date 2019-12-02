package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Medidasdeseguridad;


public interface MedidasdeseguridadDao {
    
    public Medidasdeseguridad buscarPorId (int idMedidasdeseguridad);
    
    public void guardar (Medidasdeseguridad medidasdeseguridad);
    
    public List<Medidasdeseguridad> obtenerTodas();
}
