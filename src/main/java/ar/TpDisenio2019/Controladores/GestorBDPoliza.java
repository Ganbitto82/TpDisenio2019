package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.Dao.FormasdepagoDao;
import ar.TpDisenio2019.Dao.FormasdepagoDaoImp;
import ar.TpDisenio2019.Dao.PolizaDao;
import ar.TpDisenio2019.Dao.PolizaDaoImp;
import ar.TpDisenio2019.Dao.TipocoberturaDao;
import ar.TpDisenio2019.Dao.TipocoberturaDaoImp;
import ar.TpDisenio2019.Dao.VehiculoDao;
import ar.TpDisenio2019.Dao.VehiculoDaoImp;
import ar.TpDisenio2019.Modelo.Formasdepago;
import ar.TpDisenio2019.Modelo.Poliza;
import ar.TpDisenio2019.Modelo.Tipocobertura;
import ar.TpDisenio2019.Modelo.Vehiculo;

public class GestorBDPoliza {
private ConexionBD session =new ConexionBD();
	
	private static PolizaDao polizaDao;
	private static TipocoberturaDao tipocoberturaDao;
	private static FormasdepagoDao formadepagoDao;
	private static VehiculoDao vehiculoDao;
	
	public GestorBDPoliza() {
		 
		GestorBDPoliza.polizaDao= new PolizaDaoImp( session.Conexion());
		GestorBDPoliza.tipocoberturaDao= new TipocoberturaDaoImp( session.Conexion());
		GestorBDPoliza.formadepagoDao = new FormasdepagoDaoImp(session.Conexion());
		GestorBDPoliza.vehiculoDao = new VehiculoDaoImp(session.Conexion());
	}
	
    public Tipocobertura  getTipocobertura(DTOTipocobertura dtotipocobertura) {
    	List <Tipocobertura> lista= tipocoberturaDao.obtenerTodas();
    	for(int i=0;i<lista.size();i++) {
    		if(dtotipocobertura.getDescripcion().equals(lista.get(i).getDescripcion()))
    		{
    			return lista.get(i);	/*Retorna un elemento de la lista de tipo de cobertura*/
    		}
    	}
    	return null;
    }
  
    public Formasdepago  getFormadepago(DTOFormasdepago dtoformadepago) {
    	List <Formasdepago> lista= formadepagoDao.obtenerTodas();
    	for(int i=0;i<lista.size();i++) {
    		if(dtoformadepago.getNombre().equals(lista.get(i).getNombre()))
    		{
    			return lista.get(i);	/*Retorna un elemento de la lista de Forma de pago*/
    		}
    	}
    	return null;
    }
    
    public static void guardarVehiculoAux(Vehiculo vehiculo)
    {
    	vehiculoDao.guardar(vehiculo);
    }
     
    public static void guardarPolizaAux(Poliza poliza)
    {
    	polizaDao.guardar(poliza);
    }
}

	
	
	

