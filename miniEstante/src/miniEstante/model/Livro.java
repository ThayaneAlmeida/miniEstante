package miniEstante.model;

public class Livro {

	private int numero;
	private String titulo;
	private String autor;
	private int ano;
	private boolean alugado;
	
	public Livro(int numero, String titulo, String autor, int ano, boolean alugado) {
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

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	public void visualizar() {
		
		System.out.println("Numero do liveo: " + this.numero);
		System.out.println("Titulo do liveo: " + this.titulo);
		System.out.println("Autor do liveo: " + this.autor);
		System.out.println("Ano do liveo: " + this.ano);
		System.out.println("Status do liveo: " + this.alugado);
	}
}
