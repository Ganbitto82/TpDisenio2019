package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Cliente;


public interface ClienteDao {
    
    public Cliente buscarPorId (int idCliente);
    
    public void guardar (Cliente cliente);
    
    public List<Cliente> obtenerTodas();
    
    public List<Cliente> obtenerCliente(String numeroCliente, String apellido, String nombre, String tipoDocumento , String nroDoc);
    
    
}

