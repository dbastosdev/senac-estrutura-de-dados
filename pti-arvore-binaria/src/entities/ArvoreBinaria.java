/*

Neste código, se a árvore for vazia, ou seja, a raiz for nula, o novo
elemento é inserido diretamente na raiz. Caso contrário, o método cria
uma variável atual (inicializada com a raiz da árvore), que será utilizada
para percorrer os caminhos da árvore até encontrar a posição correta
para o novo elemento. A garantia da ordenação da árvore é obtida com a
comparação entre o identificador do novo elemento e o identificador do
nó atual, tentando realizar a inserção à esquerda ou à direita, conforme
o resultado da comparação. Se o filho do nó atual for nulo, então o novo
nó é inserido e o método é terminado; caso contrário, uma nova iteração
começa com o nó atual percorrendo a árvore.

*/

package entities;

public class ArvoreBinaria {
	
	// Implementação da classe árvore binária, com construtor e o método insere()
	
	// ATRIBUTOS
	
	// A árvore binária contém apenas o atributo nó raiz. Os demais nós são armazenados em memória e referenciados a partir do nó raiz. 
	private No raiz;
	
	// CONSTRUTOR
	
	// Quando a árvore for instanciada sem nenhum elemento, significa que o nó raíz é nulo. Portanto, inicia com a árvore com valor nulo.
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	// MÉTODOS
	
	// Método para inserir um elemento na árvore. Recebe um id, para indicar o código do nó e um elemento que será armazenado no nó. 
	public void insere(long id, Object elemento) {
		
		// Instancia um novo nó. com os elementos filhos nulos.
		No novoNo = new No(id, elemento, null, null);
		
		// Lógica para posicionamento dos elementos adicionados na árvore
		
		// Se a raíz for nula, o novo nó é adicionado na raiz. 
		if(raiz == null) {
			raiz = novoNo;
		} else {
			// Caso contrário, começa a o processo de atribuição da localização de cada nó a partir do nó raiz. 
			No atual = raiz; // inicia a percorrer a árvore pelo topo, nó raíz. 
			No pai; // O nó pai é criado para ser usado na lógica. 
			
			while(true) {
				// É atribuido ao elemento pai a referência do elemento atual.
				pai = atual;
				
				// Se o id do novo nó é menor que o id do nó atual, então tenta inserir o novo nó à esquerda. 
				if(novoNo.getId() < atual.getId()) {
					// atribuição do nó esquerdo ao nó atual. 
					atual = atual.getEsq(); 
					
					// Confirma que é possível inserir o novo nó à esquerda. Para isso, verifica o atributo 'esq' é nulo.
					// Caso não esteja vazio, segue para o próximo filho. Se tiver vazio pode inserir. 
					if( atual == null) {
						pai.setEsq(novoNo);
						return;
					}
				} else {
					// Caso o id do nó atual seja maior que o do nó atual, tenta inserir à direita. 
					
					// Atribuição do nó esquerdo ao nó atual. 
					atual = atual.getDir();
					// Se tiver vazio pode inserir. 
					if( atual == null) {
						pai.setDir(novoNo);
						return;
					}
				}
			}
			
			
		}
		
	}

}
