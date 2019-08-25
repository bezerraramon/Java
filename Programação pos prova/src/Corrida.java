
public class Corrida {
	private int qtParticipantes = 5;
	private int anoCorrida = 2019;
	private int numCorrida;
	private String nomeCorrida;
	
	private Participantes[] participantes = new Participantes[qtParticipantes];
	
	public Corrida (int q) {
	participantes = new Participantes [q];			
	qtParticipantes = q;
	}
	
	public Participantes verificarPrimeiro() {
		Participantes p = participantes[0];
		return p;
	}
	
	public void encerrar () {
		Participantes p = verificarPrimeiro();
		}
	public void ultrapassar (int pos) {
		Participantes auxiliar = participantes [pos-1]; 
		participantes[pos-1] = participantes [pos];
		participantes[pos] = auxiliar;
		
	}
	/*public String ListarParticipantes() {
		String retorno = "";
		
		for( int i = 0; i < participantes.lenght; i++) {
		retorno += String.format("%s° - 
			*/
	
	public int getQtParticipantes() {
		return qtParticipantes;
	}

	public void setQtParticipantes(int qtParticipantes) {
		this.qtParticipantes = qtParticipantes;
	}

	public int getAnoCorrida() {
		return anoCorrida;
	}

	public void setAnoCorrida(int anoCorrida) {
		this.anoCorrida = anoCorrida;
	}

	public int getNumCorrida() {
		return numCorrida;
	}

	public void setNumCorrida(int numCorrida) {
		this.numCorrida = numCorrida;
	}

	public String getNomeCorrida() {
		return nomeCorrida;
	}

	public void setNomeCorrida(String nomeCorrida) {
		this.nomeCorrida = nomeCorrida;
	}

	public Participantes[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participantes[] participantes) {
		this.participantes = participantes;
	}
	
	
	
}


