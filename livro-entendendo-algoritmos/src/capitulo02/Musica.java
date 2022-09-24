package capitulo02;

public class Musica {
	
	public String nome;
	public int contadorDePlay;
	
	public Musica(String nome, int contadorDePlay) {
		this.nome = nome;
		this.contadorDePlay = contadorDePlay;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " - tocada: " + contadorDePlay + " vezes\n";
	}

}
