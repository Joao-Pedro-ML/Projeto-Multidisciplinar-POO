package Pacote;

public class ExceptionDin extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionDin() {
		// TODO Auto-generated constructor stub
		super("O valor inserido n�o � val�do!!!!!!");
	}

	public ExceptionDin(String s) {
		super(s);
	}
	
}
