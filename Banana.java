package Pacote;

public class Banana extends Produto {

	public Banana(String nome,int preco) {
		this.nome = nome;
		this.preco = preco;
		
	}

	public String imprimir() {
		return this.nome;
	}

	@Override
	public int getpreco() {
		return this.preco;
	}

}
