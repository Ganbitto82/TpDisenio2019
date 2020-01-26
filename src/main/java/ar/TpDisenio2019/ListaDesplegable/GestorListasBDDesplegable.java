package ar.TpDisenio2019.ListaDesplegable;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOAniodevehiculo;
import ar.TpDisenio2019.DTO.DTOLocalidad;
import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.DTO.DTOModelo;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.Dao.AniodeVehiculoDao;
import ar.TpDisenio2019.Dao.AniodeVehiculoDaoImp;
import ar.TpDisenio2019.Dao.FormasdepagoDao;
import ar.TpDisenio2019.Dao.FormasdepagoDaoImp;
import ar.TpDisenio2019.Dao.LocalidadDao;
import ar.TpDisenio2019.Dao.LocalidadDaoImp;
import ar.TpDisenio2019.Dao.MarcaDao;
import ar.TpDisenio2019.Dao.MarcaDaoImp;
import ar.TpDisenio2019.Dao.ModeloDao;
import ar.TpDisenio2019.Dao.ModeloDaoImp;
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

	private ConexionBD session = new ConexionBD();

	private TipodedocumentoDao tipodedocumentoDao;
	private static ProvinciaDao provinciaDao;
	private static LocalidadDao localidadDao;
	private static SiniestroDao siniestroDao;
	private static FormasdepagoDao formasdepagoDao;
	private static TipocoberturaDao tipocoberturaDao;
	private static MarcaDao marcaDao;
	private static AniodeVehiculoDao aniodeVehiculoDao;
	private static ModeloDao modeloDao;

	public GestorListasBDDesplegable() {

		this.tipodedocumentoDao = new TipodedocumentoDaoImp(session.Conexion());
		this.provinciaDao = new ProvinciaDaoImp(session.Conexion());
		this.localidadDao = new LocalidadDaoImp(session.Conexion());
		this.siniestroDao = new SiniestroDaoImp(session.Conexion());
		this.formasdepagoDao = new FormasdepagoDaoImp(session.Conexion());
		this.tipocoberturaDao = new TipocoberturaDaoImp(session.Conexion());
		this.marcaDao = new MarcaDaoImp(session.Conexion());
		this.aniodeVehiculoDao = new AniodeVehiculoDaoImp(session.Conexion());
		this.modeloDao = new ModeloDaoImp(session.Conexion());

	}

	public List<Tipodedocumento> ObtenerTiposDocumento() {

		List<Tipodedocumento> listaTipos = tipodedocumentoDao.obtenerTodas();

		return listaTipos;
	}

	public static List<Formasdepago> ObtenerFormasdepago() {

		List<Formasdepago> listaFormadepago = formasdepagoDao.obtenerTodas();

		return listaFormadepago;
	}

	public static List<Tipocobertura> ObtenerTipocobertura() {

		List<Tipocobertura> listaTipocobertura = tipocoberturaDao.obtenerTodas();

		return listaTipocobertura;
	}
	/*
	 * public static List<DTOLocalidad> ObtenerLocalidad() {
	 * 
	 * 
	 * List<DTOLocalidad> listaLocalidad = localidadDao.obtenerTodas();
	 * 
	 * return listaLocalidad; }
	 */

	public static List<Siniestro> ObtenerSiniestros() {

		List<Siniestro> listaSiniestro = siniestroDao.obtenerTodas();

		return listaSiniestro;
	}

	public static List<DTOMarca> obtenerMarca() {

		List<DTOMarca> listaDtoMarca = marcaDao.obtenerDTOMarca();
		return listaDtoMarca;
	}

	public static List<DTOAniodevehiculo> obtenerAniodeVehiculo() {

		List<DTOAniodevehiculo> listaDtoAniodevehiculo = aniodeVehiculoDao.obtenerDTOAnioVehiculo();
		return listaDtoAniodevehiculo;
	}
	/*
	 * public static List<DTOModelo> obtenerModelo(DTOMarca
	 * dtoMarca,DTOAniodevehiculo dtoAniodeVehiculo){
	 * 
	 * List<DTOModelo> listaDtoModelo= modeloDao.obtenerDTOModelo(dtoMarca,
	 * dtoAniodeVehiculo); return listaDtoModelo; }
	 */

	public List<DTOModelo> ObtenerModelo() {

		List<DTOModelo> listaModelos = modeloDao.obtenerTodas();
		return listaModelos;
	}

	public static List<DTOProvincia> obtenerProvincia() {

		List<DTOProvincia> listaDtoProvincia = provinciaDao.obtenerDTOProvincia();
		return listaDtoProvincia;
	}

	public List<DTOLocalidad> ObtenerLocalidad() {

		List<DTOLocalidad> listaLocalidad = localidadDao.obtenerTodas();
		return listaLocalidad;
	}

}
