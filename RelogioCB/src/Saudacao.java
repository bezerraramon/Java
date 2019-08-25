/*
* Saudacoes a implementar
* Bom dia! -> Apos a meia noite ate 8:59:59 da manha
* Quase na hora de comer! -> a partir das 9:00:00 da manha ate 12:30:00
* Comer! -> Apos 12:30:00 ate 13:30:00
* Novamente com fome... -> Para todos os outros casos 
*/

public class Saudacao {

	public String saudar(Relogio r) {
		
		
		
		String txt = "";
		
		

			if (r.getHora() > 0 && r.getHora() < 9) {
				txt = "Bom dia!";
			} else if (r.getHora() >= 9 && r.getHora() <= 12 && r.getMinuto() <= 30) {
				if (r.getHora() != 12) {
					txt = "Quase na hora de comer!";
				} else if (r.getMinuto() <= 30) {
					txt = "Quase na hora de comer!";
				}
			}else if (r.getHora() == 12 || r.getHora() == 13 && r.getMinuto() <= 30) {
					txt = "Comer!";
			} else {
				txt = "Novamente com fome...";
			}
			return txt;
	}
}