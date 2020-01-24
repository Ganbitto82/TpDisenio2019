package ar.TpDisenio2019.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;


import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.DTO.DTOFormasdepago;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.DTO.DTORecibo;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;

import ar.TpDisenio2019.Modelo.Poliza;

public class PruebaConeccionBuscarPoliza {
public static void main(String[] args) {
		
		DTOPoliza p=new DTOPoliza();
		
		
		p= buscarPorNumeroPoliza(1123456700L);
		if(p==null)
			System.out.println("No existe Poliza");
		
		else {
			
			if (p.getFormasdepago().getNombre().equals("MENSUAL")) {
				
				System.out.println("Mensual");
			}
			else {System.out.println("SEMESTRAL");}
			
			
			
		}
		
		

	}
      	
public static DTOPoliza buscarPorNumeroPoliza(Long nroPoliza) {
	 ConexionBD cone= new ConexionBD();
	 
	 Session session=cone.Conexion().openSession();
	 
	   
       CriteriaBuilder builder = session.getCriteriaBuilder();
       CriteriaQuery<Poliza> query = builder.createQuery(Poliza.class);
       Root<Poliza> root = query.from(Poliza.class);
       query.select(root);
       query.where(builder.equal(root.get("nroPoliza"), nroPoliza));
       
       Poliza poliza = session.createQuery(query).uniqueResult();
      
    
       
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
