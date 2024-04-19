package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import util.algoritmos;

class Prueba {

	
	@Test
	void fibonacci() {
		int valorDeseado=2;
		int resultado=algoritmos.fibonacci(4);
		assertEquals(valorDeseado,resultado);
	}
	@Test
	void factorial() {
		int valorDeseado=6;
		int resultado=algoritmos.factorial(3);
		assertEquals(valorDeseado,resultado);
	}
	void esPrimo() {
		boolean prueba= true;
		boolean resultado=algoritmos.esPrimo(2);
		assertEquals(prueba,resultado);
	}
	

}
