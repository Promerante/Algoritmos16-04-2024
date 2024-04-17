
package util;


/**
 * @author FacundoBenitez
 */
public abstract class algoritmos {
	/**
	 * Fibonacci series
	 * @param limite indice del que obtener su valor en la serie 
	 * @return valor en la serie
	 */
	public static int fibonacci(int indice) {		
		int fibonacci=0,temp=1,aux=0;
		for(int a=1;a<indice;a++) {
			aux=fibonacci+temp;
			fibonacci=temp;
			temp=aux;				
		}
		return fibonacci;
	}
	/**
	 * Realiza el factorial  de dicho número
	 * @param numero
	 * @return
	 */
	
	public static int factorial(int numero) {
				int resultado=1;
				for(int factorial=numero;factorial>0;factorial--) {
					resultado*=factorial;			
				}
				return resultado;
	}

}
