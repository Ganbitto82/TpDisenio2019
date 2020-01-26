package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTODireccion;
import ar.TpDisenio2019.DTO.DTOLocalidad;

import ar.TpDisenio2019.DTO.DTOPais;
import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;

import ar.TpDisenio2019.Modelo.Cliente;
import ar.TpDisenio2019.Modelo.Localidad;

import ar.TpDisenio2019.Modelo.Pais;
import ar.TpDisenio2019.Modelo.Provincia;

public class pruebaConeccion2g {

	public static void main(String[] args) {
		List<DTOCliente> lista = new ArrayList<>();
		lista = pruebaCliente();
		for (DTOCliente dto : lista) {
			System.out.println(dto.getDireccion().getLocalidad().getProvincia().getNombre());

		}

	}

	public static List<DTOCliente> pruebaCliente() {
		ConexionBD cone = new ConexionBD();
		Session session = cone.Conexion().openSession();
		session.beginTransaction();
		CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);

		cq.from(Cliente.class);
		List<DTOCliente> listaDtoCliente = new ArrayList<>();
		List<Cliente> clientes = session.createQuery(cq).getResultList();
		DTOCliente nuevo;
		DTOTipodedocumento tipoDocumento;
		Pais pais;
		DTOPais dtopais;
		Provincia provincia;
		DTOProvincia dtoprovincia;
		Localidad localidad;
		DTOLocalidad dtolocalidad;
		DTODireccion direccion;

		for (Cliente c : clientes) {
			tipoDocumento = new DTOTipodedocumento();
			tipoDocumento.setIdTipoDeDocumento(c.getTipodedocumento().getIdTipoDeDocumento());
			tipoDocumento.setNombre(c.getTipodedocumento().getNombre());

			pais = c.getDireccion().getLocalidad().getProvincia().getPais();
			dtopais = new DTOPais();
			dtopais.setIdPais(pais.getIdPais());
			dtopais.setNombre(pais.getNombre());

			provincia = c.getDireccion().getLocalidad().getProvincia();
			dtoprovincia = new DTOProvincia();
			dtoprovincia.setIdProvincia(provincia.getIdProvincia());
			dtoprovincia.setNombre(provincia.getNombre());
			dtoprovincia.setPais(dtopais);

			localidad = c.getDireccion().getLocalidad();
			dtolocalidad = new DTOLocalidad();
			dtolocalidad.setIdLocalidad(localidad.getIdLocalidad());
			dtolocalidad.setNombre(localidad.getNombre());
			dtolocalidad.setProvincia(dtoprovincia);

			direccion = new DTODireccion();
			direccion.setIdDireccion(c.getDireccion().getIdDireccion());
			direccion.setCalle(c.getDireccion().getCalle());
			direccion.setNumero(c.getDireccion().getNumero());
			direccion.setPiso(c.getDireccion().getPiso());
			direccion.setDepartamento(c.getDireccion().getDepartamento());
			direccion.setLocalidad(dtolocalidad);

			nuevo = new DTOCliente();
			nuevo.setIdCliente(c.getIdCliente());
			nuevo.setNroCliente(c.getNroCliente());
			nuevo.setNroDocumento(c.getNroDocumento());
			nuevo.setNombre(c.getNombre());
			nuevo.setApellido(c.getApellido());
			nuevo.setTipodedocumento(tipoDocumento);
			nuevo.setDireccion(direccion);

			listaDtoCliente.add(nuevo);
		}
		session.close();

		return listaDtoCliente;
	}

}