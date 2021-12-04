package Pacote;

public class ExceptionDin extends Exception{

	public ExceptionDin() {
		// TODO Auto-generated constructor stub
		super("O valor inserido não é valído!!!!!!");
	}

	public ExceptionDin(String s) {
		super(s);
	}
	
}
