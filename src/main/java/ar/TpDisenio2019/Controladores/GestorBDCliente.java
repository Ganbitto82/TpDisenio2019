package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.Dao.ClienteDao;
import ar.TpDisenio2019.Dao.ClienteDaoImp;
import ar.TpDisenio2019.Dao.EstadocivilDao;
import ar.TpDisenio2019.Dao.EstadocivilDaoImp;

import ar.TpDisenio2019.Dao.TipodedocumentoDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDaoImp;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Estadocivil;
import ar.TpDisenio2019.Modelo.Tipodedocumento;



public class GestorBDCliente {
	
	
	private ConexionBD session =new ConexionBD();
	
	private static ClienteDao clienteDao;
	private static TipodedocumentoDao tipodedocumentoDao;
	private static EstadocivilDao estadocivilDao;
	
	public GestorBDCliente() {
		 
		GestorBDCliente.clienteDao= new ClienteDaoImp( session.Conexion());
		GestorBDCliente.tipodedocumentoDao= new TipodedocumentoDaoImp( session.Conexion());
		GestorBDCliente.estadocivilDao=new EstadocivilDaoImp  (session.Conexion());
	}
	
    public List<DTOCliente>  obtenerDTOCliente() {
  
    	
    	List<DTOCliente> listaCliente =clienteDao.obtenerDTOClientes();
         	
		return listaCliente;
	}

	public List<Estadocivil> obtenerListaEstadoCivil() {
		List<Estadocivil> listaEstadoCivil =estadocivilDao.obtenerTodas();
     	
		return listaEstadoCivil;
	}
    
 
    
    
    
}
