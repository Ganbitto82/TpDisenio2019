package ar.TpDisenio2019.Controladores;

import java.sql.Date;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTODatosdehijo;
import ar.TpDisenio2019.DTO.DTOEstadocivil;
import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Modelo.Poliza;
import ar.TpDisenio2019.Modelo.Vehiculo;
import ar.TpDisenio2019.Utilitario.Fechas;

public class GestorPoliza {

	static GestorCliente gestorCliente;
	
	static GestorBDPoliza gestionPoliza = new GestorBDPoliza();

	public static List<DTOCliente> buscarDtoscliente() {
		return GestorCliente.buscarDtoscliente();
	}

	public static void agregarDtosHijos(List<DTODatosdehijo> listaDtosHijos) {
		DTOPoliza dtoPoliza = new  DTOPoliza();
		for(int i=0;i<listaDtosHijos.size();i++) {
			dtoPoliza.setDatosdehijo(listaDtosHijos.get(i));
		}		
	}

	public static DTOEstadocivil buscarEstadoCivilPorNombre(String nombre) {
		List <DTOEstadocivil> listaEstadoCivil=	GestorCliente.buscarDtosEstadoCivil();
		for(int i=0;i<listaEstadoCivil.size();i++) {
	    	if(nombre.equals(listaEstadoCivil.get(i).getNombre()))
	    	{
	    		return listaEstadoCivil.get(i);	/*Retorna un elemento de la lista de DTOEstado Civil*/
	    	}
		}
		return null;
		
	}

	public static Boolean validarElementosHijos(List<DTODatosdehijo> listaDtosHijos) {
		
		if (!listaDtosHijos.isEmpty()) {
            int i = 0;
            for (DTODatosdehijo hijo : listaDtosHijos) {
                try {
                       	hijo.getFecha();
                    	hijo.getSexo().toString();
                    	hijo.getEstadocivil().toString();
                    
                } catch (Exception e) {
                    
                    listaDtosHijos.remove(i);
                    return false;
                }
                i++;
            }
		}
		return true;
	}

	public static boolean validarFechaHijo(java.util.Date fechaNacimiento) {
		System.out.println("\nSi la fecha de Nacimiento es "+fechaNacimiento.toString()+"la edad es: "+Fechas.obtenerEdad((Date) fechaNacimiento));
		if((Fechas.obtenerEdad((Date) fechaNacimiento)>17)&&(Fechas.obtenerEdad((Date) fechaNacimiento)<31))
			return true;
		else return false;
	}
	
	public static void guardarVehiculo(Vehiculo vehiculo) {
		GestorBDPoliza.guardarVehiculoAux(vehiculo);
	}
	
	public static void guardarPoliza(Poliza poliza) {
		GestorBDPoliza.guardarPolizaAux(poliza);
	}
	
	public static Poliza buscarPoliza(Long numPoliza) {
		return GestorBDPoliza.BuscarPoliza(numPoliza);
		
		
	}
	
}
