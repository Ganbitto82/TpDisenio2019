package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.Dao.ClienteDao;
import ar.TpDisenio2019.Dao.ClienteDaoImp;
import ar.TpDisenio2019.Modelo.Cliente;



public class GestorBDCliente {
	
	
	private ConexionBD session =new ConexionBD();
	
	private ClienteDao clienteDao;
	
	public GestorBDCliente() {
		 
		 this.clienteDao= new ClienteDaoImp( session.Conexion());
		
		
	}
	
    public static List<Cliente> buscarCliente(DTOCliente cliente) {
  
    	
    	List<Cliente> listaCliente =clienteDao.buscarCliente(cliente);
         	
		return listaCliente;
	}
}
