package ar.TpDisenio2019.Controladores;

import ar.TpDisenio2019.DTO.DTOOperador;
import ar.TpDisenio2019.Modelo.Operador;

public class GestorOperador {
	
	static GestorBDOperador gestionOperador = new GestorBDOperador();

	public static void guardarOperador(Operador operador) {
		GestorBDOperador.guardarOperadorAux(operador);
	}
	
	public static DTOOperador buscarPorNombreOperador(String nombre) {
		
		return GestorBDOperador.buscarPorNombre(nombre);
	}
	
}
