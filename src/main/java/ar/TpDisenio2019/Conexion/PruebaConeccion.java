package ar.TpDisenio2019.Conexion;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import ar.TpDisenio2019.Modelo.Cliente;





public class PruebaConeccion {

	 
	
	 public static void main(String[] args) {

  
		 ConexionBD conexion=new ConexionBD();
		 Session session=(Session) conexion.Conexion().openSession();
		
    	 CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);
	
    	 cq.from(Cliente.class);
    	 List<Cliente> clientes = session.createQuery(cq).getResultList();
    
        session.close();
        
        for(Cliente c: clientes)
        	System.out.println(c.getNombre());
        	
	}

}
/*
 *  String consulta = new String("SELECT   c.nombre FROM Cliente c");
		 org.hibernate.query.Query q =  session.createQuery(consulta);	
		 List<Cliente> results = q.getResultList();
		 session.close();
		 for(Cliente cliente : results)
			 System.out.println(cliente.getApellido());*/
