import java.util.Arrays;
import java.util.MissingResourceException;
import java.util.Objects;

public class Aviao {
	private String modelo, sigla, origem, destino, piloto, mensagem;
	// inicializar embarcados no construtor
	private int capacidade, embarcados;

	// Nao inicializado - inicializar no construtor
	private Passageiro[] listaDePassageiros;

	/*
	 * Deve receber modelo, sigla e capacidade Sigla deve possuir ate 4 caracteres
	 * Capacidade deve ser positiva
	 */

	public Aviao(String modelo, String sigla, int capacidade) {
		this.modelo = modelo;
		if (sigla.length() == 4)
			this.sigla = sigla;
		else
			throw new IllegalArgumentException("Sigla invalida");

		if (capacidade > 0)
			this.capacidade = capacidade;
		else
			throw new IllegalArgumentException("Capacidade invalida");
		this.embarcados = 0;
		this.listaDePassageiros = new Passageiro[capacidade];

	}

	/*
	 * Se passageiro tiver idade menor a 18 anos e nao possuir um responsavel
	 * embarcado no aviao emitir excecao:
	 * MissingResourceException("Passageiro menor de idade nao pode viajar sozinho."
	 * ,"Aviao","Responsavel");
	 *
	 * Se o aviao estiver cheio, lancar excecao do tipo IllegalArgumentException com
	 * a mensagem "Aviao cheio"
	 *
	 * Se o passageiro ja estiver embarcado, emitir excecao do tipo
	 * IllegalArgumentException com a mensagem "Passageiro ja embarcado"
	 *
	 * Metodo para adicionar passageiro a listaDePassageiros e controle de
	 * passageiros embarcados
	 */
	public void adicionaPassageiro(Passageiro p) {
		if (p.getIdade() < 18 && p.getResponsavel() == null)
			throw new MissingResourceException("Passageiro menor de idade nao pode viajar sozinho.", "Aviao",
					"Responsavel");

		if (embarcados == capacidade)
			throw new IllegalArgumentException("Aviao cheio");
		if (isPassageiroEmbarcado(p))
			throw new IllegalArgumentException("Passageiro ja embarcado");
		
		listaDePassageiros[embarcados] = p;
		embarcados++;
	}

	public boolean isPassageiroEmbarcado(Passageiro p) {
		return Arrays.asList(listaDePassageiros).contains(p);
	}

	/*
	 * Caso o destino seja null - Objects.isNull(destino) - emitir excecao do tipo
	 * IllegalArgumentException com a mensagem "Aviao sem destino" Caso a origem
	 * seja null emitir excecao do tipo IllegalArgumentException com a mensagem
	 * "Aviao sem origem" Caso piloto seja null emitir excecao do tipo
	 * IllegalArgumentException com a mensagem "Aviao sem piloto"
	 */
	public void viajar() {
		
		if(Objects.isNull(destino))
			throw new IllegalArgumentException("Aviao sem destino");
		if(Objects.isNull(origem))
			throw new IllegalArgumentException("Aviao sem origem");
		if(Objects.isNull(piloto))
			throw new IllegalArgumentException("Aviao sem piloto");	
		
		mensagem = String.format(
				"Viagem realizada: %n" + "Aviao (%s) Modelo: %s%n" + "Piloto: %s %n" + "Origem: %s Destino: %s%n"
						+ "Passageiros(%d):%n" + "%s",
				sigla, modelo, piloto, origem, destino, embarcados, listarPassageiros());
				
		System.out.println(mensagem);
		origem = destino;
		destino = null;

	}

	public String listarPassageiros() {
		String retorno = "", aux;
		for (Passageiro p : listaDePassageiros) {
			if (!Objects.isNull(p)) {
				aux = (!Objects.isNull(p.getResponsavel())
						? String.format("(Responsavel: %s)", p.getResponsavel().getNome())
						: "");
				retorno += String.format("%s - %d anos %s%n", p.getNome(), p.getIdade(), aux);
			}
		}
		return retorno;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getEmbarcados() {
		return embarcados;
	}

	public void setEmbarcados(int embarcados) {
		this.embarcados = embarcados;
	}

	public Passageiro[] getListaDePassageiros() {
		return listaDePassageiros;
	}

	public void setListaDePassageiros(Passageiro[] listaDePassageiros) {
		this.listaDePassageiros = listaDePassageiros;
	}

	/*
	 * Metodos devem ser construidos segundo padrao get/set/is
	 */

}