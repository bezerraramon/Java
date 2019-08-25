public class Jogo {
	private Jogador jogador1;
	private Jogador jogador2;
	private int rodadas;

	/*
	 * Definir jogador1 como j1 Definir jogador2 como j2 Inicializar rodadas como 0
	 */
	public Jogo(Jogador j1, Jogador j2) {
		jogador1 = j1;
		jogador2 = j2;
		rodadas = 0;
	}

	// Implementar
	public int getRodadas() {
		return rodadas;
	}

	// Implementar
	public Jogador getJogador1() {
		return jogador1;
	}

	// Implementar
	public Jogador getJogador2() {
		return jogador2;
	}

	/* Escolha de par ou impar - nao testavel */
	/*
	 * Se rodada par, jogador 1 escolhe par ou impar. Jogador 2 recebe a escolha
	 * contraria. Senao, jogador 2 escolhe par ou impar. Jogador 1 recebe a escolha
	 * contraria.
	 */
	// FEITOOOOOOOOO
	public void definirEscolhas() {
		if (rodadas % 2 == 0) {
			jogador1.ParOuImpar();
			jogador2.definirEscolhaContraria(jogador1.getEscolha());
		} else {
			jogador2.ParOuImpar();
			jogador1.definirEscolhaContraria(jogador2.getEscolha());
		}
	}

	/* Determina qual jogador venceu e qual perdeu */
	/*
	 * Definir variavel do tipo de retorno para o retorno Se o resultado for par Se
	 * o jogador1 escolheu par: jogador 1 recebe uma vitoria, jogador 2 recebe uma
	 * derrota e variavel de retorno recebe o nome do vencedor Senao, jogador 2
	 * recebe a vitoria, jogador 1 recebe uma derrota e variavel de retorno recebe o
	 * nome do vencedor Senao Se o jogador1 escolheu impar: jogador 1 recebe uma
	 * vitoria, jogador 2 recebe uma derrota e variavel de retorno recebe o nome do
	 * vencedor Senao, jogador 2 recebe a vitoria, jogador 1 recebe uma derrota e
	 * variavel de retorno recebe o nome do vencedor
	 *
	 * Retornar nome do vencedor
	 */
	public String decideVencedor(int resultado) {
		String vencedor = "";
		if (resultado % 2 == 0) {
			if (jogador1.getEscolha() == "P") {
				jogador1.setVitoria();
				jogador2.setDerrota();
				vencedor = jogador1.getNome();
			} else {
				jogador2.setVitoria();
				jogador1.setDerrota();
				vencedor = jogador2.getNome();

			}
		} else {
			if (jogador1.getEscolha() == "I") {
				jogador1.setVitoria();
				jogador2.setDerrota();
				vencedor = jogador1.getNome();
			} else {
				jogador2.setVitoria();
				jogador1.setDerrota();
				vencedor = jogador2.getNome();

			}
		}
		
		return vencedor;

	}

	/* Executar o jogo */
	/*
	 * Definir as escolhas de par ou impar jogador 1 escolhe seu numero jogador 2
	 * escolhe seu numero armazenar em variavel do tipo int o numero escolhido pelo
	 * jogador um somado com o numero escolhido pelo jogador 2 armazenar em variavel
	 * de texto o vencedor da disputa do par ou impar imprimir o seguinte texto
	 * "Resultado: <numero de resultado> - Vencedor: <nome do vencedor>" -
	 * substituindo <> pelo seu valor incrementar o numero de rodadas; imprimir o
	 * relatorio parcial;
	 */
	public void jogar() {
	int soma;
	String vencedor;
	definirEscolhas();
	jogador1.escolherNumero();
	jogador2.escolherNumero();
	
	soma = (jogador1.getNumeroParaJogo() + jogador2.getNumeroParaJogo());
	vencedor = decideVencedor(soma);
	System.out.println("Resultado: "+soma+"Vencedor: "+vencedor);
	rodadas ++;
	imprimirRelatorioParcial();
	}

	/* Imprimir relatorio ao final de cada rodada - historico */
	public void imprimirRelatorioParcial() {
		System.out.println("Historico Atual");
		System.out.println(jogador1.imprimirHistorico());
		System.out.println(jogador2.imprimirHistorico());
	}

	/* Imprimir relatorio final - nome, vitorias|derrotas */
	/*
	 * Corrigir o trecho ?? pelo texto
	 * "Vitorias|Derrotas: <numero de vitorias>|<numero de derrotas><nova linha>"
	 * para o jogador 1 e para o jogador 2
	 */
	public void imprimirRelatorioFinal() {
		
		System.out.println("Relatorio Final");
		System.out.printf("Jogador: %s%n", jogador1.getNome());
		System.out.printf("Vitorias | Derrota: %d | %d%n",jogador1.getVitorias(), jogador1.getJogadas()-jogador1.getVitorias());
		System.out.printf("Jogador: %s%n", jogador2.getNome());
		System.out.printf("Vitorias | Derrota: %d | %d%n",jogador2.getVitorias(), jogador2.getJogadas()-jogador2.getVitorias());
	}
}