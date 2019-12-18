package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.Dao.ClienteDao;
import ar.TpDisenio2019.Dao.ClienteDaoImp;
import ar.TpDisenio2019.Dao.TipodedocumentoDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDaoImp;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Tipodedocumento;



public class GestorBDCliente {
	
	
	private ConexionBD session =new ConexionBD();
	
	private static ClienteDao clienteDao;
	private static TipodedocumentoDao tipodedocumentoDao;
	
	public GestorBDCliente() {
		 
		GestorBDCliente.clienteDao= new ClienteDaoImp( session.Conexion());
		GestorBDCliente.tipodedocumentoDao= new TipodedocumentoDaoImp( session.Conexion());
		
	}
	
    public List<Cliente>  obtenerTodas() {
  
    	
    	List<Cliente> listaCliente =clienteDao.obtenerTodas();
         	
		return listaCliente;
	}
    
  public Tipodedocumento buscarPorId (int idTipodedocumento) {
  
    	
	  Tipodedocumento tipo =tipodedocumentoDao.buscarPorId(idTipodedocumento);
         	
		return  tipo ;
	}
    
    
    
}
