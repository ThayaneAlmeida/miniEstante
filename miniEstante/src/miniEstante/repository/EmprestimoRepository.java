package miniEstante.repository;



import miniEstante.model.Emprestimo;

public interface EmprestimoRepository {

	public void procuraLivroAlugado(int numero);
	public void listarLivrosAlugados();
	
	public void registrarEmprestimo(Emprestimo emprestimo);
	public void renovarEmprestimo(Emprestimo emprestimo);
	public void deletarEmprestimo(long idLivro);


}
