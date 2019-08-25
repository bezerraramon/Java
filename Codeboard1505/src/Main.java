/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        
        // we print a heading and make it bigger using HTML formatting
        System.out.println("<h4>-- Par ou impar - o jogo difinitivo --</h4>");
        
        Jogador jogador1 = new Jogador("Adiel");
		Jogador jogador2 = new Jogador("Badiel");
		Jogo jogo = new Jogo(jogador1, jogador2);
		
		jogo.jogar();
		//jogo.imprimirRelatorioParcial();
		jogo.imprimirRelatorioFinal();
    }
}
