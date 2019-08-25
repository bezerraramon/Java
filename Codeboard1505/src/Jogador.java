import java.util.Random;

public class Jogador {
    /*Nao ha necessidade de criar novas variaveis - NAO EXCLUIR NENHUMA VARIAVEL*/
	private String nome;
	private int vitorias;
	private String[] historico = new String[5];
	private int jogadas;
	private String escolha; //"P" - par "I" - impar
	private int numeroParaJogo;
	
	/*Construtor
	*
	* armazenar nome na variavel nome da classe
	* inicializar vitorias e jogadas como 0
	*/
	
	//FEITO
	public Jogador(String nome) {
		this.nome= nome;
		this.vitorias = 0;
		this.jogadas = 0;
	}
	
	/*Getters and Setters*/
	public void setNumeroParaJogo(int numero) {
		numeroParaJogo = numero;
	}   
	
	public int getNumeroParaJogo() {
		return numeroParaJogo;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	
	public String getEscolha() {
		return escolha;
	}
	
	public void setJogadas(int jogadas){
		this.jogadas = jogadas;
	}
	
	public int getJogadas() {
	    return jogadas;
	}
	
	public void setHistorico(String[] historico){
		this.historico = historico;
	}
	
	public String[] getHistorico(){
	    return historico;
	}
	
	/*Getters and Setters - extendidos*/
	//nao precisa alterar
	public void setVitoria() {
		vitorias++;
		if(jogadas < 5)
			historico[jogadas] = "V";
		else {
			moveHistorico();
			historico[historico.length -1] = "V";
		}
		jogadas++;
	}

    //nao precisa alterar
	public void setDerrota() {
		if(jogadas < 5)
			historico[jogadas] = "D";
		else {
			moveHistorico();
			historico[historico.length -1] = "D";
		}
		jogadas++;
	}
	
	/***Outros metodos***/
	/**Metodos com variaveis aleatorias - nao testaveis**/
	/*Escolha de um numero entre 0 e 5*/
	//nao precisa alterar
    public void escolherNumero() {
		Random rnd = new Random(); 
		int numero = rnd.nextInt(6); 
    	System.out.printf("%s escolheu %d.%n", nome,numero);
		numeroParaJogo =  numero;
	}
	
	/*Escolha de par ou impar - nao testavel*/
	//nao precisa alterar
	public void ParOuImpar() {
		Random rnd = new Random(); 
		int numero = rnd.nextInt(2); 
		if(numero == 0) {
			this.setEscolha("P");
		}else {
			this.setEscolha("I");
		}	
		
		System.out.printf("%s escolheu %s.%n", nome,getEscolha());
	}
	
	/**Metodos testaveis**/
	//nao precisa alterar
	private void moveHistorico() {
		for(int i = 0; i < historico.length-1; i++) {
			historico[i] = historico[i+1];
		}
	}
	
	//nao precisa alterar
	public String imprimirHistorico() {
		String retorno = "Ultimos resultados de "+nome+":\n";
		for(String h : historico) {
			if(h != null) {
				retorno += h+","; 
			}
		}
		retorno = retorno.substring(0, retorno.length()-1);

		return retorno;
	}
	
	/*Define a escolha caso o outro jogador ja tenha escolhido - testavel*/
	/*
	* Se a escolha for "P", define como "I"
	* Senao define como "P"
	*/
	public void definirEscolhaContraria(String escolha) {
		
		if (escolha == "P") {
			this.escolha = "I";
		} else if (escolha == "I") {
			this.escolha = "P";
		}
	}
}