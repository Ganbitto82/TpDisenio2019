package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Cuota;


public interface CuotaDao {
    
    public Cuota buscarPorId (int idCuota);
    
    public void guardar (Cuota cuota);
    
    public List<Cuota> obtenerTodas();
}
