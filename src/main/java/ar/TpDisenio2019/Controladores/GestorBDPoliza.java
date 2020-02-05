package ar.TpDisenio2019.Controladores;

import java.util.List;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOSiniestro;
import ar.TpDisenio2019.DTO.DTOTipocobertura;
import ar.TpDisenio2019.Dao.CuotaDao;
import ar.TpDisenio2019.Dao.CuotaDaoImp;
import ar.TpDisenio2019.Dao.DatosdehijoDao;
import ar.TpDisenio2019.Dao.FactoresusadosDao;
import ar.TpDisenio2019.Dao.FactoresusadosDaoImp;
import ar.TpDisenio2019.Dao.FormasdepagoDao;
import ar.TpDisenio2019.Dao.FormasdepagoDaoImp;
import ar.TpDisenio2019.Dao.KmporanioDao;
import ar.TpDisenio2019.Dao.KmporanioDaoImp;
import ar.TpDisenio2019.Dao.MedidasdeseguridadDao;
import ar.TpDisenio2019.Dao.MedidasdeseguridadDaoImp;
import ar.TpDisenio2019.Dao.MedidasdeseguridadporcDao;
import ar.TpDisenio2019.Dao.MedidasdeseguridadporcDaoImp;
import ar.TpDisenio2019.Dao.ModificacionpolizaDao;
import ar.TpDisenio2019.Dao.ModificacionpolizaDaoImp;
import ar.TpDisenio2019.Dao.ParametrosgeneralesDao;
import ar.TpDisenio2019.Dao.ParametrosgeneralesDaoImp;
import ar.TpDisenio2019.Dao.PolizaDao;
import ar.TpDisenio2019.Dao.PolizaDaoImp;
import ar.TpDisenio2019.Dao.ReciboDao;
import ar.TpDisenio2019.Dao.ReciboDaoImp;
import ar.TpDisenio2019.Dao.SiniestroDao;
import ar.TpDisenio2019.Dao.SiniestroDaoImp;
import ar.TpDisenio2019.Dao.TipocoberturaDao;
import ar.TpDisenio2019.Dao.TipocoberturaDaoImp;
import ar.TpDisenio2019.Dao.VehiculoDao;
import ar.TpDisenio2019.Dao.VehiculoDaoImp;
import ar.TpDisenio2019.Modelo.Cuota;
import ar.TpDisenio2019.Modelo.Factoresusados;
import ar.TpDisenio2019.Modelo.Formasdepago;
import ar.TpDisenio2019.Modelo.Kmporanio;
import ar.TpDisenio2019.Modelo.Medidasdeseguridad;
import ar.TpDisenio2019.Modelo.Medidasdeseguridadporc;
import ar.TpDisenio2019.Modelo.Modificacionpoliza;
import ar.TpDisenio2019.Modelo.Parametrosgenerales;
import ar.TpDisenio2019.Modelo.Poliza;
import ar.TpDisenio2019.Modelo.Tipocobertura;
import ar.TpDisenio2019.Modelo.Vehiculo;

public class GestorBDPoliza {
	private ConexionBD session = new ConexionBD();

	private static PolizaDao polizaDao;
	private static TipocoberturaDao tipocoberturaDao;
	private static FormasdepagoDao formadepagoDao;
	private static VehiculoDao vehiculoDao;
	private static CuotaDao cuotaDao;
	private static KmporanioDao kmDao;
	private static MedidasdeseguridadDao medidasdeseguridadDao;
	private static ReciboDao reciboDao;
	private static FactoresusadosDao factoresDao;
	private static ModificacionpolizaDao modDao;
	private static SiniestroDao siniestroDao;
	private static ParametrosgeneralesDao parametrosDao;
	private static MedidasdeseguridadporcDao medidasDao;
	// static DatosdehijoDao hijosDao;
	
	
	public GestorBDPoliza() {

		GestorBDPoliza.polizaDao= new PolizaDaoImp( session.Conexion());
		GestorBDPoliza.tipocoberturaDao= new TipocoberturaDaoImp( session.Conexion());
		GestorBDPoliza.formadepagoDao = new FormasdepagoDaoImp(session.Conexion());
		GestorBDPoliza.vehiculoDao = new VehiculoDaoImp(session.Conexion());
		GestorBDPoliza.kmDao = new KmporanioDaoImp(session.Conexion());
		GestorBDPoliza.reciboDao = new ReciboDaoImp(session.Conexion());
		
		GestorBDPoliza.cuotaDao = new CuotaDaoImp(session.Conexion());
		GestorBDPoliza.factoresDao = new FactoresusadosDaoImp(session.Conexion());
		GestorBDPoliza.siniestroDao = new SiniestroDaoImp(session.Conexion());
		GestorBDPoliza.parametrosDao = new ParametrosgeneralesDaoImp(session.Conexion());
		GestorBDPoliza.modDao = new ModificacionpolizaDaoImp(session.Conexion());
		GestorBDPoliza.medidasDao = new MedidasdeseguridadporcDaoImp(session.Conexion());
		
		//GestorBDPoliza.hijosDao = new DatosdehijoDaoImp(session.Conexion());		
	}

