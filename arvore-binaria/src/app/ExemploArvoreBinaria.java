// Implementação de uma árvore binária

package app;

import entities.ArvoreBinaria;

public class ExemploArvoreBinaria {

	public static void main(String[] args) {

		// Instancia uma árvore binária. Essa é instanciada vazia, raiz = null, devido ao construtor padrão.
		ArvoreBinaria a = new ArvoreBinaria();
		
		// Inserindo e armazenando dados em memória na árvore. Os elementos são do tipo String, mas poderiam ser qualquer tipo de classe.
		a.insere(10, 'A');
		a.insere(5, 'B');
		a.insere(15, 'C');
		a.insere(2, 'D');
		a.insere(7, 'E');
		a.insere(12, 'F');
		a.insere(6, 'G');
		a.insere(8, 'H');
		
		a.imprimeElementosArvore();
		System.out.println("Altura da árvore: " + a.alturaArvore());

	}

}
