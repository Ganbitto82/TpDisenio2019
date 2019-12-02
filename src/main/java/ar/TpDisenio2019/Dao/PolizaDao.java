package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.Modelo.Poliza;


public interface PolizaDao {
    
    public Poliza buscarPorId (int idPoliza);
    
    public void guardar (Poliza poliza);
    
}