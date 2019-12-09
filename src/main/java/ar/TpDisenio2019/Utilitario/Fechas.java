package ar.TpDisenio2019.Utilitario;

import java.text.ParseException;

public class Fechas {
	
	public Fechas() {
	}
	public void validarFecha(String stringFecha) {
	java.text.DateFormat df = java.text.DateFormat.getInstance();
	try {
	java.text.DateFormat formatter = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT);
	formatter.setLenient(false);
	
	java.util.Date date = formatter.parse(stringFecha);
	} catch (ParseException ex) {
	javax.swing.JOptionPane mensaje = new javax.swing.JOptionPane();
	mensaje.showMessageDialog(null, "La fecha ingresada no es valida", "Atención!!!", mensaje.ERROR_MESSAGE);
	}
	}
}
