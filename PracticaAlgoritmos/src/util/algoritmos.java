/**
 * 
 */
package util;

/**
 * @author FacundoBenitez
 */
public abstract class algoritmos {
	/**
	 * 
	 * @param limite
	 * @return
	 */
	public static int fibonacci(int limite) {
		int fibonacci=0,temp=1,aux=0;
		for(int a=1;a<=limite-2;a++) {
			fibonacci=temp+aux;
			aux=temp;
			temp=fibonacci;				
		}
		return fibonacci;
	}

}