	public Tipocobertura getTipocobertura(DTOTipocobertura dtotipocobertura) {
		List<Tipocobertura> lista = tipocoberturaDao.obtenerTodas();
		for (int i = 0; i < lista.size(); i++) {
			if (dtotipocobertura.getDescripcion().equals(lista.get(i).getDescripcion())) {
				return lista.get(i); /* Retorna un elemento de la lista de tipo de cobertura */
			}
		}
		return null;
	}

	public Formasdepago getFormadepago(DTOFormasdepago dtoformadepago) {
		List<Formasdepago> lista = formadepagoDao.obtenerTodas();
		for (int i = 0; i < lista.size(); i++) {
			if (dtoformadepago.getNombre().equals(lista.get(i).getNombre())) {
				return lista.get(i); /* Retorna un elemento de la lista de Forma de pago */
			}
		}
		return null;
	}
	
	public List<Medidasdeseguridad> obtenerListaMedidasdeseguridad() {
		List<Medidasdeseguridad> listaMedidasdeseguridad = medidasdeseguridadDao.obtenerTodas();

		return listaMedidasdeseguridad;
	}

	public static void guardarVehiculoAux(Vehiculo vehiculo) {
		vehiculoDao.guardar(vehiculo);
	}

	public static void guardarPolizaAux(Poliza poliza) {
		polizaDao.guardar(poliza);
	}

	public static DTOPoliza BuscarPoliza(Long numPoliza) {
		return polizaDao.buscarPorNumeroPoliza(numPoliza);

	}

	public static DTOCuota buscarPorId(int idCuota) {

		return cuotaDao.buscarPorId(idCuota);

	}
	
	public static void guardarRecibo(DTORecibo dtoRecibo) {
		reciboDao.guardar(dtoRecibo);
	}
	public static void guardarDTOCuota(DTOCuota dtocuota) {
		
		cuotaDao.guardarDTOCuota(dtocuota);
	}
	
	public static void guardarKmAux(Kmporanio km)
    {
    	kmDao.guardar(km);
    }
	
	public static void guardarCuotaAux(Cuota cuota)
    {
    	cuotaDao.guardar(cuota);
    }
	
	public static void guardarFactoresAux(Factoresusados f)
    {
    	factoresDao.guardar(f);
    }
    
    public static void guardarModificacionDePolizaAux(Modificacionpoliza modificacionPoliza)
    {
    	modDao.guardar(modificacionPoliza);
    }
    
    public static void guardarParametrosAux(Parametrosgenerales parametros)
    {
    	parametrosDao.guardar(parametros);
    }
    
    public static void guardarMedidasPorcAux(Medidasdeseguridadporc medidas)
    {
    	medidasDao.guardar(medidas);
    }
    
    public static DTOSiniestro BuscarSiniestro(String cantidad) {
		return siniestroDao.buscarPorCantidad(cantidad);
	}
    
    public static DTOFormasdepago BuscarFormasdepago(String tipo) {
		return formadepagoDao.buscarPorTipo(tipo);
	}
    
    public static DTOTipocobertura BuscarTipocobertura(String tipo) {
  		return tipocoberturaDao.buscarPorTipoCobertura(tipo);
  	}

}
