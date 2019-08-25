
import javax.swing.JOptionPane;

//import java.util.Scanner;
public class Cao extends Animal {/* CAPITULO 3 */

	// Scanner input = new Scanner(System.in);//CAPITULO 2
	int nm = 1;
	int id = 1;
	int id2 = 1;
	private int dentes = 42;

	public int getDentes() {/* CAPITULO 3 */
		return dentes;
	}

	public int setDentes(int dentes) {/* CAPITULO 3 */
		return dentes;
	}

	public void comer() {/* CAPITULO 3 */
		JOptionPane.showMessageDialog(null, "O seu cão esta comendo...");
		// System.out.println( "Cão Comendo..." );//CAPITULO 2
	}

	public void idade(int i, String f) {/* CAPITULO 3 */

		int[] idade;
		idade = new int[3];

		String[] fase;
		fase = new String[3];

		for (int b = 0; b <= 2; b++) {
			idade[b] = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira a idade do "+id+"ºCao : "));
			id++;
			try {
				idade[b] = Integer.valueOf(b);
			} catch (NumberFormatException e) {//IllegalArgument
				e.printStackTrace();
			}
		}

		for (int a = 0; a <= 2; a++) {
			if (idade[a] > 0 && idade[a] <= 1) {/* CAPITULO 4 */
				fase[a] = "Pela idade de seu cão ele é considerado filhote";
				JOptionPane.showMessageDialog(null, fase[a]);
				// System.out.println(fase[a]);//CAPITULO 2
			} else if (idade[a] > 1 && idade[a] < 10) {
				fase[a] = "Pela idade de seu cão ele é considerado adulto";
				JOptionPane.showMessageDialog(null, fase[a]);
				// System.out.println(fase[a]);//CAPITULO 2
			} else if (idade[a] > 10) {
				fase[a] = "Pela idade de seu cão ele é considerado idoso";
				JOptionPane.showMessageDialog(null, fase[a]);
				// System.out.println(fase[a]);//CAPITULO 2
			} else {
				JOptionPane.showMessageDialog(null, "Idade Indefinidade");
				// System.out.println("Idade Indefinida");//CAPITULO 2
			}id2++;
		}
	}

	public void Nome(String n) {/* CAPITULO 3 */
		String[] nome;
		nome = new String[3];

		for (int i = 0; i <= 2; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "Insira o nome do seu "+nm+"º Cao: ");
			// System.out.printf("Insira o nome do Cao: ");//CAPITULO 2
			JOptionPane.showMessageDialog(null, "O nome do seu "+nm+"º Cao é " + nome[i]);
			nm++;
			// nome[i] = input.next();//CAPITULO 2
			// System.out.println(nome[i]); //CAPITULO 2
		}
	}
}