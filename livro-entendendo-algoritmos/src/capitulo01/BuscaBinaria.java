package capitulo01;

public class BuscaBinaria {

	public static void main(String[] args) {
		
		int[] vetor = {1, 3, 5, 7, 9};
		
		System.out.println("Busca pela posição do número 3: ");
		System.out.println(buscaBinaria(vetor, 3));
		System.out.println("Busca pela posição do número -1: ");
		System.out.println(buscaBinaria(vetor, -1));

	}
	
	public static int buscaBinaria(int[] lista, int valor) {
		int baixo = 0;
		int alto = lista.length - 1;
		
		while(baixo <= alto) {
			
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

}
