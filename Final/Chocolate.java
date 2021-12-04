package Pacote;

public class Chocolate extends Produto {

	public Chocolate(String nome,int preco) {
		this.nome = nome;
		this.preco = preco;
		
	}

	public String imprimir() {
		return this.nome;
	}

}
