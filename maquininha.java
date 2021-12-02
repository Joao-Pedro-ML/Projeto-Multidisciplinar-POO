
package project;

import java.util.Scanner;
import java.lang.Math;

public class maquininha {

	public maquininha() {

	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int op = -1;

		do {
			System.out.println("\nMenu opções: ");
			System.out.println("opção 1: Coxinha - R$2,00");
			System.out.println("opção 2: Pastel - R$ 4,50");
			System.out.println("opção 3: Água - R$ 4,00 ");
			System.out.println("opção 4: Coca-Cola - R$ 6,00 ");
			System.out.println("opção 5: Chocolate - R$1,50");
			System.out.println("opção 0: ABANDONO '-' ");
			System.out.println("\nDigite a opcao: ");
			
			op = obj.nextInt();
			switch (op) {
			case 1:
				System.out.println("--- COXINHA --- ");
				System.out.println("PAGAMENTO R$ 2,00 \nPAGUE IMEDIATAMENTE:");
				double valor1 = obj.nextDouble();
				TrocoCoxinha(valor1);
				break;
			case 2:
				System.out.println("--- PASTEL --- ");
				System.out.println("PAGAMENTO R$ 4,50 \nPAGUE IMEDIATAMENTE:");
				double valor2 = obj.nextDouble();
				TrocoPastel(valor2);
				break;
			case 3:
				System.out.println("--- ÁGUA ---");
				System.out.println("PAGAMENTO R$ 4,00 \nPAGUE IMEDIATAMENTE:");
				double valor3 = obj.nextDouble();
				TrocoAgua(valor3);
				break;
			case 4:
				System.out.println("--- COCA-COLA ---");
				System.out.println("PAGAMENTO R$ 6,00 \nPAGUE IMEDIATAMENTE: ");
				double valor4 = obj.nextDouble();
				TrocoCoca(valor4);
				break;
			case 5:
				System.out.println("--- CHOCOLATE --- ");
				System.out.println("PAGAMENTO R$ 1.50 \nPAGUE IMEDIATAMENTE:");
				double valor5 = obj.nextDouble();
				TrocoChoco(valor5);
				break;
			default:
				System.out.println("OBRIGADO VOLTE SEMPRE :) ...");
				break;

			}
		} while (op != 0);
		
		
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
