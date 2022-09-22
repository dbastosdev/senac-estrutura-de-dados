/*
 * A busca binária é mais eficiênte que a busca sequencial. 
 * 
 * A complexidade desse algoritmo é O(log n) contra O(n) da busca sequencial. Isso significar que o número de operações do algoritmo
 * da busca por pesquisa binária descresce em relação aos dados de entrada enquanto que na busca sequencial o número de operações
 * é exatamente igual ao tamanho do dado de entrada. 
 * 
 */

package capitulo01;

public class BuscaBinaria {
	
	static int op = 0;

	public static void main(String[] args) {
		
		int[] vetor = {1, 3, 5, 7, 9};
		
		
		System.out.println("Busca binaria pela posição do número 7: ");
		System.out.println(buscaBinaria(vetor, 7));
		System.out.println("Quantidae de operações para encontrar o número 7: ");
		System.out.println(op);
		
		System.out.println("****************************** \n ");
		
		System.out.println("Busca sequencial pela posição do número 7: ");
		System.out.println(buscaSequencial(vetor, 7));
		System.out.println("Quantidae de operações para encontrar o número 7: ");
		System.out.println(op);
		

	}
	
	public static int buscaBinaria(int[] lista, int valor) {
		int baixo = 0;
		int alto = lista.length - 1;
		op = 0;
		
		while(baixo <= alto) {
			op++;
			int meio = (baixo + alto) / 2;
			
			if(lista[meio] == valor) {
				return meio;
			} else if(lista[meio] > valor) {
				alto = meio - 1;
			} else {
				baixo = meio + 1;
			}
		}
		
		return -1;
	}
	
	public static int buscaSequencial(int[] lista, int valor) {
		op = 0;
		for(int i = 0; i < lista.length; i++) {
			op++;
			if(lista[i] == valor) {
				return i;
			}
		}
		
		return -1;
	}
	
	

}
