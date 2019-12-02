package ar.TpDisenio2019.Dao;


import ar.TpDisenio2019.Modelo.Kmporanio;


public interface KmporanioDao {
    
    public Kmporanio buscarPorId (int idKmporanio);
    
    public void guardar (Kmporanio kmporanio);
    
}
