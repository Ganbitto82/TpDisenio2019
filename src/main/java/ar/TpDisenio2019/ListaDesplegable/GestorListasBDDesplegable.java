package ar.TpDisenio2019.ListaDesplegable;

import java.util.List;


import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.Dao.ProvinciaDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDaoImp;
import ar.TpDisenio2019.Modelo.Provincia;
import ar.TpDisenio2019.Dao.ProvinciaDaoImp;
import ar.TpDisenio2019.Modelo.Tipodedocumento;



public class GestorListasBDDesplegable {
	
	
	private ConexionBD session =new ConexionBD();
	
	private TipodedocumentoDao tipodedocumentoDao;
	private static ProvinciaDao provinciaDao;
	
	public GestorListasBDDesplegable() {
		 
		 this.tipodedocumentoDao= new TipodedocumentoDaoImp( session.Conexion());
		 this.provinciaDao= new ProvinciaDaoImp( session.Conexion()); 
				
	}
	
    public List<Tipodedocumento> ObtenerTiposDocumento() {
  
    	
    	List<Tipodedocumento> listaTipos =tipodedocumentoDao.obtenerTodas();
         	
		return listaTipos;
	}
    
    public static List<Provincia> ObtenerProvincias() {
  
    	
    	List<Provincia> listaProvincias =provinciaDao.obtenerTodas();
         	
		return listaProvincias;
	}
}

	
	



	

