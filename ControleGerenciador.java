public class ControleGerenciador {
	
	private RepositorioContas contas = new RepositorioContasArray();
	//metodos
	public void inserir(Perfil perfil) {
		contas.inserir(perfil);
	}
	public void atualizar(Perfil perfil) {
		contas.atualizr(perfil);
	}
	public void buscar(int id) {
		contas.buscar(id);
	}
	public void remover(int id) {
		contas.remover(id);
	}
}