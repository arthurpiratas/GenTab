package Repositorio;

public class TabelaArray extends Partida implements Tabela{
	private Partida[] tabela;
	private int nPartidas;
	private final static int tamax = 380;
	
	public TabelaArray() {
		this.tabela = new Partida[tamax];
		this.nPartidas = 0;
	}
	
	@Override
	public void gerarPartidas(RepositorioClube[] clubes) {
		for(int i = 0; i<10; i++) {
			if((RepositorioClube)clubes[i] != null) {
				tabela[nPartidas] = new Partida();
				this.nPartidas += 1;
				
			}
		}
	}
	
	@Override
	public void zerarPartidas() {
		
	}
}
