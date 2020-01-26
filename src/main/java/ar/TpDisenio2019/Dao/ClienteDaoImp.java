package ar.TpDisenio2019.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
import ar.TpDisenio2019.Modelo.Tipodedocumento;

public class ClienteDaoImp implements ClienteDao {

	private final SessionFactory sessionFactory;

	public ClienteDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Cliente buscarPorId(int idCliente) {
		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
		Root<Cliente> root = query.from(Cliente.class);
		query.select(root);
		query.where(builder.equal(root.get("idCliente"), idCliente));

		Cliente cliente = session.createQuery(query).uniqueResult();

		session.close();

		return cliente;
	}

	@Override
	public void guardar(Cliente cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cliente);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Cliente> obtenerTodas() {

		Session session = sessionFactory.openSession();
		CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);

		cq.from(Cliente.class);
		List<Cliente> clientes = session.createQuery(cq).getResultList();

		session.close();

		return clientes;
	}

	public List<DTOCliente> obtenerDTOClientes() {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);

		cq.from(Cliente.class);
		List<Cliente> clientes = session.createQuery(cq).getResultList();
		List<DTOCliente> listaDtoCliente = new ArrayList<>();

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
