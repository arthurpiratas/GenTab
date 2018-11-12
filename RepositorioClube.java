package Repositorio;
import ClasseBasica.Clube;



public interface RepositorioClube {
		
	public void inserirClube(Clube clube); 
	public void atualizaClube(Clube clube); 
	public Clube buscaClube(int numeroregistro); 
	public void removeClube(int numeroregistro);
	public void listar(RepositorioClubeArray repositorio); 


}
