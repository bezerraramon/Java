import javax.swing.JOptionPane;
//import java.util.Scanner;//CAPITULO 2

public class Animal {/*CAPITULO 3*/

	//Scanner input = new Scanner(System.in);//CAPITULO 2 /*CAPITULO 3*/
	
	public void comer(String n) {/*CAPITULO 3*/

		JOptionPane.showMessageDialog(null, "Animal Comendo...");
		//System.out.println("Animal Comendo...");//CAPITULO 2
	}

	public void Nome(String n) {/*CAPITULO 3*/
		String[] nome;
		nome = new String[3];
		
		for (int i = 0; i <= 2; i++) {
			
			//System.out.printf("Insira o nome: ");//CAPITULO 2
			//nome[i] = input.next();//CAPITULO 2
			nome[i] = JOptionPane.showInputDialog("Insira o nome: ");	//CAPITULO 2
		}
	}
}