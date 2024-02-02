package examen;

public class Main {
	public static void main(String[] args) {
		Palabras A = new Palabras();
		Extra B = new Extra ();
		System.out.println(A.ej1a);
		System.out.println(A.ej1b);
		System.out.println(A.ej2a);
		System.out.println(A.ej2b);
		System.out.println(A.ej3a);
		System.out.println(A.ej3b);
		if (A.ej4a == true) {
			System.out.println("Tu primera cadena es un palindromo");
		
		}
		else {
			System.out.println("Tu primera cadena no es un palindromo");
		}
		if (A.ej4b == true) {
			System.out.println("Tu segunda cadena es un palindromo");
		
		}
		else {
			System.out.println("Tu segunda cadena no es un palindromo");
		}
		System.out.println(A.ejf);
	}
}
