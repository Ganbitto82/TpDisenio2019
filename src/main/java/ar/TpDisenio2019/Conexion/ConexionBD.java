package ar.TpDisenio2019.Conexion;



import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.jdbc.Connection;


public class ConexionBD {
    
    public SessionFactory Conexion () {
        SessionFactory sessionFactory = null;
        
        // A SessionFactory is set up once for an application!
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
			.build();
	try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	}
	catch (Exception e) {
            System.out.println("Error al crear factory: " + e.getMessage());

            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
	}
        
        return sessionFactory;
    }
    
}