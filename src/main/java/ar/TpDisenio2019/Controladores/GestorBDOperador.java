package ar.TpDisenio2019.Controladores;


import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.Dao.OperadorDao;
import ar.TpDisenio2019.Dao.OperadorDaoImp;
import ar.TpDisenio2019.Modelo.Operador;

public class GestorBDOperador {
private ConexionBD session =new ConexionBD();
	
	private static OperadorDao operadorDao;

	public GestorBDOperador() {
		 
		GestorBDOperador.operadorDao= new OperadorDaoImp( session.Conexion());
	}
    
    public static void guardarOperadorAux(Operador operador)
    {
    	operadorDao.guardar(operador);
    }
    
    public static DTOOperador buscarPorNombre(String nombre)
    {
    	return	operadorDao.buscarNombre(nombre);
    }
}

	
	
	

