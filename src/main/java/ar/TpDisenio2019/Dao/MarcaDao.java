package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Marca;


public interface MarcaDao {
    
    public Marca buscarPorId (int idMarca);
    
    public void guardar (Marca marca);
    
    public List<Marca> obtenerTodas();
}
