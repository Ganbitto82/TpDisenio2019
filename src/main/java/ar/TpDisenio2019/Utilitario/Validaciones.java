package ar.TpDisenio2019.Utilitario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		public static boolean validarNúmeroDeDocumento(String númeroDeDocumento, String tipoDeDocumento)
		{
			if(númeroDeDocumento.length() > 15)
				return false;
				
			Pattern patrónParaPasaporteYOtro = Pattern.compile("\\x20|\\p{Upper}|\\p{Digit}");
			Matcher matcher;
				
			if(tipoDeDocumento.compareTo("DNI") == 0)
				return validarCampoNuméricoEstático(númeroDeDocumento, 8);
		
			else if(tipoDeDocumento.compareTo("LE") == 0 || tipoDeDocumento.compareTo("LC") == 0)
				return validarCampoNuméricoEstático(númeroDeDocumento, 7);
		
			else if(tipoDeDocumento.compareTo("Pasaporte") == 0)
			{	
				if(númeroDeDocumento.length() > 9)
					return false;
					
				int cantidadDeEvaluaciones = númeroDeDocumento.length();
				int cantidadDeAciertos = 0;
					
				for(int i = 0; i < cantidadDeEvaluaciones; i++)
				{	
					matcher = patrónParaPasaporteYOtro.matcher(númeroDeDocumento.substring(i, i + 1));
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
				int cantidadDeEvaluaciones = númeroDeDocumento.length();
				int cantidadDeAciertos = 0;
					
				for(int i = 0; i < cantidadDeEvaluaciones; i++)
				{	
					matcher = patrónParaPasaporteYOtro.matcher(númeroDeDocumento.substring(i, i + 1));
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
		
		
		//valorDelCampo no debe ser la cadena vacía; valorMáximoPermitido debe ser mayor que 0
		public static boolean validarCampoNuméricoEstático(String valorDelCampo, int valorMáximoPermitido)
		{
			if(valorDelCampo.length() > valorMáximoPermitido)
				return false;
				
			Integer valorMáximo = new Integer(valorMáximoPermitido);
			String valorMáx = valorMáximo.toString();
				
			Pattern patrón = Pattern.compile("\\d{" + valorMáx + "}");
			Matcher matcher = patrón.matcher(valorDelCampo);
			return matcher.matches();
		}
		
		public static boolean validarNumeroDeCliente(String numeroCliente) {
			
			Pattern pattern = Pattern.compile("\\s");
			
			Matcher matcher = pattern.matcher(numeroCliente);
			boolean found = matcher.find();
			
			return found;
			
		}
	
	}


