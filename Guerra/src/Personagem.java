
public class Personagem extends Request{

	private String nome, sexo, raca;
	private double vida, magia, ataque, defesa;
	private double vidaAtual, magiaAtual, ataqueAtual, defesaAtual;

	public Personagem(String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public void invocar() {
		this.setVidaAtual(this.getVida());
		this.setAtaqueAtual(this.getAtaque());
		this.setDefesaAtual(this.getDefesa());
		this.setMagiaAtual(this.getMagia());
	}

	public double getMagia() {
		return magia;
	}

	public void setMagia(double magia) {
		this.magia = magia;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public double getVidaAtual() {
		return vidaAtual;
	}

	public void setVidaAtual(double vidaAtual) {
		this.vidaAtual = vidaAtual;
	}

	public double getMagiaAtual() {
		return magiaAtual;
	}

	public void setMagiaAtual(double magiaAtual) {
		this.magiaAtual = magiaAtual;
	}

	public double getAtaqueAtual() {
		return ataqueAtual;
	}

	public void setAtaqueAtual(double ataqueAtual) {
		this.ataqueAtual = ataqueAtual;
	}

	public double getDefesaAtual() {
		return defesaAtual;
	}

	public void setDefesaAtual(double defesaAtual) {
		this.defesaAtual = defesaAtual;
	}

	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
}
