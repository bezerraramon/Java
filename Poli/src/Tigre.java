import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Tigre extends Animal {
	// Scanner input = new Scanner(System.in);//CAPITULO 2
	
	int nm = 1;
	int id = 1;
	int id2 = 1;

	private int dentes = 63;

	public int getDentes() {
		return dentes;
	}

	public int setDentes(int dentes) {
		return dentes;
	}

	public void idade(int i, String f) {/* CAPITULO 3 */

		int[] idade;
		idade = new int[3];

		String[] fase;
		fase = new String[3];

		for (int b = 0; b <= 2; b++) {

			idade[b] = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira a idade do "+id+"º Tigre: "));
			id++;
			try {
				idade[b] = Integer.valueOf(b);
			} catch (NumberFormatException e) {//IllegalArgument
				e.printStackTrace();
			}
			// System.out.printf("Insira a idade do Tigre %d: ",b);//CAPITULO 2
			// idade[b] = input.nextInt();//CAPITULO 2
		}

		for (int a = 0; a <= 2; a++) {
			if (idade[a] > 0 && idade[a] <= 1) {/* CAPITULO 4 */
				fase[a] = "Pela idade do "+id2+"º tigre ele é considerado filhote";
				JOptionPane.showMessageDialog(null, fase[a]);
				/// System.out.println(fase[a]);//CAPITULO 2
			} else if (idade[a] > 1 && idade[a] < 10) {
				fase[a] = "Pela idade do "+id2+"º tigre ele é considerado adulto";
				JOptionPane.showMessageDialog(null, fase[a]);
				// System.out.println(fase[a]);//CAPITULO 2
			} else if (idade[a] > 10) {
				fase[a] = "Pela idade do "+id2+"º tigre ele é considerado idoso";
				JOptionPane.showMessageDialog(null, fase[a]);
				// System.out.println(fase[a]);//CAPITULO 2
			} else {
				JOptionPane.showMessageDialog(null, "Idade indefinida");
				//System.out.println("Idade Indefinida");// CAPITULO 2
			}
			id2++;
		}
	}

	public void comer() {/* CAPITULO 3 */
		JOptionPane.showMessageDialog(null, "Seu tigre esta comendo...");// CAPITULO 2
	}

	public void Nome(String n) {/* CAPITULO 3 */
		String[] nome;
		nome = new String[3];
		
		
		for (int i = 0; i <= 2; i++) {
			nome[i] = JOptionPane.showInputDialog("Insira o nome do seu "+nm+"º tigre: ");
			JOptionPane.showMessageDialog(null,"O nome do "+nm+"º tigre é "+nome[i]);
			nm++;
			//System.out.printf("Insira o nome do Tigre %d: ", i);// CAPITULO 2
			//nome[i] = input.next();// CAPITULO 2
			//System.out.println(nome[i]); // CAPITULO 2
		}
	}
}