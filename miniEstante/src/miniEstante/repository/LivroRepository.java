package miniEstante.repository;

import miniEstante.model.Livro;

public interface LivroRepository {

	public void cadastrar(Livro livro);
	public void atualizar(Livro livro);
	public void procurarLivro(int livro);
	public void listarLivro();
	public void deletarLivro(int livro);
}
