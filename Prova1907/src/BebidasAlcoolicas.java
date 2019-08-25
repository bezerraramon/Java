import javax.swing.JOptionPane;

public class BebidasAlcoolicas extends Bebida {

	float teor;
	
	public void Define() {
		String nome = JOptionPane.showInputDialog(null, " Insira o nome da bebidas: "); 
		float preco = Float.parseFloat(JOptionPane.showInputDialog(null, " Insira o nome da bebidas: "));
		float teor = Float.parseFloat(JOptionPane.showInputDialog(null, " Insira o teor da bebidas: "));
		
	}
}
