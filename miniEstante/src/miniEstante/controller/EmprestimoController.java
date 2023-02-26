package miniEstante.controller;

import java.util.ArrayList;

import miniEstante.model.Emprestimo;
import miniEstante.repository.EmprestimoRepository;

public class EmprestimoController implements EmprestimoRepository {

	private ArrayList<Emprestimo> listaEmprestimo = new ArrayList<Emprestimo>();

	@Override
	public void procuraLivroAlugado(int numero) {
		// Pegar Id do livro

	}

	@Override
	public void listarLivrosAlugados() {

		for (var emprestimo : listaEmprestimo)
			emprestimo.visualizar();

	}

	@Override
	public void registrarEmprestimo(Emprestimo emprestimo) {
		listaEmprestimo.add(emprestimo);
		System.out.println("Empréstimo Registrado!");
	}

	@Override
	public void renovarEmprestimo(Emprestimo emprestimo) {
	 var buscaEmprestimo = buscarAluguelNaCollection(emprestimo.getIdLivro)
		
	}

	@Override
	public void deletarEmprestimo(int idLivro) {
		var emprestimo = buscarAluguelNaCollection(idLivro);
		
		if(idLivro != null) {
			if(listaEmprestimo.remove(idLivro)== true)
				System.out.println("O Empréstimo " + idLivro + " foi retirado da lista!");
		}else
			System.out.println("O Empréstimo " + idLivro + " não foi encontrado!");
	}


	public Emprestimo buscarAluguelNaCollection(int idLivro) {
		for (var emprestimo : listaEmprestimo) {
			if (emprestimo.getIdLivro() == idLivro)
				return emprestimo;
		}

		return null;
	}
}
