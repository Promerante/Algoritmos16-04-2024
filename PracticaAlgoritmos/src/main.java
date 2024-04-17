
import java.util.*;

import util.algoritmos;

public class main {

	public static void main(String[] args) {
		Random rn=new Random();
		int[] numeros=new int[5],resultadoFibonacci=new int[5],resultadoFactorial=new int[5];
		boolean[] resultadoPrimos=new boolean[5];
		for(int a=0;a<numeros.length;a++) {
			numeros[a]=rn.nextInt(1,10);
			resultadoFibonacci[a]=algoritmos.fibonacci(numeros[a]);
			resultadoFactorial[a]=algoritmos.factorial(numeros[a]);
			resultadoPrimos[a]=algoritmos.esPrimo(numeros[a]);					
		}
				rn.getClass();//Es para obtener todos los valores en el depurador antes de que termine el programa.
	}
}
