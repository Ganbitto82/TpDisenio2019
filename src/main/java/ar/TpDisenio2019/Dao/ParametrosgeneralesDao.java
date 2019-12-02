package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.Modelo.Parametrosgenerales;


public interface ParametrosgeneralesDao {
    
    public Parametrosgenerales buscarPorId (int idParametrosgenerales);
    
    public void guardar (Parametrosgenerales parametrosgenerales);
    
}