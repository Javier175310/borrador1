package examen;

public class Palabras {
	String cadena1 = "hasta luego cocodrilo";
	String cadena2 = "anita lava la tina";
	String invento = "";
	Ejecucion D = new Ejecucion();
	String ej1a	= Ejecucion.convertirPrimeraMayuscula(cadena1);
	String ej1b	= Ejecucion.convertirPrimeraMayuscula(cadena2);
	String ej2a	= Ejecucion.invertirCadena(cadena1);
	String ej2b	= Ejecucion.invertirCadena2(cadena2);
	String ej3a	= Ejecucion.convertirVocalesMayuscula(cadena1);
	String ej3b	= Ejecucion.convertirVocalesMayuscula(cadena2);
	Boolean ej4a = Ejecucion.checarPalindromo(cadena1);
	Boolean ej4b = Ejecucion.checarPalindromo2(cadena2);
	String ejf	= Extra.fizzBuzz(invento);
}
