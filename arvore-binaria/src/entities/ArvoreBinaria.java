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
	
	// MÉTODOS PARA PERCORRER A ÁRVORE. O critério de parada de ambos métodos de varredura é o nó ser nulo.
	
	
	// Percorre a árvore em um caminho pré-fixado. 
	
	/*
	 No caminhamento pré-fixado, primeiramente, a raiz da árvore é visitada para a realização da inspeção, e, depois, as subárvores,
	 representadas pelos filhos, são percorridas recursivamente.
	 */
	private void preFixado(No atual){
		
		// Caso o nó atual seja não nulo, retorna para a tela o nó atual
		if( atual != null) {
			System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
			// chamada recursiva dos método pré-fixado para os nós esquerdo e direito
			preFixado(atual.getEsq());
			preFixado(atual.getDir());
		}
	}
	
	// Percorre a árvore em um caminho pós-fixado. 
	
	/*
	 No caminhamento pós-fixado, ocorre o oposto ao caminhamento pré-fixado. Primeiramente, são percorridas as subárvores recursivamente,
	 e, depois, é inspecionada a raiz. 
	 */
	private void posFixado(No atual){
		// Caso o nó atual seja não nulo, retorna para a tela o nó atual
		if( atual != null) {
			// Chamadas recursivas para os nós esquerdo e direito pós-fixado.
			posFixado(atual.getEsq());
			posFixado(atual.getDir());
			System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
		}
	}
	
	// Percorre a árvore em um caminho de maneira simétrica. Primeiro a subárvore esquerda, depois a raíz e por fim a subárvore a direita. 
	// caminhamento simétrico fixado da árvore binária
	private void simFixado(No atual) {
		// Se o nó não for nulo, faz a varredura e impressão do elemento do nó.
		if (atual != null) {
			simFixado(atual.getEsq()); // recursivo
			System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
			simFixado(atual.getDir()); // recursivo
		}
	}
	
	// MÉTODO PARA EXPOR PUBLICAMENTE A IMPRESSÃO DOS ELEMENTOS DA ÁRVORE
	
	// Utiliza os métodos privados de varredura a partir da raiz da árvore. Os métodos de varredura não são expostos publicamente. 
	public void imprimeElementosArvore() {
		preFixado(raiz);
	}
	
	// Método para calcular a altura da árvore
	
	/*
	 
Uma árvore binária vazia possui altura igual a zero, e essa característica que é utilizada como critério de parada da recursividade. 
A recursividade ocorre até que o critério de parada seja encontrado, ou seja, uma árvore (ou uma subárvore) vazia seja recebida. Nesse caso, o método
retorna o valor acumulado. Caso a árvore (ou subárvore) recebida não seja nula, as alturas das subárvores esquerda e direita são calculadas
(chamadas recursivas de calcAltura), e o maior valor entre os dois é acrescido ao cálculo da altura da árvore, e esse resultado é retornado.

	 */
	
	private long calcAltura(No atual, long a) {
		// Se o nó recebido não for null, prossegue com as avaliações.
		if(atual != null) {
			long e, d; // cria índices para totalizar os nós a direita e a esquerda
			e = calcAltura(atual.getEsq(), a) + 1; // esquerda
			d = calcAltura(atual.getDir(), a) + 1; // direita
			
			if(e > d) {
				return a + e;
			} else {
				return a + d;
			}
		}
		
		return a;
	}

	// Método exposto para calculo e retorno da altura da árvore. Utiliza o método privado de cálculo da altura da árvore. 
	// Uma árvore vazia retorna uma altura igual a zero. E esse tbm é o critério de parada do método privado de cálculo da altura da árvore. 
	public long alturaArvore() {
		long a = 0;
		return calcAltura(raiz, a);
	}
	

}































