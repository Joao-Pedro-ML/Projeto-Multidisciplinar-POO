package Pacote;

public class ExceptionDin extends Exception{

	public ExceptionDin() {
		// TODO Auto-generated constructor stub
		super("O valor inserido é inválido!");
	}

	public ExceptionDin(String s) {
		super(s);
	}
	
}
