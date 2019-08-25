//import java.util.Scanner;//CAPITULO 2
import javax.swing.JOptionPane;
public class Main {/*CAPITULO 3*/
	
	  public static void main( String[] args ) {
		  
		 // Scanner input = new Scanner(System.in);/*CAPITULO 2/3*/
		  
		  int animal;
		  
		  animal = 0;
		  
		  animal=Integer.valueOf(JOptionPane.showInputDialog(null, "Qual animal?\n1 = Tigre ou 2 = Cao \n R: "));
		  //System.out.printf("Qual animal?\n1 = Tigre ou 2 = Cao \n R: ");//CAPITULO 2
		  //animal = input.nextInt();
		  
		  Cao cao = new Cao();/*CAPITULO 3*/
		  Tigre tigre = new Tigre();/*CAPITULO 3*/
		  
		if(animal == 1) {
			tigre.comer();
			tigre.Nome("");
			tigre.idade(0, "");
		} else if (animal == 2) {
			cao.comer();
			cao.Nome("");
			cao.idade(0, "");
		}else {
			JOptionPane.showMessageDialog(null,"Animal inválido!");/*CAPITULO 2*/
		}
		 
		JOptionPane.showMessageDialog(null,"O cão possui "+cao.getDentes()+" dentes..."+ " já o tigre possui "+ tigre.getDentes()+" dentes.");/*CAPITULO 2*/
	} 
}