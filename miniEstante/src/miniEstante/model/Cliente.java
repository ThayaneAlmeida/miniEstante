package miniEstante.model;

public class Cliente {

<<<<<<< HEAD
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
=======
>>>>>>> 42a612123bd84b5b4b16bf79ea1df7200e7f1176
}
