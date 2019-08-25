import java.util.MissingResourceException;
import java.util.Scanner;


public class Passageiro {
	private String nome;
	private String cpf;
	private int idade;
	private Passageiro responsavel;
	
	Scanner scanner = new Scanner(System.in);
	/*
	* Deve receber nome, cpf(String) e idade
	* Cpf deve ser valido
	* idade deve ser maior ou igual a 18 anos
	*
	* Se idade menor de 18, emitir excecao MissingResourceException
	* ("Passageiro menor de idade nao pode viajar sozinho.","Passageiro","Responsavel");
	* Caso CPF invalido, lancar excecao do tipo IllegalArgumentException com mensagem "CPF invalido"
	*/
	public Passageiro(String nome, String cpf, int idade) {
		this.nome = nome;
		
		this.idade = idade;
		if (idade < 18) {
			throw new MissingResourceException("Passageiro menor de idade nao pode viajar sozinho.","Passageiro","Responsavel");
		}
		
		if(ValidarCPF.isCPF(cpf))
			this.cpf = cpf;
		else
			throw new IllegalArgumentException("CPF invalido");
		
	};
	
	/*
	* Deve receber nome, cpf(String), idade e passageiro responsavel
	* Cpf deve ser valido
	* Caso CPF invalido, lancar excecao do tipo IllegalArgumentException com mensagem "CPF invalido"
	*/
	public Passageiro(String nome, String cpf, int idade ,Passageiro responsavel) {
		this.nome = nome;
		if(ValidarCPF.isCPF(cpf))
			this.cpf = cpf;
		else
			throw new IllegalArgumentException("CPF invalido");
		
		this.idade = idade;
		
		this.responsavel = responsavel;
		}
		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Passageiro getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
	};
	   
}