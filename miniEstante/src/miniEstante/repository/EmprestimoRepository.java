package miniEstante.repository;

public interface EmprestimoRepository {

	public void procuraLivroAlugado(int numero);
	public void listarLivrosAlugados();
	
	public void registrarEmprestimo();
	public void renovarEmprestimo();
	public void deletarEmprestimo();
}
