package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.Modelo.Cliente;

@SuppressWarnings("unused")
public class PruebaConeccion {
	public static void main(String[] args) {

  
		Cliente c=new Cliente();
	    //c.setNombre("ANA MARIA");
	      buscarNombre("ANA MARIA");
			 
		 for(Cliente c :results)		 
		 
		 System.out.println(c.getNombre().toString());
		 
				 
		 
	}


public Cliente buscarNombre(String nombre) {
   
    ConexionBD conexion=new ConexionBD();
	 Session session=(Session) conexion.Conexion().openSession();
    CriteriaBuilder builder = session.getCriteriaBuilder();
    CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
    Root<Cliente> root = query.from(Cliente.class);
    query.select(root);
    query.where(builder.equal(root.get("nombre"), nombre));
    
    Cliente cliente = session.createQuery(query).uniqueResult();
    
    session.close();
    
    return cliente;
}