package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import ar.TpDisenio2019.Modelo.Cliente;






@SuppressWarnings("unused")
public class PruebaConeccion {

	 
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

  
		 ConexionBD conexion=new ConexionBD();
		 Session session=(Session) conexion.Conexion().openSession();
		
		session.beginTransaction();
		 String consulta = new String("SELECT   c.nombre FROM Cliente c");
		 org.hibernate.query.Query q =  session.createQuery(consulta);	
		 List<Cliente> results = q.getResultList();
		 session.close();
		 for(Cliente cliente : results)
			 System.out.println(cliente.getApellido());
			 
		 for(Cliente c :results)		 
		 
		 System.out.println(c.getNombre().toString());
		 
				 
		 
	}

}
/*
 *  String consulta = new String("SELECT   c.nombre FROM Cliente c");
		 org.hibernate.query.Query q =  session.createQuery(consulta);	
		 List<Cliente> results = q.getResultList();
		 session.close();
		 for(Cliente cliente : results)
			 System.out.println(cliente.getApellido());*/
