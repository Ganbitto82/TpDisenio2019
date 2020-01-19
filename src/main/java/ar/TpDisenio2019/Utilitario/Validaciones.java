package ar.TpDisenio2019.Utilitario;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.TpDisenio2019.Utilitario.Fechas;

public class Validaciones {
		
	//Apellido Nombre debe ser distinto a la cadena vacía
	
			public static boolean validarApellidoONombre (String apellidoONombre)
			{
				if(apellidoONombre.length() > 100)
					return false;
					
				Pattern p = Pattern.compile("\\x20|\\x27|\\x2D|\\x41|\\x42|\\x43|\\x44|\\x45|\\x46|\\x47|\\x48|\\x49|\\x4A|\\x4B|\\x4C" +
							                    "|\\x4D|\\x4E|\\x4F|\\x50|\\x51|\\x52|\\x53|\\x54|\\x55|\\x56|\\x57|\\x58|\\x59|\\x5A|\\x60" +
		                                        "|\\x91|\\x92|\\x96|\\x97|\\xC0|\\xC1|\\xC2|\\xC3|\\xC4|\\xC5|\\xC6|\\xC7|\\xC8|\\xC9" +
		                                        "|\\xCA|\\xCB|\\xCC|\\xCD|\\xCE|\\xCF|\\xD0|\\xD1|\\xD2|\\xD3|\\xD4|\\xD5|\\xD6|\\xD9" + 
		                                        "|\\xDA|\\xDB|\\xDC|\\xDD");
				
				Matcher matcher;
				int cantidadDeEvaluaciones = apellidoONombre.length();
				int cantidadDeAciertos = 0;
					
				for(int i = 0; i < cantidadDeEvaluaciones; i++)
				{	
					matcher = p.matcher(apellidoONombre.substring(i, i + 1));
					if(matcher.matches())
						cantidadDeAciertos++;
				}
					
				if(cantidadDeAciertos == cantidadDeEvaluaciones)
					return true;
				else 
					return false;				
			}
			
			//númeroDeDocumento y tipoDeDocumento deben ser distintos a la cadena vacía
			public static boolean validarNumeroDeDocumento(String numeroDeDocumento, String tipoDeDocumento)
			{
				if(numeroDeDocumento.length() > 15)
					return false;
					
				Pattern patronParaPasaporteYOtro = Pattern.compile("\\x20|\\p{Upper}|\\p{Digit}");
				Matcher matcher;
					
				if(tipoDeDocumento.compareTo("DNI") == 0)
					return validarCampoNumericoEstatico(numeroDeDocumento, 8);
			
				else if(tipoDeDocumento.compareTo("LE") == 0 || tipoDeDocumento.compareTo("LC") == 0)
					return validarCampoNumericoEstatico(numeroDeDocumento, 7);
			
				else if(tipoDeDocumento.compareTo("Pasaporte") == 0)
				{	
					if(numeroDeDocumento.length() > 9)
						return false;
						
					int cantidadDeEvaluaciones = numeroDeDocumento.length();
					int cantidadDeAciertos = 0;
						
					for(int i = 0; i < cantidadDeEvaluaciones; i++)
					{	
						matcher = patronParaPasaporteYOtro.matcher(numeroDeDocumento.substring(i, i + 1));
						if(matcher.matches())
							cantidadDeAciertos++;
					}	
						
					if(cantidadDeAciertos == cantidadDeEvaluaciones)
						return true;
					else 
						return false;	
				}	
						
				else if(tipoDeDocumento.compareTo("Otro") == 0)
				{	
					int cantidadDeEvaluaciones = numeroDeDocumento.length();
					int cantidadDeAciertos = 0;
						
					for(int i = 0; i < cantidadDeEvaluaciones; i++)
					{	
						matcher = patronParaPasaporteYOtro.matcher(numeroDeDocumento.substring(i, i + 1));
						if(matcher.matches())
							cantidadDeAciertos++;
					}	
						
					if(cantidadDeAciertos == cantidadDeEvaluaciones)
						return true;
					else 
						return false;	
				}
					
				return false;
			}
			
			
			/*public static boolean validarNumeroDeDocumento(String numeroDeDocumento, String tipoDeDocumento)
			{
				if(numeroDeDocumento.length() > 15)
					return false;
					
				Pattern patronParaPasaporteYOtro = Pattern.compile("\\x20|\\p{Upper}|\\p{Digit}");
				Matcher matcher;
					
				if(tipoDeDocumento.compareTo("DNI") == 0)
					return validarCampoNumericoEstatico(numeroDeDocumento, 8);
			
				else if(tipoDeDocumento.compareTo("LE") == 0 || tipoDeDocumento.compareTo("LC") == 0)
					return validarCampoNumericoEstatico(numeroDeDocumento, 7);
			
				else if(tipoDeDocumento.compareTo("Pasaporte") == 0)
				{	
					if(numeroDeDocumento.length() > 9)
						return false;
						
					int cantidadDeEvaluaciones = numeroDeDocumento.length();
					int cantidadDeAciertos = 0;
						
					for(int i = 0; i < cantidadDeEvaluaciones; i++)
					{	
						matcher = patronParaPasaporteYOtro.matcher(numeroDeDocumento.substring(i, i + 1));
						if(matcher.matches())
							cantidadDeAciertos++;
					}	
						
					if(cantidadDeAciertos == cantidadDeEvaluaciones)
						return true;
					else 
						return false;	
				}	
						
				else if(tipoDeDocumento.compareTo("Otro") == 0)
				{	
					int cantidadDeEvaluaciones = numeroDeDocumento.length();
					int cantidadDeAciertos = 0;
						
					for(int i = 0; i < cantidadDeEvaluaciones; i++)
					{	
						matcher = patronParaPasaporteYOtro.matcher(numeroDeDocumento.substring(i, i + 1));
						if(matcher.matches())
							cantidadDeAciertos++;
					}	
						
					if(cantidadDeAciertos == cantidadDeEvaluaciones)
						return true;
					else 
						return false;	
				}
					
				return false;
			}*/
			
