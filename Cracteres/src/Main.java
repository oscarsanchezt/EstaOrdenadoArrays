import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		// creamos un array (desordenado)
		int[] array = { 1, 2, 4, 5, 3 };
		
		// lo clonamos, es con cual trabajaremos
		int[] clon = array.clone();
		
		// ordenamos el array clonado
		Arrays.sort(clon);
		
		//si array es igual a clon es "true"  sino "false"
		boolean decision = Arrays.equals(array, clon);
		
		// pasamos por el condicional el resultado de decision
		// si es "true" dara el siguiente mensaje 
		if (decision) {
			System.out.println("Esta ordenado");
		
		// si es "false" daral el siguiente mensaje
		} else {
			System.out.println("NO esta ordenado");
			System.out.println("La manera correcta es: " + Arrays.toString(clon));
		}
	}
}
