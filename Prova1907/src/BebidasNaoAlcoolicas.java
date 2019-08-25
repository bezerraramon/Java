import javax.swing.JOptionPane;

public class BebidasNaoAlcoolicas extends Bebida {

	float calorias;
	
	public void Define() {
		String nome = JOptionPane.showInputDialog(null, " Insira o nome da bebidas: "); 
		float preco = Float.parseFloat(JOptionPane.showInputDialog(null, " Insira o nome da bebidas: "));
		float calorias = Float.parseFloat(JOptionPane.showInputDialog(null, " Insira a caloria da bebidas: "));
		
	}
}
