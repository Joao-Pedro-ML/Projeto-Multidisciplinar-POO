package Pacote;

public class Jujuba extends Produto {

	public Jujuba(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getnome() {
		return this.nome;

	}

	@Override
	public int getpreco() {
		return this.preco;
	}

}
