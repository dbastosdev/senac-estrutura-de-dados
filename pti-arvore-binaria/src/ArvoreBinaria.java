public class ArvoreBinaria {
	
	private No raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
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
	
	// Letra A da PTI de Esquerda Feliz:
	
	int contador;
	
	private int preFixado(No atual){
		
		if( atual != null) {
			if(atual.getEsq() != null) {
				System.out.println("Id: " + atual.getEsq().getId() + " Elemento: " + atual.getEsq().getElemento());
				contador++;
			}
			preFixado(atual.getEsq());
			preFixado(atual.getDir());
		}
		
		return contador;
	}
	
	public void esquerdaFestiva() {
		preFixado(raiz);
		System.out.println("\nA quantidade da esquerda feliz é: " + contador);
		System.out.println();
	}
	
	// Letra B - Impressão com recuo:
	
	// Calcula altura
	private long calcAltura(No atual, long a) {
		if(atual != null) {
			long e, d; 
			e = calcAltura(atual.getEsq(), a) + 1; 
			d = calcAltura(atual.getDir(), a) + 1; 
			
			if(e > d) {
				return a + e;
			} else {
				return a + d;
			}
		}
		
		return a;
	}
	
	private String multiplicaRecuo(long nivel) {
		String r = "";
		for(int i = 1; i <= nivel; i++) {
			r += "\t";
		}
		return r;
	}

	// Letra B - código com recuo
	
	public void espacos(long depth) {
		for(int i=0; i <depth; i++) {
			System.out.print("   ");
	    }
	}
	
	public void desenha(No atual, long l) {
		
		espacos(l);
		
		if(atual == null) {
			System.out.println("--");
			return;
		}
		
		System.out.println(atual.getId());
		desenha(atual.getEsq(), l + 1);
		desenha(atual.getDir(), l + 1);
	}
	
	public void imprimeArvore() {
		desenha(raiz, 0);
	}
	

}