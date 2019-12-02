package ar.TpDisenio2019.Dao;


import ar.TpDisenio2019.Modelo.Formasdepago;


public interface FormasdepagoDao {
    
    public Formasdepago buscarPorId (int idFormasdepago);
    
    public void guardar (Formasdepago Formasdepago);
    
}
