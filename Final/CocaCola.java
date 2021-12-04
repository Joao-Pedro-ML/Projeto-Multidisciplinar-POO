package Pacote;

public class CocaCola extends Produto {

	public CocaCola(String nome,int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String imprimir() {
		return this.nome;

	}

}
