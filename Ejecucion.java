package examen;

public class Ejecucion {
	String cadena1 = "hasta luego cocodrilo";
	String cadena2 = "anita lava la tina";
	public static String convertirPrimeraMayuscula(String cadena1) {
		char primerCaracter = cadena1.charAt(0);
		char primerMayus = Character.toUpperCase(primerCaracter); 
		String demasCadena = cadena1.substring(1);
		return primerMayus + demasCadena; 
		
	}
	public static String invertirCadena(String cadena1) {
		 String cadenaInv = "";
		 for (int n = cadena1.length()- 1; n >= 0 ; n--) {
			 cadenaInv += cadena1.charAt(n);
		}
		 return cadenaInv;
		 }
	public static String invertirCadena2(String cadena2) {
			 String cadenaInv2 = "";
			 for (int j = cadena2.length() - 1; j >= 0 ; j--) {
				 cadenaInv2 += cadena2.charAt(j);
			}
			 return cadenaInv2;	
		 
	}
	public static String convertirVocalesMayuscula(String cadena1) {
		String cambioA = cadena1.replace("a", "A"); 
		String cambioE = cambioA.replace("e", "E"); 
		String cambioI = cambioE.replace("i", "I"); 
		String cambioO = cambioI.replace("o", "O"); 
		String cambioU = cambioO.replace("u", "U");
		
		return cambioU;
	
	}
	public static Boolean checarPalindromo (String cadena1) {
		String minusculas = cadena1.toLowerCase();
		String sinEspacios = minusculas.replace(" ","");
		String cadenaInvertida = ""; 
		for (int i= sinEspacios.length() - 1; i >= 0 ; i--) {
			cadenaInvertida += sinEspacios.charAt(i);
		}
		Boolean resultado = cadenaInvertida.equals(sinEspacios);
		return resultado;
		
	}
	public static Boolean checarPalindromo2 (String cadena2) {
		String minusculas = cadena2.toLowerCase();
		String sinEspacios = minusculas.replace(" ","");
		String cadenaInvertida = ""; 
		for (int i= sinEspacios.length() - 1; i >= 0 ; i--) {
			cadenaInvertida += sinEspacios.charAt(i);
		}
		Boolean resultado = cadenaInvertida.equals(sinEspacios);
		return resultado;
		
	}
	

}
