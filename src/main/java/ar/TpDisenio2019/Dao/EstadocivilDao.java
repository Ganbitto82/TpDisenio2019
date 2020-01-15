package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.Modelo.Estadocivil;

public interface EstadocivilDao {
    
   public Estadocivil buscarPorId (int IDestadocivil);
    
    public void guardar (Estadocivil estadocivil);
    
    public List<Estadocivil> obtenerTodas();
	
}