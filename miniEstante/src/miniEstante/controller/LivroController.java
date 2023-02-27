package miniEstante.controller;

import java.util.ArrayList;

import miniEstante.model.Livro;
import miniEstante.repository.LivroRepository;

public class LivroController implements LivroRepository{
	
	private ArrayList<Livro>listaLivro = new ArrayList<Livro>();
	
	int numero = 0;

	@Override
	public void cadastrar(Livro livro) {
		listaLivro.add(livro);
		System.out.println("Livro Cadastrado");
	}

	@Override
	public void atualizar(Livro livro) {
		var procurarLivro = buscarLivroNaCollectio(livro.getNumero());
		if (procurarLivro != null) {
			listaLivro.set(listaLivro.indexOf(procurarLivro), livro);
			System.out.println("O livro foi encontrado");
		}else
			System.out.println("O livro não foi encontrado");
	}

	@Override
	public void procurarLivro(int id) {
		var livro = buscarLivroNaCollectio(id);
		
		if (livro != null)
			livro.visualizar();
		else
			System.out.println("O livro " + id + " Não foi encontrado");
	}

	@Override
	public void listarLivro() {
		for (var livro : listaLivro) {
			livro.visualizar();
		}
		
	}

	@Override
	public void deletarLivro(int id) {
		var livro = buscarLivroNaCollectio(id);
		
		if (livro != null) {
			if(listaLivro.remove(livro) == true)
				System.out.println("O livro " + livro + " Foi excluido");
		}else
		System.out.println("O livro " + livro + " Não foi encontrado!");
	}
	
	public Livro buscarLivroNaCollectio(int numero) {
		for (var livro : listaLivro) {
			if (livro.getNumero() == numero)
				return livro;
		}
		return null;
	}
	public int gerarNumero() {
			return ++numero;
		}

}
