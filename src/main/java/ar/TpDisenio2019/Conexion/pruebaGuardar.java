package ar.TpDisenio2019.Conexion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.Controladores.GestorOperador;
import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.Modelo.Operador;
import ar.TpDisenio2019.Modelo.Recibo;

public class pruebaGuardar {
	
	public static void main(String[] args) {
		DTOOperador dtooperador=new DTOOperador();
		DTORecibo dtorecibo=new DTORecibo();
		dtooperador.setNombre("lucas");
		dtooperador.setIdOperador(10);
		
		guardarOP(dtooperador);
		dtorecibo.setIdRecibo(1);
		dtorecibo.setOperador(dtooperador);
		dtorecibo.setImporteTotal(1000f);
	
		
		guardar(dtorecibo);
		
			}
	


	public static void guardar(DTORecibo dtorecibo) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();
		session.beginTransaction();
		
		Recibo recibo=new Recibo();
		Operador operador =new Operador();
		
		operador.setIdOperador(dtorecibo.getOperador().getIdOperador());
		operador.setNombre(dtorecibo.getOperador().getNombre());
		
		recibo.setIdRecibo(dtorecibo.getIdRecibo());
		recibo.setOperador(operador);
		recibo.setImporteTotal(dtorecibo.getImporteTotal());
		
		
		
		
	/*	dtorecibo.setNroRecibo(dtorecibo.getNroRecibo());
		dtorecibo.setFecha(dtorecibo.getFecha());
		dtorecibo.setHora(dtorecibo.getHora());
		dtorecibo.setUltimoDiaDePago(dtorecibo.getUltimoDiaDePago());*/
		
		session.save(recibo);
		session.getTransaction().commit();
		session.close();
			
		
	}

	public static void guardarOP(DTOOperador dtooperador) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();
		session.beginTransaction();
        Operador operador=new Operador();
		
		operador.setIdOperador(dtooperador.getIdOperador());
		operador.setNombre(dtooperador.getNombre());	
		
		session.save(operador);
		session.getTransaction().commit();
		session.close();
	}

	
}
