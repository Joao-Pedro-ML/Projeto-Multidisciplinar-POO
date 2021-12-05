package Pacote;

public class Bolo extends Produto {

	public Bolo(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public int getpreco() {
		return this.preco;
	}

	@Override
	public String imprimir() {
		return this.nome;
	}

}
