package ar.TpDisenio2019.ListaDesplegable;

import java.util.List;


import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.Dao.FormasdepagoDao;
import ar.TpDisenio2019.Dao.FormasdepagoDaoImp;
import ar.TpDisenio2019.Dao.LocalidadDao;
import ar.TpDisenio2019.Dao.LocalidadDaoImp;
import ar.TpDisenio2019.Dao.ProvinciaDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDaoImp;
import ar.TpDisenio2019.Modelo.Formasdepago;
import ar.TpDisenio2019.Modelo.Provincia;
import ar.TpDisenio2019.Modelo.Siniestro;
import ar.TpDisenio2019.Modelo.Tipocobertura;
import ar.TpDisenio2019.Dao.ProvinciaDaoImp;
import ar.TpDisenio2019.Dao.SiniestroDao;
import ar.TpDisenio2019.Dao.SiniestroDaoImp;
import ar.TpDisenio2019.Dao.TipocoberturaDao;
import ar.TpDisenio2019.Dao.TipocoberturaDaoImp;
import ar.TpDisenio2019.Modelo.Tipodedocumento;

public class GestorListasBDDesplegable {
	
	
	private ConexionBD session =new ConexionBD();
	
	private TipodedocumentoDao tipodedocumentoDao;
	private static ProvinciaDao provinciaDao;
	private static LocalidadDao localidadDao;
	private static SiniestroDao siniestroDao;
	private static FormasdepagoDao formasdepagoDao;
	private static TipocoberturaDao tipocoberturaDao;
	
	public GestorListasBDDesplegable() {
		 
		 this.tipodedocumentoDao= new TipodedocumentoDaoImp( session.Conexion());
		 this.provinciaDao = new ProvinciaDaoImp( session.Conexion()); 
		 this.localidadDao = new LocalidadDaoImp( session.Conexion()); 
		 this.siniestroDao = new SiniestroDaoImp( session.Conexion()); 
		 this.formasdepagoDao = new FormasdepagoDaoImp( session.Conexion()); 
		 this.tipocoberturaDao = new TipocoberturaDaoImp( session.Conexion()); 
	}
	
    public List<Tipodedocumento> ObtenerTiposDocumento() {
  
    	
    	List<Tipodedocumento> listaTipos =tipodedocumentoDao.obtenerTodas();
         	
		return listaTipos;
	}
    
    public static List<Provincia> ObtenerProvincias() {
  
    	
    	List<Provincia> listaProvincias =provinciaDao.obtenerTodas();
         	
		return listaProvincias;
	}
    
    
    public static List<Formasdepago> ObtenerFormasdepago() {
    	
    	List<Formasdepago> listaFormadepago = formasdepagoDao.obtenerTodas();
         	
		return listaFormadepago;
	}
    
  public static List<Tipocobertura> ObtenerTipocobertura() {
    	
    	List<Tipocobertura> listaTipocobertura = tipocoberturaDao.obtenerTodas();
         	
		return listaTipocobertura;
	}
 /*  public static List<Localidad> ObtenerLocalidad() {
  
    	
    	List<Localidad> listaLocalidad = localidadDao.obtenerTodas();
         	
		return listaLocalidad;
	}*/
    
    
    public static List<Siniestro> ObtenerSiniestros() {
 
    	List<Siniestro> listaSiniestro = siniestroDao.obtenerTodas();
         	
		return listaSiniestro;
	}
}

	
	
	



	

