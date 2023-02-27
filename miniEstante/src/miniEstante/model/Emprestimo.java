package miniEstante.model;

public class Emprestimo {

	int idCliente;
	int idLivro;
	String dataAluguel;
	String dataDevolucao;
	
	
	public Emprestimo(int idCliente, int idLivro, String dataAluguel, String dataDevolucao) {
		this.idCliente = idCliente;
		this.idLivro = idLivro;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
	}
	
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdLivro() {
		return idLivro;
	}



	public void setIdLivro(int idLivro) {
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

}
