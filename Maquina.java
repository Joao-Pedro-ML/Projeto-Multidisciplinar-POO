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
	 * Tratamento de exeções para controlar o valor inserido pelo usuario é aceito
	 * pela maquina
	 *
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
			if (valor2 > 20) {
				throw new ExceptionDin();
			}

		} catch (ExceptionDin e) {

			JOptionPane.showMessageDialog(null, "O valor inserido não é valido \n Tente novamente", "Erro!!!",
					JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		// Define as cores e o estilo da fonte da interface grafica
		UIManager.getDefaults().put("OptionPane.background", new Color(244, 67, 53));
		UIManager.put("Panel.background", new Color(135, 206, 250));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD + Font.ITALIC, 14)));

		// Criação arraylist pra os objetos
		ArrayList<Produto> Lista = new ArrayList<>();

		// Interface grafica e o desenvolvimento do programa
		int valor1;
		int valor2;

		// Laço de repetição para a maquina
		do {
			do {
				final ImageIcon icon = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\maquininha.png");

				String opcao = (String) JOptionPane.showInputDialog(null,
						"\n\t1: Banana - R$ 2,00 \n\t2: Chips - R$7,00"
								+ "\n\t3: Suco - R$ 5,00 \n\t4: Bala de gelatina - R$4,00 \n\t5: Morango - R$3,00 \n\t6: Maça - R$1,00"
								+ "\n\t0: Sair \nSelecione uma opção: ",
						"MENU", JOptionPane.PLAIN_MESSAGE, icon, null, "");
				valor1 = Integer.parseInt(opcao);
				if (valor1 == 0) {
					System.exit(0);
				}
			} while ((valor1 < 0 || valor1 > 6) && (valor1 != 64 && valor1 != 82));

			// Classe escondida
			if (valor1 == 64) {
				Lista.add(new Cenoura("CENOURAS", 0, "RARO"));
				final ImageIcon icon = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\trofeuzinho.png");
				JOptionPane.showMessageDialog(null,
						"PARABENS VOCÊ ENCONTROU O ITEM CENOURAS\n \nRETIRE " + valor1 + " " + Lista.get(0).getnome()
								+ "\n\n NIVEL DE RARIDADE:" + Lista.get(0).raridade,
						"ACHIEVEMENT", JOptionPane.PLAIN_MESSAGE, icon);
				Lista.remove(0);
				continue;
			}

			// Classe escondida (easter egg)
			if (valor1 == 82) {
				Lista.add(new Bolo("BOLO DE MURANGO", 0, " SUPER RARO"));
				final ImageIcon icon = new ImageIcon(
						"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\murango.jpg");
				JOptionPane.showMessageDialog(null,
						"PARABENS VOCÊ ENCONTROU O ITEM BOLO DE MURANGO\n" + "\nHUMM BOLO DE MURANGO HUMM\n "
								+ "\n NIVEL DE RARIDADE:" + Lista.get(0).raridade,
						"ACHIEVEMENT", JOptionPane.PLAIN_MESSAGE, icon);
				Lista.remove(0);
				continue;
			}

			// Opções de pagamento
			Object[] options1 = { "Dinheiro", "Cartão" };
			int comparador;
			final ImageIcon icon = new ImageIcon(
					"C:\\Users\\User\\eclipse-workspace\\Projeto\\src\\Pacote\\Image\\pagamento.png");
			comparador = JOptionPane.showOptionDialog(null, "Escolha um metodo de pagamento", "METODO DE PAGAMENTO",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options1, null);

			// Inicia Objetos dentro da lista
			if (valor1 == 1) {
				Lista.add(new Banana("Banana", 2));
			} else if (valor1 == 2) {
				Lista.add(new Salgadinho("Chips", 7));
			} else if (valor1 == 3) {
				Lista.add(new Suco("Suco", 5));
			} else if (valor1 == 4) {
				Lista.add(new Jujuba("Bala de gelatina", 4));
			} else if (valor1 == 5) {
				Lista.add(new Morango("Morango", 3));
			} else if (valor1 == 6) {
				Lista.add(new Maca("Maça", 1));
			}

			String grana = (String) JOptionPane.showInputDialog(null, "Insira o valor de R$" + Lista.get(0).getpreco(),
					"PAGAMENTO", JOptionPane.PLAIN_MESSAGE, icon, null, "");
			valor2 = Integer.parseInt(grana);

			Maquina m = new Maquina();
			m.Maq(valor1, valor2);

			// Função para voltar troco
			if (valor2 == Lista.get(0).preco || comparador != 0 ) {
				JOptionPane.showMessageDialog(null, "Retire " + Lista.get(0).getnome() + " na bandeja!",
						"MAQUINA DE SNACKS", JOptionPane.INFORMATION_MESSAGE);
			}  else {
				JOptionPane.showMessageDialog(null,
						"Não esqueca de retirar seu troco de R$	" + Integer.toString(valor2 - Lista.get(0).getpreco())
								+ "\n E retire " + Lista.get(0).getnome() + " na bandeja!",
						"MAQUINA DE SNACKS", JOptionPane.INFORMATION_MESSAGE);
			}

			Lista.remove(0);

		} while (valor1 != 0);

	}
}
