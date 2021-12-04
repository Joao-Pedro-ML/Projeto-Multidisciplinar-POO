package Pacote;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Maquina {

	public Maquina() {

	}

	public class Test {

	}

	/*
	 * Tratamento de exeções para controlar o valor inserido pelo usuario é possivel
	 * colocar apenas os valores exigidos
	 */
	public void Maq(int valor1, int valor2) {

		try {
			if (valor1 == 1 && valor2 < 2) {
				throw new ExceptionDin();
			}
			if (valor1 == 2 && valor2 < 7) {
				throw new ExceptionDin();
			}
			if (valor1 == 3 && valor2 < 5) {
				throw new ExceptionDin();
			}
			if (valor1 == 4 && valor2 < 4) {
				throw new ExceptionDin();
			}
			if (valor1 == 5 && valor2 < 3) {
				throw new ExceptionDin();
			}
			if (valor1 == 6 && valor2 < 1) {
				throw new ExceptionDin();
			}

		} catch (ExceptionDin e) {

			JOptionPane.showMessageDialog(null, "O valor inserido não é valido", "Erro", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		UIManager.getDefaults().put("OptionPane.background", new Color(244, 67, 53));
		UIManager.put("Panel.background", new Color(135, 206, 250));
		/*
		 * UIManager.getDefaults().put("OptionPane.foreground",new Color(255,255,255));
		 * UIManager.put ("Panel.foreground", new Color(255,255,255));
		 */
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD + Font.ITALIC, 14)));

		// Criação arraylist pra os objetos
		ArrayList<Produto> Lista = new ArrayList<>();

		// Interface grafica e o desenvolvimento do programa
		int valor1;
		int valor2;
		do {
			do {
				final ImageIcon icon = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\maquininha.png");

				String opcao = (String) JOptionPane.showInputDialog(null,
						"\n\t1: Chocolate - R$ 2,00  \n\t2: Salgadinho - R$7,00"
								+ "\n\t3: Coca-Cola - R$ 5,00 \n\t4 : Jujuba - R$4,00 \n\t5: Algodão Doce - R$3,00 \n\t6: Maça - R$1,00"
								+ "\n\t0: Sair \nSelecione uma opção: ",
						"MENU", JOptionPane.PLAIN_MESSAGE, icon, null, "");
				valor1 = Integer.parseInt(opcao);
				if (valor1 == 0) {
					System.exit(0);
				}
			} while ((valor1 < 0 || valor1 > 6) && valor1 != 64);

			if (valor1 == 64) {
				Lista.add(new Cenoura("CENOURA", 0));
				final ImageIcon icon = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\trofeuzinho.png");
				JOptionPane.showMessageDialog(null, "VOCÊ CONQUISTOU SEU PREMIO RETIRE\n " + Lista.get(0).imprimir(),
						"ACHIEVEMENT", JOptionPane.PLAIN_MESSAGE, icon);
				Lista.remove(0);
				continue;
			}

			Object[] options1 = { "Dinheiro", "Cartão" };
			int comparador;
			final ImageIcon icon = new ImageIcon(
					"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\pagamento.png");
			comparador = JOptionPane.showOptionDialog(null, "Escolha um metodo de pagamento", "METODO DE PAGAMENTO",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options1, null);

			String grana = (String) JOptionPane.showInputDialog(null, "Insira o Valor:", "PAGAMENTO",
					JOptionPane.PLAIN_MESSAGE, icon, null, "");
			valor2 = Integer.parseInt(grana);

			Maquina m = new Maquina();
			m.Maq(valor1, valor2);

			if (valor1 == 1) {
				Lista.add(new Chocolate("Chocolate", 2));
			} else if (valor1 == 2) {
				Lista.add(new Salgadinho("Salgadinho", 7));
			} else if (valor1 == 3) {
				Lista.add(new CocaCola("Coca-Cola", 5));
			} else if (valor1 == 4) {
				Lista.add(new Jujuba("Jujuba", 4));
			} else if (valor1 == 5) {
				Lista.add(new AlgodaoDoce("Algodão Doce", 3));
			} else if (valor1 == 6) {
				Lista.add(new Maca("Maça", 1));
			}

			if (valor2 == Lista.get(0).preco || comparador != 0) {
				final ImageIcon icon2 = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\produtos.png");
				JOptionPane.showMessageDialog(null, "Retire " + Lista.get(0).imprimir() + " na bandeja!",
						"MAQUINA DE SNACKS", JOptionPane.INFORMATION_MESSAGE, icon2);
			} else {
				JOptionPane.showMessageDialog(null,
						"Não esqueca de retirar seu troco de R$	" + Integer.toString(valor2 - Lista.get(0).preco)
								+ "\n E retire " + Lista.get(0).imprimir() + " na bandeja!",
						"", JOptionPane.INFORMATION_MESSAGE);
			}
			Lista.remove(0);

		} while (valor1 != 0);

	}

}
