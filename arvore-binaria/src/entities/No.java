/*
 * Cabe observar que a variável elemento de cada nó é um objeto gené-
rico (tipo Object de Java) que pode armazenar qualquer tipo de objeto,
desde objetos simples, como números e nomes, até objetos complexos
com diversos campos, como o cadastro de clientes de uma empresa.
*/

package entities;

public class No {

	
	// Implementação de um nó de uma árvore binária
	 
	
	// ATRIBUTOS DO NÓ: 
	
	// identificador do elemento na árvore
	private long id;
	// Armazena o elemento, ou seja, entidade / classe no nó da árvore
	private Object elemento;
	// Filho esquerdo que também é um nó. 
	private No esq;
	// Filho direito que também é um nó. 
	private No dir;
	
	// CONSTRUTOR DO NÓ: parâmetros que devem ser passados ao nó no momento em que for instanciado. 
	
	public No(long id, Object elemento, No esq, No dir) {
		this.id = id;
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
	}
	
	
	// MÉTODOS
	
	// Método para alterar o identificador do nó
	public void setId(long id) {
		this.id = id;
	}
	
	// Método para obter o identificador do nó
	public long getId() {
		return id;
	}
	
	// Método para alterar o elemento do nó
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	// Método para obter o elemento do nó
	public Object getElemento() {
		return elemento;
	}
	
	// Método que altera o filho esquerdo
	public void setEsq(No esq){
		this.esq = esq;
	}
	
	// método que recebe o filho esquerdo do nó
	public No getEsq(){
		return esq;
	}
	
	// Método que altera o filho esquerdo
	public void setDir(No dir){
		this.dir = dir;
	}
	
	// método que recebe o filho esquerdo do nó
	public No getDir(){
		return dir;
	}

}
