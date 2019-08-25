
public class Guerreiro extends Personagem {

	private int sacrificioCounter = 2;

	public Guerreiro(String nome) {
		super(nome, "M", "H");
		setVida(1000);
		setMagia(0);
		setDefesa(200);
		setAtaque(500);
	}

	public void encerraTurno() {
		this.setAtaqueAtual((50 + this.getAtaqueAtual()) * 1.2);
		this.setDefesaAtual((50 + this.getDefesaAtual()) * 1.2);
		this.setVidaAtual((50 + this.getVidaAtual()) * 1.2);
	}

	public void atacarPerto() {
		double ataque = this.getAtaque() * 0.125;
		if (this.getAtaqueAtual() >= ataque) {
			this.setAtaqueAtual(this.getAtaqueAtual() - ataque);
			System.out.printf("Ataque proximo de %fpts realizado com sucesso", ataque);
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
		if (this.getVidaAtual() <= 0) {
			System.out.printf("%s morreu.", this.getNome());
		}
	}

	public void sacrificio() {
		if (sacrificioCounter > 0) {
			this.setVidaAtual(this.getVidaAtual() * 0.9);
			this.setDefesaAtual(this.getDefesaAtual() * 3.0);
			this.sacrificioCounter--;
			System.out.println("Sacrificio feito com sucesso");
		} else
			System.out.println("Sem sacrificios restantes!");
	}

}
