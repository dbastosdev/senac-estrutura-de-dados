/*
 * O fatorial de um número n equivale a: 
 * 
 * n! = n * (n -1) * (n - 2) * . . . * 1
 * 
 * */

package capitulo03;

public class RecursaoFatorial {

	public static void main(String[] args) {
		
		System.out.println(fatorial(5));

	}
	
	public static int fatorial(int valor) {
		if(valor == 1) {
			return 1;
		}
		return valor * fatorial(valor - 1);
	}

}
