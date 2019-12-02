package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.Modelo.Numeropoliza;


public interface NumeropolizaDao {
    
    public Numeropoliza buscarPorId (int idNumeropoliza);
    
    public void guardar (Numeropoliza numeropoliza);
    
}