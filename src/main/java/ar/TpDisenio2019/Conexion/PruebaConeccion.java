package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Tipodedocumento;

@SuppressWarnings("unused")
public class PruebaConeccion {
	public static void main(String[] args) {

         long numeroCliente=0155555551;
         DTOTipodedocumento dtoTipo =new DTOTipodedocumento();
         
		//Cliente c=new Cliente();
	  	DTOCliente dtoCliente =new DTOCliente();		 
		dtoCliente.setNroCliente(numeroCliente);
	  	dtoCliente.setNombre("ANA MARIA"); 
		dtoCliente.setApellido("ALVAREZ");
		dtoTipo.setNombre("DNI");
		dtoCliente.setTipodedocumento(dtoTipo);
		
		 buscarCliente
				 
		 
	}

	
	   @SuppressWarnings("unchecked")
		public List<Cliente> buscarCliente(DTOCliente dtoCliente){
			
	    	ConexionBD conexion = new ConexionBD();
	    	
	    	Session session = (Session) conexion.Conexion();
	    	
	    	long numeroCliente= dtoCliente.getNroCliente();
			String nombre = dtoCliente.getNombre();
			String apellido =dtoCliente.getApellido();
			int nunmDoc =dtoCliente.getNroDocumento();
					
			String tipo= dtoCliente.getTipodedocumento().getNombre();
			
					
			try{
					
				String consulta = new String("select c.idCliente, c.nombre, c.apellido ,c.nroCliente ,c.nroDocumento ,t.idTipoDeDocumento,"
						+ "t.nombre from Cliente c , Tipodedocumento t where ");
				if(numeroCliente != 0) consulta += "c.nroCliente = numeroCliente";
				
				
				/*if (numeroCliente != 0 && nombre != "") consulta += " AND ";
				if (nombre != "") consulta += "c.nombre LIKE :nombre";
				if ((nombre != "" || numeroCliente != 0) && apellido != "") consulta += " AND ";
				if (apellido != "") consulta += "c.apellido LIKE :apellido";
				else if ((nombre != "" || numeroCliente != 0 ||apellido != "") && tipo != "") consulta += " AND ";
				else if (tipo != "") consulta += "t.nombre = :tipo";
				else if ((nombre != "" || numeroCliente != 0||apellido != "" || tipo != "") && nunmDoc != 0) consulta += " AND ";
				else if (nunmDoc!= 0) consulta += "c.mumeroDoc LIKE :mumeroDoc";
				//consulta += " AND eliminado = 'N'";*/

				Query q = (Query) session.createQuery(consulta);
				if(numeroCliente != 0)  ((org.hibernate.query.Query<Cliente>) q).setParameter("numeroCliente","%" +  numeroCliente + "%");
				//if(nombre != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("nombre","%" +  nombre + "%");
				//if(apellido != null) ((org.hibernate.query.Query<Cliente>) q).setParameter("apellido","%" +  apellido + "%");
				
				
				List<String> results = ((org.hibernate.query.Query<String>) q).getResultList();
				//List<Cliente> clientes = new ArrayList<Cliente>();
				
				for(String aux : results)
					System.out.println(aux);
				
				/*for(String aux : results){
					
					Cliente c = new Cliente();
					
					Tipodedocumento tipoDoc =new Tipodedocumento(); 
					tipoDoc.setIdTipoDeDocumento(c.setTipodedocumento(tipodedocumento););
					tipoDoc.setNombre(aux.getTipodedocumento().getNombre());
					c.setTipodedocumento(tipoDoc);
					c.setNroDocumento(aux.getNroDocumento());
					c.setNombre(aux.getNombre());
					c.setApellido(aux.getApellido());
					c.setNroCliente(aux.getNroCliente());
								 
					
					clientes.add(c);*/
				return null;
			
			//return clientes;
			
			} catch (RuntimeException re) {
				System.out.println("Problema al buscar");
				throw re;
			}finally{
				session.close();
			}
			
		}
    