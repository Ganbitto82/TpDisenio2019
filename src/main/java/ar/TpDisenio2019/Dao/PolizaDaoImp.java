package ar.TpDisenio2019.Dao;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.TpDisenio2019.Conexion.ConexionBD;
import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Poliza;


public class PolizaDaoImp implements PolizaDao {
    
    private final SessionFactory sessionFactory;

    public PolizaDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public  DTOPoliza buscarPorNumeroPoliza(Long nroPoliza) {
   	 ConexionBD cone= new ConexionBD();
   	 
   	 Session session=cone.Conexion().openSession();
   	 
   	   
          CriteriaBuilder builder = session.getCriteriaBuilder();
          CriteriaQuery<Poliza> query = builder.createQuery(Poliza.class);
          Root<Poliza> root = query.from(Poliza.class);
          query.select(root);
          query.where(builder.equal(root.get("nroPoliza"), nroPoliza));
          
          Poliza poliza = session.createQuery(query).uniqueResult();
         
          if (poliza==null) return null;
          else {
          
          DTOPoliza nueva= new DTOPoliza();
          
          DTOCliente dtoCliente=new DTOCliente();
          
          DTOTipodedocumento dtotipo=new DTOTipodedocumento();
          
          DTOCuota dtocuota=new DTOCuota();
          
          DTOFormasdepago dtoformasdepago= new DTOFormasdepago();
          
          DTORecibo dtorecibo =new DTORecibo();
          
          List<DTOCuota> listadtocuotas=new ArrayList<DTOCuota>();
          

          dtotipo.setIdTipoDeDocumento(poliza.getCliente().getTipodedocumento().getIdTipoDeDocumento());
          dtotipo.setNombre(poliza.getCliente().getTipodedocumento().getNombre());
          
          dtoCliente.setIdCliente(poliza.getCliente().getIdCliente());
          dtoCliente.setApellido( poliza.getCliente().getApellido());
          dtoCliente.setNombre(poliza.getCliente().getNombre());
          dtoCliente.setTipodedocumento(dtotipo);
          dtoCliente.setNroCliente(poliza.getCliente().getNroCliente());
          dtoCliente.setNroDocumento(poliza.getCliente().getNroDocumento());
          
            	     	   
       	   dtorecibo.setIdRecibo(poliza.getCuota().getRecibo().getIdRecibo());
       	   dtorecibo.setFecha(poliza.getCuota().getRecibo().getFecha());
              dtorecibo.setImporteTotal(poliza.getCuota().getRecibo().getImporteTotal());
               
       	    
          
          dtoformasdepago.setIdFormasDePago(poliza.getFormasdepago().getIdFormasDePago());
          dtoformasdepago.setNombre(poliza.getFormasdepago().getNombre());
          nueva.setCliente(dtoCliente);
          nueva.setCuota(dtocuota);
          nueva.setListadtocuota(listadtocuotas);
          nueva.setFormasdepago(dtoformasdepago);
         
          session.close();
          
          return   nueva;
      }
    }

    @Override
    public void guardar(Poliza poliza) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(poliza);
        session.getTransaction().commit();
        session.close();
    }


}