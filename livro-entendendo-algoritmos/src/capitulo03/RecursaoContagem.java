/*
 * A recursão possui duas situações fundamentais. O caso recursivo e o caso base. 
 * 
 * O caso base, sempre deve gerar um retorno. Do contrário, haverá uma execução infinita da recursão. 
 * 
 * O caso recursivo, por sua vez, chama novamente a função. Empilhando as chamadas até que se chegue ao caso base. 
 * 
 * */

package capitulo03;

public class RecursaoContagem {

	public static void main(String[] args) {
		contagemRegressiva(3);

	}
	
	public static void contagemRegressiva(int n) {
		System.out.println(n);
		if(n <= 1) {
			System.out.println(0);
			return; // retorno obrigatório
		} 
		contagemRegressiva(n - 1);
	
		
	}

}
