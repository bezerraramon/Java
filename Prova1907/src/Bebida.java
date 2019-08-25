import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Bebida {

	String nome;
	float preco;
	int bebidas[];
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void Define() {
		String nome = JOptionPane.showInputDialog(null, " Insira o nome da bebidas: "); 
		float preco =Float.parseFloat(JOptionPane.showInputDialog(null, " Insira o nome da bebidas: ")); 
		
	}	

	public void Cadastro() {
		String num = JOptionPane.showInputDialog(null, " Insira a quantidade de bebidas: ");
		try {
			int i = Integer.parseInt(num);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite um número válido!");
		} catch (IllegalArgumentException e2) {
			System.exit(0);
		}
		int i = Integer.parseInt(num);
		int bebidas[] = new int[i];
	}
	
	
}
