package Pacote;

public class Salgadinho extends Produto {

	public Salgadinho(String nome, int preco) {
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
