
public class Participantes {
	private String Nome;
	private int numero;
	private int numeroMoto;
	
	public int getNumeroMoto() {
		return numeroMoto;
	}

	public void setNumeroMoto(int numeroMoto) {
		this.numeroMoto = numeroMoto;
	}

	private Titulo[] listaDeTitulos = new Titulo[5];
	public String listarTitulos() {
		return "";
	};
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Titulo[] getListaDeTitulos() {
		return listaDeTitulos;
	}

	public void setListaDeTitulos(Titulo[] listaDeTitulos) {
		this.listaDeTitulos = listaDeTitulos;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}


	

}

