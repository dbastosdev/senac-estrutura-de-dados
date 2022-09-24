
/*
 * A implementação do algoritmo de ordenação por seleção pode ser divido em trÊs etapas: 
 * 
 * 1- Busca pelo menor ou maior valor;
 * 2- inclusão do valor em um array de ordenação;
 * 3- elimintação do valor ordenado da lista original;
 * 4- repetição da busca pelo menor valor na lista original modificada. 
 * 
 * A complexidade desse algoritmo é O(n²) pois a quantidade de etapas para solução comparado ao tamanho dos dados de entrada.
 * 
 * */

package capitulo02;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(56);
		lista.add(10);
		lista.add(2);
		lista.add(156);
		lista.add(1);
		lista.add(9);
		
		System.out.println("Lista desordenada: " + lista);
		System.out.println("Lista ordenada crescente: " + ordenaCrescente(lista));
		
		lista.add(56);
		lista.add(10);
		lista.add(2);
		lista.add(156);
		lista.add(1);
		lista.add(9);
		
		System.out.println("Lista ordenada decrescente: " + ordenaDecrescente(lista));
		

	}
	
	
	public static int buscaMenorIndice(List<Integer> listaDeItens) {
		
		int indiceMenorValor = 0;
		
		
		for(int i=0; i < listaDeItens.size(); i++) {
			if(listaDeItens.get(i) < listaDeItens.get(indiceMenorValor)) {
				indiceMenorValor = i;
			}
		}
		
		return indiceMenorValor;
	}
	
	public static int buscaMaiorIndice(List<Integer> listaDeItens) {
		
		int indiceMaiorValor = 0;
		
		
		for(int i=0; i < listaDeItens.size(); i++) {
			if(listaDeItens.get(i) > listaDeItens.get(indiceMaiorValor)) {
				indiceMaiorValor = i;
			}
		}
		
		return indiceMaiorValor;
	}
	
	
	public static List<Integer> ordenaCrescente(List<Integer> lista){
		List<Integer> listaOrdenadaC = new ArrayList<>();
		Integer menor;
		int j = lista.size();
				
		for(int i=0; i < j; i++) {
			menor = lista.get(buscaMenorIndice(lista));
			listaOrdenadaC.add(menor);
			lista.remove(lista.indexOf(menor));			
		}
		
		return listaOrdenadaC;
	}
	
	public static List<Integer> ordenaDecrescente(List<Integer> lista){
		List<Integer> listaOrdenadaD = new ArrayList<>();
		Integer maior;
		int j = lista.size();
				
		for(int i=0; i < j; i++) {
			maior = lista.get(buscaMaiorIndice(lista));
			listaOrdenadaD.add(maior);
			lista.remove(lista.indexOf(maior));			
		}
		
		return listaOrdenadaD;
	}

}
