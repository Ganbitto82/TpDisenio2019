package ar.TpDisenio2019.Dao;


import ar.TpDisenio2019.Modelo.Estado;


public interface EstadoDao {
    
    public Estado buscarPorId (int idEstado);
    
    public void guardar (Estado estado);
    
}
