
public class Mago extends Personagem {

	private int sacrificioCounter = 1;
	private int curaCounter = 1;

	public Mago(String nome) {
		super(nome, "M", "H");
		setVida(1000);
		setMagia(500);
		setDefesa(200);
		setAtaque(0);
	}

	public void encerraTurno() {
		this.setDefesaAtual((50 + this.getDefesaAtual()) * 1.2);
		this.setMagiaAtual((50 + this.getMagiaAtual()) * 1.2);
		this.setVidaAtual((50 + this.getVidaAtual()) * 1.2);
	}

	public void atacarLonge() {
		double magia = this.getMagia() * 0.125;
		if (this.getMagiaAtual() >= magia) {
			this.setMagiaAtual(this.getMagiaAtual() - magia);
			System.out.printf("Ataque proximo de %f pts realizado com sucesso", magia);
		}
	}

	public void defender(double ataque) {
		if (this.getDefesaAtual() > ataque) {
			this.setDefesaAtual(this.getDefesaAtual() - ataque);
			System.out.printf("Defesa de %fpts feita com" + " sucesso%n", ataque);
		} else {
			this.setVidaAtual(this.getVidaAtual() - (ataque - this.getDefesaAtual()));
			System.out.printf("Defesa de %fpts feita" + "com sucesso%n", this.getDefesaAtual());
			this.setDefesaAtual(0);
		}
		if (this.getVidaAtual() < -10) {
			System.out.printf("%s morreu.", this.getNome());
		}
	} //19-2  e 3-

	public void sacrificio() {
		if (sacrificioCounter > 0) {
			this.setVidaAtual(this.getVidaAtual() * 0.9);
			this.setDefesaAtual(this.getDefesaAtual() * 3.0);
			this.sacrificioCounter--;
			System.out.println("Sacrificio feito com sucesso");
		} else
			System.out.println("Sem sacrificios restantes!");
	}

	public void cura(boolean proprio) {
		if (proprio) {
			if (curaCounter > 0) {
				this.setMagiaAtual(this.getMagiaAtual() * 0.9);
				this.setDefesaAtual(this.getDefesaAtual() * 5.0);
				curaCounter--;
				System.out.println("Cura feita com sucesso");
			} else
				System.out.println("Sem curas restantes");
		} else {
			if (curaCounter > 0) {
				this.setMagiaAtual(this.getMagiaAtual() * 0.9);
				curaCounter--;
			}
		}
	}
}