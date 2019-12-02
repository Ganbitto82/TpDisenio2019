package ar.TpDisenio2019.Dao;



import ar.TpDisenio2019.Modelo.Modificacionpoliza;


public interface ModificacionpolizaDao {
    
    public Modificacionpoliza buscarPorId (int idModificacionpoliza);
    
    public void guardar (Modificacionpoliza modificacionpoliza);
    
}

