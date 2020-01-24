package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Modelo.Poliza;


public interface PolizaDao {
    
    public DTOPoliza buscarPorNumeroPoliza (Long numPoliza);
    
    public void guardar (Poliza poliza);
    
}