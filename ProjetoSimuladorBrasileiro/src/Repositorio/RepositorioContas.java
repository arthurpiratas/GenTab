package Repositorio;
import Basicas.Perfil;

public interface RepositorioContas {
	public void inserir(Perfil perfil);
	public void atualizr(Perfil perfil);
	public Perfil buscar(int id);
	public void remover(int id);
	public Perfil buscarLoging(String loging);
}
