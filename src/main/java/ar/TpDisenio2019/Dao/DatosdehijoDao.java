package ar.TpDisenio2019.Dao;


import java.util.List;


import ar.TpDisenio2019.Modelo.Datosdehijo;


public interface DatosdehijoDao {
    
    public Datosdehijo buscarPorId (int idDatosdehijo);
    
    public void guardar (Datosdehijo datosdehijo);
    
    public List<Datosdehijo> obtenerTodas();
    
}
