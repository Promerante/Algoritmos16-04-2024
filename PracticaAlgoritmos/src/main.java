import java.util.*;

import util.algoritmos;

public class main {

	public static void main(String[] args) {
		//Fibonacci
		System.out.print("Escriba el limite de fibonacci:");
		Scanner sc=new Scanner(System.in);
		int limite=sc.nextInt();
		System.out.println("El valor del numero de la serie "+limite+" es: "+algoritmos.fibonacci(limite));
		

		
		sc.close();
		
		
		
	}



}
