package ar.TpDisenio2019.Dao;




import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.DTO.DTOMarca;
import ar.TpDisenio2019.Modelo.Marca;


public class MarcaDaoImp implements MarcaDao {
    
    private final SessionFactory sessionFactory;

    public MarcaDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Marca buscarPorId(int idMarca) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Marca> query = builder.createQuery(Marca.class);
        Root<Marca> root = query.from(Marca.class);
        query.select(root);
        query.where(builder.equal(root.get("idMarca"), idMarca));
        
        Marca marca = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return marca;
    }

    @Override
    public void guardar(Marca marca) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(marca);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<DTOMarca> obtenerDTOMarca() {
        
    	 Session session = sessionFactory.openSession();
    	 CriteriaQuery<Marca> cq = session.getCriteriaBuilder().createQuery(Marca.class);
	
    	 cq.from(Marca.class);
    	 List<Marca> marcas = session.createQuery(cq).getResultList();
    	 List<DTOMarca> listaDtoMarca = new ArrayList<>();
    	 
    	 DTOMarca dtoMarca;
         for(Marca m :marcas){
        	 dtoMarca = new DTOMarca(m.getIdMarca(),m.getMarca());
        	 listaDtoMarca.add(dtoMarca);
         }
    
        session.close();
        
        return listaDtoMarca;
    }
    
}
