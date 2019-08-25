	import java.util.MissingResourceException;

	public class Passageiro {
		private String nome;
		private String cpf;
		private int idade;
		private Passageiro responsavel;
		
		/*
		* Deve receber nome, cpf(String) e idade
		* Cpf deve ser valido
		* idade deve ser maior ou igual a 18 anos
		*
		* Se idade menor de 18, emitir excecao MissingResourceException("Passageiro menor de idade nao pode viajar sozinho.","Passageiro","Responsavel");
		* Caso CPF invalido, lancar excecao do tipo IllegalArgumentException com mensagem "CPF invalido"
		*/
		public Passageiro() {};
		
		/*
		* Deve receber nome, cpf(String), idade e passageiro responsavel
		* Cpf deve ser valido
		* Caso CPF invalido, lancar excecao do tipo IllegalArgumentException com mensagem "CPF invalido"
		*/
		/*public Passageiro() {};
		
			/*
		* Metodos devem ser construidos segundo padrão get/set/is
		*/

	    
	}

