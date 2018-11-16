

public class RepositorioContasArray implements RepositorioContas{
	
	private Perfil[] perfis;
	private final static int TAMANHO = 100;

	public RepositorioContasArray() {
		super();
		this.perfis = new Perfil[TAMANHO];
	}
	@Override
	public void inserir(Perfil perfil) { //insere na primeira possição não nula
		for(int i=0;i<TAMANHO;i++) {
			if(perfis[i] == null) {
				perfis[i] = perfil;
				break;
			}
		}
	}

	@Override
	public void atualizr(Perfil perfil) { //procura o perfil pelo Id e subistitui o antigo pelo atualizado.
		for(int i=0;i<TAMANHO;i++) {
			if(perfis[i] != null) {
				if(perfis[i].getId() == perfil.getId()) {
					perfis[i]=perfil;
				}
			}
		}
	}
	@Override
	public Perfil buscar(int id) { //procura o perfil pelo id e o retorna se achar-lo. retorna nulo caso contrário.
		Perfil perf = null;
		 for(int i=0;i<TAMANHO;i++) {
				if(perfis[i] != null) {
					if(perfis[i].getId() == id) {
						perf = perfis[i];
					}
				}
			}
		 return perf;
	}
	@Override
	public void remover(int id) { //procura o perfil pelo id e o subistitui por nulo.
		for(int i=0;i<TAMANHO;i++) {
			if(perfis[i] != null) {
				if(perfis[i].getId() == id) {
					perfis[i] = null;
				}
			}
		}
	}
	@Override
	public Perfil buscarLoging(String loging) { //procura o perfil pelo loging. Será usado pelo Criar() para verificar se o loging ja existe.
		 for(int i=0;i<TAMANHO;i++) {
				if(perfis[i] != null) {
					if(perfis[i].getLoging().equals(loging)) {
						return perfis[i];
					}
				}
			}
		 return null;
	}
	
}