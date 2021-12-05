package Pacote;

public class Salgadinho extends Produto {

	public Salgadinho(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
		// this.qtd = qtd;
	}

	public String imprimir() {
		return this.nome;

	}

	@Override
	public int getpreco() {
		return this.preco;
	}

	/*
	 * @Override public int getqtd() { return this.qtd; }
	 * 
	 * 
	 * 
	 * @Override public void setqtd(int qtd) { this.qtd = qtd--; }
	 */

}
