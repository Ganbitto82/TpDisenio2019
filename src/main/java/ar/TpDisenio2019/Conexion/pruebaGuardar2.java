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

public class pruebaGuardar2 {
	
	public static void main(String[] args) {
		Operador operador=new Operador();
		Recibo dtorecibo=new Recibo();
		operador.setNombre("lucas");
		operador.setIdOperador(6);
		guardarOP(operador);
		
		dtorecibo.setIdRecibo(1);
		dtorecibo.setOperador(operador);
		dtorecibo.setImporteTotal(1000f);
		
		guardar(dtorecibo);
		
			}
	


	public static void guardar(Recibo recibo) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();
		session.beginTransaction();
		
		Operador operador =new Operador();
		
		operador.setIdOperador(recibo.getOperador().getIdOperador());
		operador.setNombre(recibo.getOperador().getNombre());
		
		recibo.setIdRecibo(recibo.getIdRecibo());
		recibo.setOperador(operador);
		recibo.setImporteTotal(recibo.getImporteTotal());
		
		
		session.save(recibo);
		session.getTransaction().commit();
		session.close();
	}

	public static void guardarOP(Operador operador) {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();
		session.beginTransaction();
		session.save(operador);
		session.getTransaction().commit();
		session.close();
	}

	
}
