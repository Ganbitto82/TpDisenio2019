package ar.TpDisenio2019.Conexion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Poliza;

public class PruebaConeccionNroCliente {

	public static void main(String[] args) {
		
	
		Cliente c= new Cliente();
		c=null;
	
		Long l=155555551L;
		c= buscarPorId(l);
		if(c==null)
			System.out.println("No existe Cliente");
		
		else
		System.out.println(c.getApellido());
		

	}
      	
	 public static Cliente buscarPorId(Long nroCliente) {
		 ConexionBD cone= new ConexionBD();
		 Session session=cone.Conexion().openSession();
	     
	        
	        CriteriaBuilder builder = session.getCriteriaBuilder();
	        CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
	        Root<Cliente> root = query.from(Cliente.class);
	        query.select(root);
	        query.where(builder.equal(root.get("nroCliente"), nroCliente));
	        
	        Cliente cliente = session.createQuery(query).uniqueResult();
	        
	        session.close();
	        
	        return cliente;
	    }

}
