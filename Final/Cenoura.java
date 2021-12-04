package Pacote;

public class Cenoura extends Produto {

	public Cenoura(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;

	}

	public String imprimir() {
		return this.nome;
	}
}
