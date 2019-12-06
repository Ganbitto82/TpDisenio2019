package ar.TpDisenio2019.Controladores;


import java.util.List;



import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.Dao.ClienteDao;
import ar.TpDisenio2019.Dao.ClienteDaoImp;

import ar.TpDisenio2019.Modelo.Cliente;


public class GestorBDCliente {

     private ConexionBD session =new ConexionBD();
	 private  ClienteDao clienteDao;
	
	public GestorBDCliente() {
		 
		 this.clienteDao= new ClienteDaoImp(session.Conexion());
		
		}
	
		
	public  List<Cliente> buscarCliente(String numeroCliente, String apellido, String nombre, String tipoDocumento , String nroDoc)
	{
	
		
			List<Cliente> listaCliente =clienteDao.obtenerCliente(numeroCliente, apellido, nombre, tipoDocumento, nroDoc);
     	
		return listaCliente;
			
	}
		
	

		/*List<Cliente> listaCliente = new ArrayList<>();
	
	
		ConexionBD session =new ConexionBD();
		Session iniciaSesion=(Session) session.Conexion();
		String hql = ("from Cliente C\r\n" + 
					//		"where (c.idDireccion =  d.idDireccion) and (d.idLocalidad = l.idLocalidad) and (c.idTipoDeDocumento = t.idTipoDeDocumento)\r\n" + 
						//	"and (l.idProvincia = p.idProvincia)"
							 "where C.apellido LIKE "+apellido+" AND C.nombre LIKE "+ nombre+" AND C.nroDocumento ="+nroDoc+" AND \"\r\n");
							
		Query query = (Query) iniciaSesion.createQuery(hql);
		return listaCliente= ((org.hibernate.query.Query<Cliente>) query).list();
		

				/*
		if(numeroCliente.length()>0)
		{
			
				try
				{
									
					Squery = (""
				 		+ "SELECT pasajero.id, número_documento, pasajero.nombre,  apellido, fecha_nacimiento, código_país_teléfono, código_área_teléfono, número_teléfono, email, id_posición_frente_al_iva, "
				 			+ "id_nacionalidad, id_ocupación,id_tipo_de_documento,tipo_de_documento.nombre AS NOMBRE_TIPO_DOC, ocupación.nombre AS NOMBRE_OCUPACION, nacionalidad.nombre AS NOMBRE_NACIONALIDAD, "
				 			+ "posición_frente_al_iva.nombre AS NOMBRE_POSICION, tipo_cuit, número_cuit, dígito_verificador_cuit, eliminado, id_dirección, calle, número, departamento, piso, id_localidad, "
				 			+ "localidad.nombre, código_postal, id_provincia, provincia.nombre, id_país, país.nombre "
					 	+ "FROM pasajero JOIN tipo_de_documento JOIN ocupación JOIN nacionalidad JOIN posición_frente_al_iva JOIN persona "
					 		+ "JOIN dirección JOIN localidad JOIN provincia JOIN país "
					 	+ "WHERE apellido LIKE ? AND pasajero.nombre LIKE ? AND número_documento = ? AND tipo_de_documento.nombre = ? AND "
					 		+ "id_tipo_de_documento=tipo_de_documento.id AND id_nacionalidad=nacionalidad.id AND id_ocupación= ocupación.id AND "
					 		+ "id_posición_frente_al_iva= posición_frente_al_iva.id AND pasajero.id= persona.id AND id_dirección= dirección.id AND "
					 		+ "id_localidad= localidad.id AND id_provincia=provincia.id AND id_país=país.id");
					
					
					preparedStatement.setString(1, apellido);
					preparedStatement.setString(2, nombre);
					preparedStatement.setString(3, nroDoc);
					preparedStatement.setString(4, tipoDoc);
					rs = preparedStatement.executeQuery();
				}
				catch (SQLException ex)
				{
			    
				}
			}
			*/
}