			//valorDelCampo no debe ser la cadena vacía; valorMáximoPermitido debe ser mayor que 0
			public static boolean validarCampoNumericoEstatico(String valorDelCampo, int valorMaximoPermitido)
			{
				if(valorDelCampo.length() > valorMaximoPermitido)
					return false;
					
				Integer valorMaximo = new Integer(valorMaximoPermitido);
				String valorMax = valorMaximo.toString();
					
				Pattern patron = Pattern.compile("\\d{" + valorMax + "}");
				Matcher matcher = patron.matcher(valorDelCampo);
				return matcher.matches();
			}
			
			public static boolean validarNumeroDeCliente(String numeroCliente) {
				
				Pattern pattern = Pattern.compile("\\s");
				
				Matcher matcher = pattern.matcher(numeroCliente);
				boolean found = matcher.find();
				
				return found;	
			}

		//Valida que la fecha esté completa y correcta y dentro del rango (01/01/1857 - fecha actual menos un día)
		public static boolean validarFechaNacimiento(String fecha)
		{
			if(fechaCompleta(fecha) == false)
				return false;
			
			if(fechaCorrecta(fecha) == false)
				return false;
			
			Fechas fechas = new Fechas();
			Date fechaNacimiento = Fechas.convertirCadenaFechaADate(fecha);
			
			Date fechaLímiteInferior = new Date(fechas.milisegundosDesde01011920Hasta01011970());
			Date fechaActualMenosUno = fechas.obtenerFechaActualMenosUnDía();
			
			if(fechaNacimiento.before(fechaLímiteInferior) || fechaNacimiento.after(fechaActualMenosUno))
				return false;
			else  return true;
		}
		
		//Valida que la fecha esté completa y correcta
		public boolean validarFecha(String fecha)
		{
			if(fechaCompleta(fecha) == false)
				return false;
				
			if(fechaCorrecta(fecha) == false)
				return false;
				
			return true;
		}
		
		//fecha podría ser "dd/mm/aaaa", o con algún u algunos dígitos menos, excepto la cadena "  /  /    "
		public static boolean fechaCompleta(String fecha)
		{
			if(fecha.compareTo("  /  /    ") == 0)
				return false;
					
			else
			{
				Pattern patrón = Pattern.compile("\\d{2}" + "/" + "\\d{2}" + "/" + "\\d{4}" );
				Matcher matcher = patrón.matcher(fecha);
				return matcher.matches();
			}
		}	
		
		//fecha debe estar completa (dd/mm/aaaa)
		public static boolean fechaCorrecta(String fecha)
		{
			Integer day = new Integer (fecha.substring(0,2));
			int día = day.intValue();
				
			Integer month = new Integer (fecha.substring(3,5));
			int mes = month.intValue();
				
			Integer year = new Integer (fecha.substring(6,10));
			int año = year.intValue();
			
			if(día > 31)											
				return false;
			
			if(mes > 12)
				return false;
			
			boolean mesCon31 = false;
			if(((mes % 2 == 1) && mes < 8) || ((mes % 2 == 0) && mes > 7))
				mesCon31 = true;
			
			if(día == 31 && mesCon31 == false)
				return false;
			
			boolean bisiesto = false;
			
			if((año % 4 == 0) && (año % 100 != 0))
				bisiesto = true;
			
			if((año % 100 == 0) && (año % 400 == 0))
				bisiesto = true;
			
			if(bisiesto && día == 29 && mes == 2)
				return true;
			else if(bisiesto == false && día == 29 && mes == 2)
				return false;
			
			return true;
		}
}


