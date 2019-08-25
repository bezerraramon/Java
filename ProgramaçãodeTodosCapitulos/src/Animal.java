import javax.swing.JOptionPane;

public class Animal {
	
	private String nome, raca;
	private int  vida_maxima, vida_media, resposta;
	private double idade;

	
	public Animal(int vida_maxima, int vida_media) {
		
		nome = JOptionPane.showInputDialog("Qual � o nome do seu animal?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?");
		if (resposta == JOptionPane.YES_OPTION) {// verifica se o usu�rio clicou no bot�o YES
			JOptionPane.showMessageDialog(null, "O nome do seu animal � " + nome +".");
			} else {
			JOptionPane.showMessageDialog(null, "O nome do seu n�o � " + nome + " ?");
			}
		
		raca = JOptionPane.showInputDialog("Qual � o ra�a do seu animal?");
		
		String i = JOptionPane.showInputDialog
		        ("Digite a idade do seu animal:");
		 	try{
		 		setIdade(Double.parseDouble(i));	
		 	}
		 	catch (NumberFormatException e){
		 		JOptionPane.showMessageDialog(null,"ERRO");	
		 	}
		 	
		this.vida_media = vida_media;//definir na classe
		
		this.vida_maxima = vida_maxima;//definir na classe
	}
	
	public void Informacoes() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida_maxima() {
		return vida_maxima;
	}

	public void setVida_maxima(int vida_maxima) {
		this.vida_maxima = vida_maxima;
	}

	public int getVida_media() {
		return vida_media;
	}

	public void setVida_media(int vida_media) {
		this.vida_media = vida_media;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

}