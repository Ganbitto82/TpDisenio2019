package ar.TpDisenio2019.Dao;
import java.util.List;


import ar.TpDisenio2019.Modelo.Provincia;

public interface ProvinciaDao {
    
    public Provincia buscarPorId (int idprovincia);
    
    public void guardar (Provincia provincia);
    
    public List<Provincia> obtenerTodas();
    
}