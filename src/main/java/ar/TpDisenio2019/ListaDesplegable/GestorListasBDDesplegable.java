package ar.TpDisenio2019.ListaDesplegable;

import java.util.List;


import ar.TpDisenio2019.Conexion.ConexionBD;

import ar.TpDisenio2019.Dao.TipodedocumentoDao;
import ar.TpDisenio2019.Dao.TipodedocumentoDaoImp;
import ar.TpDisenio2019.Modelo.Tipodedocumento;



public class GestorListasBDDesplegable {
	
	private TipodedocumentoDao tipodedocumentoDao;
	
	public GestorListasBDDesplegable() {
		 ConexionBD session =new ConexionBD();
		 this.tipodedocumentoDao= new TipodedocumentoDaoImp( session.Conexion());
		
		
	}
	
    public List<Tipodedocumento> ObtenerTiposDocumento() {
  
    	
    	List<Tipodedocumento> listaTipos =tipodedocumentoDao.obtenerTodas();
         	
		return listaTipos;
	}
}

	
	



	

