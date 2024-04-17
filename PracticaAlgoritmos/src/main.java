import java.util.*;

import util.algoritmos;

public class main {

	public static void main(String[] args) {
		//Fibonacci
				Random rn=new Random();
				int[] numeros=new int[5],resultadoFibonacci=new int[5],resultadoFactorial=new int[5],resultadoPrimos=new int[5];
				for(int a=0;a<numeros.length;a++) {
					numeros[a]=rn.nextInt(1,10);
					resultadoFibonacci[a]=algoritmos.fibonacci(numeros[a]);
					
					
				}
		
		
		

		
		
		
		
		
		
	}



}
