package miniEstante.repository;

public interface EmprestimoRepository {

	public void procuraLivroAlugado(int numero);
	public void listarLivrosAlugados();
}
