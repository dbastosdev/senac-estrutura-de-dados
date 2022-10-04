package capitulo04;

import java.util.ArrayList;
import java.util.List;

public class SomaRecursiva {

	public static void main(String[] args) {
		
		int[] array = {2, 4, 6};
		
		System.out.println("Vetor: \n");
		for(int i=0; i< array.length; i++) {
			System.out.println("v["+i+"]="+array[i]);
		}
		System.out.println("\n");
		System.out.println("A soma do vetor é: " + somaRecursiva(array, array.length));		

	}
	
	public static int somaRecursiva(int[] array, int tamanhoVetor) {
		if(tamanhoVetor == 1) {
			return array[0];
		}		
		return array[tamanhoVetor - 1] + somaRecursiva(array, tamanhoVetor - 1);
	}

}
