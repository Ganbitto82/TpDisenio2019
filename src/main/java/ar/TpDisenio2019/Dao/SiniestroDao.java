package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.Modelo.Siniestro;


public interface SiniestroDao {
    
    public Siniestro buscarPorId (int idSiniestro);
    
    public void guardar (Siniestro siniestro);
    
    public List<Siniestro> obtenerTodas();
    
    public DTOSiniestro buscarPorCantidad(String cant);
}
