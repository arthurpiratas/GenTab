package Repositorio;

import Basicas.Partida;

public interface RepositorioPartida {
	
	
	public void inserirClube(Partida partida); 
	public void atualizaClube(Partida partida); 
	public Partida buscaClube(int partidaID); 
	public void removeClube(int partidaID);
	public void listar(); 
	public void listar(int rodada); 
	
}
