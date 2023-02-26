package miniEstante.model;

public class Emprestimo {
<<<<<<< HEAD
	long idCliente;
	long idLivro;
	String dataAluguel;
	String dataDevolucao;
	
	
	public Emprestimo(long idCliente, long idLivro, String dataAluguel, String dataDevolucao) {
		this.idCliente = idCliente;
		this.idLivro = idLivro;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
	}
	
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdLivro() {
		return idLivro;
	}



	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}

	public String getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void visualizar() {
		System.out.println("-----------------------------------");
		System.out.println("------- DADOS DO EMPRÉSTIMO -------");
		System.out.println("-----------------------------------");
		System.out.println("ID do Livro: " + this.idLivro);
		System.out.println("ID do Cliente: " + this.idCliente);
		System.out.println("Data do aluguel: " + this.dataAluguel);
		System.out.println("Data de devolução: " + this.dataDevolucao);

	}
	
=======

>>>>>>> c36fb1a2972df529fd8a630fbb2cbecb2ac6eb74
}
