package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Formasdepago;


public interface FormasdepagoDao {
    
    public Formasdepago buscarPorId (int idFormasdepago);
    
    public void guardar (Formasdepago Formasdepago);

	public List<Formasdepago> obtenerTodas();
    
}
