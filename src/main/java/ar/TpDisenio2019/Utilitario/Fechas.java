package ar.TpDisenio2019.Utilitario;

import java.sql.Date;
import java.util.Calendar;

public class Fechas {
	public long milisegundosDesde01011920Hasta01011970() {
		long total = 0;
		Calendar c = Calendar.getInstance();
		while (c.get(Calendar.YEAR) > 1920)
			c.add(Calendar.YEAR, -1);
		while (c.get(Calendar.MONTH) > 0)
			c.add(Calendar.MONTH, -1);
		while (c.get(Calendar.DATE) > 1)
			c.add(Calendar.DATE, -1);

		total = c.getTimeInMillis();

		return total;
	}

	// cadenaFechaDeNacimiento debe ser v�lida y estar completa (dd/mm/aaaa)
	public static Date convertirCadenaFechaADate(String cadenaFecha) {
		Integer dia = new Integer(cadenaFecha.substring(0, 2));
		int day = dia.intValue();

		Integer mes = new Integer(cadenaFecha.substring(3, 5));
		int month = mes.intValue();

		Integer anio = new Integer(cadenaFecha.substring(6, 10));
		int year = anio.intValue();

		System.out.println(cadenaFecha);
		Date fechaCorregida = new Date(year - 1900, month - 1, day); // Asi construye correctamente la fecha

		return fechaCorregida;
	}

	public static Date obtenerFechaActual() {
		Calendar c = Calendar.getInstance();

		int dia = c.get(Calendar.DATE);
		int mes = c.get(Calendar.MONTH);
		int anio = c.get(Calendar.YEAR) - 1900;

		Date fechaActual = new Date(anio, mes, dia);

		return fechaActual;
	}

	public Date obtenerFechaActualMenosUnDía() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -1);

		int día = c.get(Calendar.DATE);
		int mes = c.get(Calendar.MONTH);
		int año = c.get(Calendar.YEAR) - 1900;

		Date fechaActualMenosUnDía = new Date(año, mes, día);

		return fechaActualMenosUnDía;
	}

	public static int obtenerEdad(Date fechaNacimiento) {
		Date today = obtenerFechaActual();
		int diffYear = today.getYear() - fechaNacimiento.getYear();
		int diffMonth = today.getMonth() - fechaNacimiento.getMonth();
		int diffDay = today.getDay() - fechaNacimiento.getDay();
		// Si está en ese año pero todavía no los ha cumplido
		if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
			diffYear = diffYear - 1;
		}
		return diffYear;

	}
}
