package miniEstante.model;

public class Cliente {

<<<<<<< HEAD
=======
	private String nome;
	private String endereco;
	private long telefone;
	private int idCliente;

	public Cliente(String nome, String endereco, long telefone, int idCliente) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void visualizar() {

		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Id: " + this.idCliente);

	}
>>>>>>> c36fb1a2972df529fd8a630fbb2cbecb2ac6eb74
}
