package miniEstante.model;

public class Livro {

<<<<<<< HEAD
=======
	private int numero;
	private String titulo;
	private String autor;
	private int ano;
	private int alugado;
	
	public Livro(int numero, String titulo, String autor, int ano, int alugado) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.alugado = alugado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int isAlugado() {
		return alugado;
	}

	public void setAlugado(int alugado) {
		this.alugado = alugado;
	}
	
	
	public void visualizar() {
		
		int opcao = 0;
		
		switch(opcao) {
		case 1 -> System.out.println("Alugado");
		case 2 -> System.out.println("Disponível");
		}
		
		System.out.println("Numero do livro: " + this.numero);
		System.out.println("Titulo do livro: " + this.titulo);
		System.out.println("Autor do livro: " + this.autor);
		System.out.println("Ano do livro: " + this.ano);
		System.out.println("Status do livro: " + opcao);
	}
>>>>>>> 42a612123bd84b5b4b16bf79ea1df7200e7f1176
}
