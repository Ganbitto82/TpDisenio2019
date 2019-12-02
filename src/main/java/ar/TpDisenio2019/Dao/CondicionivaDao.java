package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.Modelo.Condicioniva;


public interface CondicionivaDao {
    
    public Condicioniva buscarPorId (int idCondicioniva);
    
    public void guardar (Condicioniva condicioniva);
    
}