package Negocio;
import Basicas.Clube;
import Basicas.Jogadores;

import Repositorio.RepositorioClube;
import Repositorio.RepositorioClubeArray;
import Repositorio.RepositorioJogadoresArray;


public class ControleClube {
	
	RepositorioClube repositorio = new RepositorioClubeArray(); 
	
	public void insereClube(Clube clube) {
		if(clube != null) {
			repositorio.inserirClube(clube);
		}else { 
			System.out.println("O Clube est� vazio");
		}
		
	}
	
	public void atualizaClube(Clube clube) {
		if(clube != null) {
			repositorio.atualizaClube(clube);
		}else {
			System.out.println("O clube est� vazio");
		}
	}
	
	public Clube buscaClube(int numeroClube) {
		if(numeroClube > 0) {
			
			return repositorio.buscaClube(numeroClube); 
		}else {
			System.out.println("Numero inv�lido!");
		}
		
		return null; 
	}
	
	public void removeClube(int numeroClube) {
		
		if(numeroClube > 0) {
			if(repositorio.buscaClube(numeroClube) != null) {
				repositorio.removeClube(numeroClube);
				
			}else {
				System.out.println("Clube n�o existe");
			}
		}else {
			System.out.println("Numero inv�lido!");
		}
		
	}
	
	public void listaClube() {
		if(((RepositorioClubeArray) repositorio).getListaClubes() != null) {
			
			repositorio.listar();
			
		}else {
			System.out.println("Clubes ainda n�o foram inseridos!");
		}
	}
	
	public void incluiJogador(Jogadores jogador, Clube clube, ControleJogadores ctrJogadores) {
		
		if(ctrJogadores.buscaJogador(jogador.getNumeroRegistro()) != null) {
			
			if(verificaJogadorClube(jogador, clube.getNumeroRegistro()) == false) {
				
				if(clube.getIndex() < Clube.getTamanhojogador()) {
					clube.incluiJogador(jogador);
				}else {
					System.out.println("Clube s� pode ter "+ Clube.getTamanhojogador() + "jogadores!");
				}
			}else {
				System.out.println("Jogador j� foi inserido neste clube");
			}
			
			
		}else {
			System.out.println("Jogador n�o existe!");
		}
		
	}
	
	public void removeJogador(int numeroRegJogador, Clube clube, ControleJogadores ctrJogadores) {
		
		if(ctrJogadores.buscaJogador(numeroRegJogador) != null) {
			
			if(verificaJogadorClube(clube, numeroRegJogador)) {
				
				if(clube.getIndex() < Clube.getTamanhojogador()) {
					clube.removeJogador(numeroRegJogador);
				}else {
					System.out.println("Clube s� pode ter "+ Clube.getTamanhojogador() + "jogadores!");
				}
			}else {
				System.out.println("Jogador n�o foi inserido no Clube!");
			}
			
			
		}else {
			System.out.println("Jogador n�o existe!");
		}
		
	}
	
	public boolean verificaJogadorClube(Clube clube, int numeroRegJogador) {
		
		for(int a = 0; a < clube.getIndex(); a++) {
			if(clube.getJogadores()[a].getNumeroRegistro() == numeroRegJogador) {
				return true; 
			}
		}
		
		return false; 
	}
	
	public boolean verificaJogadorClube(Jogadores jogador, int numeroRegClube) {
		
		if(jogador.getIdClube() == numeroRegClube) {
				return true; 
			}
				
		return false; 
	}
	
	public void listaJogadores(Clube clube) {
		
		System.out.println("");
		for(int a = 0; a<clube.getIndex(); a++) {
			
				System.out.println("Nome: "+ clube.getJogadores()[a].getNome() + " For�a: "+ clube.getJogadores()[a].getHabilidade() + " Posi��o: "+ clube.getJogadores()[a].getPosicao());
			}
			
		
	}
	

}
