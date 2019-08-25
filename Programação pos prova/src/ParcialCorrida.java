//import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class ParcialCorrida {

	public static void main(String[] args) {
		int qtCorredores = 3;
		
		Corrida corrida = new Corrida(qtCorredores);
		
		for(int i=0; i < corrida.getQtParticipantes(); i++) {
			corrida.getParticipantes()[i] = new Participantes();
			String nome = JOptionPane.showInputDialog(null, "Nome do participante");
			corrida.getParticipantes()[i].setNome(nome);
			int num = Integer.parseInt(JOptionPane.showInputDialog("Numero do participante"));
			corrida.getParticipantes()[i].setNumeroMoto(num);
						
		}
		
		String acao = "";
		
		/*do {
			nome = JOptionPane.showInputDialog("O que fazer\n"
					+ "0 : sair\n"
					+ "1 : ultrapassar\n"
					+ "2 : listar participantes\n"
					+ "3 : encerrar corrida");
			
			switch(acao) {
			case "1":
				String txt = String.format("Quem ultrapassou, args)
			*/
		}
		
		System.out.println(corrida.verificarPrimeiro().getNome());
		System.out.print("");
		System.out.print(corrida.verificarPrimeiro().getNumeroMoto());		
		corrida.ultrapassar(1);
		System.out.println(corrida.verificarPrimeiro().getNome());
		System.out.print("");
		System.out.print(corrida.verificarPrimeiro().getNumeroMoto());		
		corrida.ultrapassar(2);
		corrida.ultrapassar(1);
		System.out.println(corrida.verificarPrimeiro().getNome());
		
		System.out.print("");
		System.out.print(corrida.verificarPrimeiro().getNumeroMoto());
	}


