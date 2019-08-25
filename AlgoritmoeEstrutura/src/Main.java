import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		double dinheiro = 0;
		String selecao = "";

		while (!selecao.equals("0")) {
			selecao = JOptionPane.showInputDialog("1 - Deposito\n" + "2 - Sacar\n" + "3  -Consultar\n" + "0 - Sair");

			// JOptionPane.showMessageDialog(null, selecao);

			switch (selecao) {
			case "1":
				double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade a depositar: "));
				dinheiro += deposito;
				JOptionPane.showMessageDialog(null, "Depositado com sucesso!");
				break;

			case "2":
				double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + "quantidade a sacar "));
				dinheiro -= saque;
				JOptionPane.showMessageDialog(null, selecao + "Saque ok!!");
				break;

			case "3":
				JOptionPane.showMessageDialog(null, selecao + "!!!");
				break;
			}

		}

	}
	
	for(int i = 0; i <10; i++) {
		
	}

}