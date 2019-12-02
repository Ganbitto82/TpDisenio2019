package ar.TpDisenio2019.Dao;


import ar.TpDisenio2019.Modelo.Factoresusados;


public interface FactoresusadosDao {
    
    public Factoresusados buscarPorId (int idFactoresusados);
    
    public void guardar (Factoresusados Factoresusados);
    
}