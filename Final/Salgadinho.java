package Pacote;

public class Salgadinho extends Produto {

	public Salgadinho(String nome,int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String imprimir() {
		return this.nome;

	}

}
