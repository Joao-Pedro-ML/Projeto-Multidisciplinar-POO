package Pacote;

public class Cenoura extends Produto implements IItens{

	public Cenoura(String nome, int preco, String raridade) {
		this.nome = nome;
		this.preco = preco;
		this.raridade = raridade;

	}

	public String getnome() {
		return this.nome;
	}

	@Override
	public int getpreco() {
		return this.preco;
	}

	@Override
	public String raridade() {
		return this.raridade;
	}
}
