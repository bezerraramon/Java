import java.util.Arrays;
import java.util.MissingResourceException;
import java.util.Objects;

public class Aviao {
	private String modelo, sigla, origem, destino, piloto, mensagem;
	//inicializar embarcados no construtor
	private int capacidade, embarcados;

    //Não inicializado - inicializar no construtor
	private Passageiro[] listaDePassageiros;
	
	/*
	* Deve receber modelo, sigla e capacidade
	* Sigla deve possuir ate 4 caracteres
	* Capacidade deve ser positiva
	*/
	public Aviao() {}
	
	/*
	* Se passageiro tiver idade menor a 18 anos e não possuir um responsavel embarcado no aviao
	* emitir excecao: MissingResourceException("Passageiro menor de idade nao pode viajar sozinho.","Aviao","Responsavel");
	*
	* Se o aviao estiver cheio, lancar excecao do tipo IllegalArgumentException com a mensagem "Aviao cheio" 
	*
	* Se o passageiro ja estiver embarcado, emitir excecao do tipo IllegalArgumentException com a mensagem "Passageiro ja embarcado" 
	*
	* Metodo para adicionar passageiro a listaDePassageiros e controle de passageiros embarcados
	*/
	public void adicionaPassageiro(Passageiro p) {}
	
	public boolean isPassageiroEmbarcado(Passageiro p) {
		return Arrays.asList(listaDePassageiros).contains(p);
	}
	
	/*
	* Caso o destino seja null - Objects.isNull(destino) - emitir excecao do tipo IllegalArgumentException com a mensagem "Aviao sem destino" 
	* Caso a origem seja null emitir excecao do tipo IllegalArgumentException com a mensagem "Aviao sem origem" 
	* Caso piloto seja null emitir excecao do tipo IllegalArgumentException com a mensagem "Aviao sem piloto" 
	*/
	public void viajar() {
	
		
		mensagem = String.format("Viagem realizada: %n"
				+ "Aviao (%s) Modelo: %s%n"
				+ "Piloto: %s %n"
				+ "Origem: %s Destino: %s%n"
				+ "Passageiros(%d):%n"
				+ "%s"
				, sigla,modelo,piloto, origem, destino,embarcados, listarPassageiros());
		
		origem = destino;
		destino = null;
		
	}
	
	public String listarPassageiros() {
		String retorno = "", aux;
		for(Passageiro p : listaDePassageiros) {
			if(!Objects.isNull(p)) {
				aux = (!Objects.isNull(p.getResponsavel()) ? String.format("(Responsavel: %s)",p.getResponsavel().getNome()) : "");
				retorno += String.format("%s - %d anos %s%n", p.getNome(), p.getIdade(), aux);
			}
		}
		return retorno;
	}
	
	/*
	* Metodos devem ser construidos segundo padrão get/set/is
	*/
	
}



