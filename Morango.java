package Pacote;

public class Morango extends Produto {

	public Morango(String nome,int preco) {
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
