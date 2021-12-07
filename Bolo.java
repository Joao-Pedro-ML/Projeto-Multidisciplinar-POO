package Pacote;

public class Bolo extends Produto implements IItens {

	public Bolo(String nome, int preco, String raridade) {
		this.nome = nome;
		this.preco = preco;
		this.raridade = raridade;
	}

	@Override
	public String raridade() {
		return this.raridade;
	}

	@Override
	public int getpreco() {
		return this.preco;
	}

	@Override
	public String getnome() {
		return this.nome;
	}



}
