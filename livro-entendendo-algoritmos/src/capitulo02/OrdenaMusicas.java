/*
 * O(n²) 
 * 
 * Uso da estrutura básica de ordenação de inteiros. Mesmo passo a passo, contudo, ordena lista de objetos. 
 * 
 * */


package capitulo02;

import java.util.ArrayList;
import java.util.List;

public class OrdenaMusicas {

	public static void main(String[] args) {
		
		List<Musica> playList = new ArrayList<>();
		
		
		playList.add(new Musica("KishoreKumar", 141));
		playList.add(new Musica("TheBlackKeys", 35));
		playList.add(new Musica("NeutralMilkHotel", 94));
		playList.add(new Musica("Beck", 88));
		playList.add(new Musica("TheStrokes", 61));
		playList.add(new Musica("Wilco", 111));
		playList.add(new Musica("RadioHead", 156));
		
		System.out.println("Playlist não ordenada:\n" + playList);
		System.out.println("Playlist ordenada: \n" + ordenaPlayList(playList));

	}
	
	public static int buscaMusicaMaisTocada(List<Musica> playList) {
		
		int maisTocada = 0;
		
		
		for(int i=0; i < playList.size(); i++) {
			if(playList.get(i).contadorDePlay > playList.get(maisTocada).contadorDePlay) {
				maisTocada = i;
			}
		}
		
		return maisTocada;
	}
	
	public static List<Musica> ordenaPlayList(List<Musica> lista){
		List<Musica> playListOrdenada = new ArrayList<>();
		Musica maisTocada;
		int j = lista.size();
				
		for(int i=0; i < j; i++) {
			maisTocada = lista.get(buscaMusicaMaisTocada(lista));
			playListOrdenada.add(maisTocada);
			lista.remove(lista.indexOf(maisTocada));			
		}
		
		return playListOrdenada;
	}
	
	

}
