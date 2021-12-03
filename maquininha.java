package Pacote;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Maquina {

	public Maquina() {

	}

	public void Maq(int valor1, int valor2) {
		
		try {
			if(valor1 == 1 && valor2 != 2) {
				throw new ExceptionDin();
			}
			if(valor1 == 2 && valor2 != 7) {
				throw new ExceptionDin();
			}
			if(valor1 == 3 && valor2 != 5) {
				throw new ExceptionDin();
			}
		}catch(ExceptionDin e) {
			//System.out.println(e.toString());
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {

		
		Chocolate c = new Chocolate();

		ArrayList<Produto> Lista = new ArrayList<>();
		

		Lista.add(new CocaCola());
		Lista.add(new Salgadinho());
		Lista.add(new Chocolate());
		
		for(Produto p:Lista){
			Lista.Função_futura_que_nao_decidimos_o_que_faz();
		}
		

		String produto = null;
		
		String opcao = JOptionPane.showInputDialog("\nMenu opções:   \n Opção 1: Chocolate - R$ 2,00  \n Opção 2: Salgadinho - R$7,00"
				+ "\n Opção 3: Coca-Cola - R$ 5,00  \n Opção 0: Sair   \nDigite a opção: ");
		int valor1 = Integer.parseInt(opcao);
		
		String grana = JOptionPane.showInputDialog("Insira o valor: ");
		int valor2 = Integer.parseInt(grana);
		
		Maquina m = new Maquina();
		m.Maq(valor1, valor2);
		
		
		if(valor1 == 1) {
			produto = new String("Chocolate");
		}else if(valor1 == 2) {
			produto = new String("Salgadinho");
		}else if(valor1 == 3) {
			produto = new String("Coca-Cola");
		}
		
		JOptionPane.showMessageDialog(null, "Retire "+ produto +" na bandeja!" , "Bandeja", JOptionPane.INFORMATION_MESSAGE);
		
		
		/*
		 * Scanner obj = new Scanner(System.in);
		 * 
		 * int op = -1;
		 * 
		 * do { System.out.println("\nMenu opções: ");
		 * System.out.println("opção 1: Coxinha - R$2,00");
		 * System.out.println("opção 2: Pastel - R$ 4,50");
		 * System.out.println("opção 3: Água - R$ 4,00 ");
		 * System.out.println("opção 4: Coca-Cola - R$ 6,00 ");
		 * System.out.println("opção 5: Chocolate - R$1,50");
		 * System.out.println("opção 0: ABANDONO '-' ");
		 * System.out.println("\nDigite a opcao: ");
		 * 
		 * op = obj.nextInt(); switch (op) { case 1:
		 * System.out.println("--- COXINHA --- ");
		 * System.out.println("PAGAMENTO R$ 2,00 \nPAGUE IMEDIATAMENTE:"); double valor1
		 * = obj.nextDouble(); TrocoCoxinha(valor1); break; case 2:
		 * System.out.println("--- PASTEL --- ");
		 * System.out.println("PAGAMENTO R$ 4,50 \nPAGUE IMEDIATAMENTE:"); double valor2
		 * = obj.nextDouble(); TrocoPastel(valor2); break; case 3:
		 * System.out.println("--- ÁGUA ---");
		 * System.out.println("PAGAMENTO R$ 4,00 \nPAGUE IMEDIATAMENTE:"); double valor3
		 * = obj.nextDouble(); TrocoAgua(valor3); break; case 4:
		 * System.out.println("--- COCA-COLA ---");
		 * System.out.println("PAGAMENTO R$ 6,00 \nPAGUE IMEDIATAMENTE: "); double
		 * valor4 = obj.nextDouble(); TrocoCoca(valor4); break; case 5:
		 * System.out.println("--- CHOCOLATE --- ");
		 * System.out.println("PAGAMENTO R$ 1.50 \nPAGUE IMEDIATAMENTE:"); double valor5
		 * = obj.nextDouble(); TrocoChoco(valor5); break; default:
		 * System.out.println("OBRIGADO VOLTE SEMPRE :) ..."); break;
		 * 
		 * } } while (op != 0);
		 */
		
		
		
		
		
	}

	public static double TrocoCoxinha(double valor1) {
		double resultado = (valor1 - 2.00);
		if (resultado < 0) {
			System.out.println("SEM CALOTE MALANDRO !!!! FALTANDO: " + Math.abs(resultado));
		}else
			System.out.println("TROCO: "+ resultado);
		return resultado;
	}
	public static double TrocoPastel(double valor1) {
		double resultado = (valor1 - 4.50);
		if (resultado < 0) {
			System.out.println("SEM CALOTE MALANDRO !!!! FALTANDO: " + Math.abs(resultado));
		}else
			System.out.println("TROCO: "+ resultado);
		return resultado;
	}
	public static double TrocoAgua(double valor1) {
		double resultado = (valor1 - 4.00);
		if (resultado < 0) {
			System.out.println("SEM CALOTE MALANDRO !!!! FALTANDO: " + Math.abs(resultado));
		}else
			System.out.println("TROCO: "+ resultado);
		return resultado;
	}
	public static double TrocoCoca(double valor1) {
		double resultado = (valor1 - 6.00);
		if (resultado < 0) {
			System.out.println("SEM CALOTE MALANDRO !!!! FALTANDO: " + Math.abs(resultado));
		}else
			System.out.println("TROCO: "+ resultado);
		return resultado;
	}
	public static double TrocoChoco(double valor1) {
		double resultado = (valor1 - 1.50);
		if (resultado < 0) {
			System.out.println("SEM CALOTE MALANDRO !!!! FALTANDO: " + Math.abs(resultado));
		}else
			System.out.println("TROCO: "+ resultado);
		return resultado;
	}
	
	
	
}
