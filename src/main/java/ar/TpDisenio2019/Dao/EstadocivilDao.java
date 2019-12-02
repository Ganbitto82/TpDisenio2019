package ar.TpDisenio2019.Dao;

import ar.TpDisenio2019.Modelo.Estadocivil;

public interface EstadocivilDao {
    
   public Estadocivil buscarPorId (int IDestadocivil);
    
    public void guardar (Estadocivil estadocivil);
    
}