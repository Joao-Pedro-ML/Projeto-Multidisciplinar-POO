package Pacote;

public abstract class Produto {
	protected String nome;

	protected int preco;

	//protected int qtd;

	public abstract int getpreco();

	/*
	 * public abstract int getqtd();
	 * 
	 * public abstract void setqtd();
	 */

	public abstract String imprimir();

}
