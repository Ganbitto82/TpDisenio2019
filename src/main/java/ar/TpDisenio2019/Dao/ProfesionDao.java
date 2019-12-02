package ar.TpDisenio2019.Dao;
import ar.TpDisenio2019.Modelo.Profesion;;

public interface ProfesionDao {
    
    public Profesion buscarPorId (int idProfesion);
    
    public void guardar (Profesion profesion);
    
}