package Pacote;

public class Suco extends Produto {

	public Suco(String nome,int preco) {
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
