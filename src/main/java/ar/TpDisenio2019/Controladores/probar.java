package ar.TpDisenio2019.Controladores;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ar.TpDisenio2019.Modelo.Cliente;

;

@SuppressWarnings("deprecation")
public class probar {

	public static void main(String[] args) {
   
	Configuration configuration =new Configuration();	 
	configuration.configure("hibernate.cfg.xml");
	SessionFactory buildSessionFactory=configuration.buildSessionFactory();
	
	Session session=buildSessionFactory.openSession();
	 CriteriaQuery<Cliente> cq = session.getCriteriaBuilder().createQuery(Cliente.class);
		
	 cq.from(Cliente.class);
	 List<Cliente> clientes = session.createQuery(cq).getResultList();
	
		
	for(Cliente c :clientes  ) {
		System.out.println("nombre :" + c.getNombre());
		
	}
	session.close();
	}
		
		
	}


