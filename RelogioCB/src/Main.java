
public class Main {

	public static void main(String[] args) {
		System.out.println("Tic tac");

		Relogio relogio = new Relogio();
		Saudacao saudacao = new Saudacao();

		relogio.setFormato12(false);
		relogio.setHora(9);
		relogio.setMinuto(15);
		relogio.setSegundo(15);

		String saudar = saudacao.saudar(relogio);
		if(relogio.getFormato12()) {
			System.out.printf("%s A hora agora eh %d:%d:%d %s", saudar, relogio.getHora(), relogio.getMinuto(),relogio.getSegundo(), relogio.getTurno());
		}else
			System.out.printf("%s A hora agora eh %d:%d:%d %s", saudar, relogio.getHora(), relogio.getMinuto(),
					relogio.getSegundo(), relogio.getTurno());
	}
}
