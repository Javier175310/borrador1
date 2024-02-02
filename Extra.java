package examen;

public class Extra {
	
	public static String fizzBuzz(String invento) {
		 System.out.println("Numeros del 1-100 con Fizz y Buzz: "); 
	        for (int n = 1; n <= 100; n++) {
	        	if (n % 3 == 0 && n % 5 ==0) {
	        		System.out.println("FizzBuzz"); 
	        		
	        	}
	        	else if (n % 3 == 0) {
	        		System.out.println("Fizz"); 
	    	
	        	}
	        	else if (n % 5 == 0) {
	        		System.out.println("Buzz");
	        		
	        	}
	        	else {
	        		System.out.println(n); 
	        		
	        	}
	        }
	        return invento ;
	    }

}
