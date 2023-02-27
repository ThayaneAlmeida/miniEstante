package miniEstante;

import java.io.IOException;
import java.util.Scanner;

import miniEstante.controller.ClienteController;
import miniEstante.controller.EmprestimoController;
import miniEstante.controller.LivroController;
import miniEstante.model.Cliente;
import miniEstante.model.Emprestimo;
import miniEstante.model.Livro;

public class Menu {

	public static void main(String[] args) {

		ClienteController clientes = new ClienteController();
		
		LivroController livros = new LivroController();
		
		EmprestimoController emprestimos = new EmprestimoController();
		
		
		
		String titulo;
		
		String autor;
		
		String opcao2 = "";
		
		int idLivro = 0;
		
		int ano, att=0;
		
		int alugado;
		
		Scanner leia = new Scanner(System.in);

		Cliente c1 = new Cliente("Danilo Moraes", "Rua Lírio Branco", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c1);

		Cliente c2 = new Cliente("Gabriel Farias", "Rua Cachoeira do Iguaçu", "(11)999999999",
				clientes.gerarIdCliente());
		clientes.cadastrar(c2);

		Cliente c3 = new Cliente("Gustavo Santiago", "Alameda Castro Gomes", "(11)999999999",
				clientes.gerarIdCliente());
		clientes.cadastrar(c3);

		Cliente c4 = new Cliente("Laise Farias", "Rua do Lazer", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c4);

		Cliente c5 = new Cliente("Lucas Marinho", "Avenida João Augusto", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c5);

		Cliente c6 = new Cliente("Rebeca Damas", "Rua do Limoeiro", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c6);

		Cliente c7 = new Cliente("Thayane Almeida", "Alameda das Crianças", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c7);

		int opcao = 0;
		String nome, endereco, telefone;
		int idCliente = 0;
		
		String dataAluguel, dataDevolucao;
		
		
		while (true) {
			System.out.println("===============================================");
			System.out.println("                                               ");

			System.out.println("           📚 Bem-vinde a Mini Estante 📚       ");
			System.out.println("                                               ");
			System.out.println("===============================================");
			System.out.println("\t1- Cadastrar Cliente");
			System.out.println("\t2- Listar Clientes");
			System.out.println("\t3- Atualizar Cadastro");
			System.out.println("\t4- Excluir Cadastro");
			System.out.println("\t5- Cadastrar Livro");
			System.out.println("\t6- Listar Livros");
			System.out.println("\t7- Atualizar Livro");
			System.out.println("\t8- Excluir Livro");
			System.out.println("\t9- Alugar Livro");
			System.out.println("\t10- Listar Livros Alugados");
			System.out.println("\t0- Sair");
			System.out.println("===============================================");
			System.out.println("Digite a opção desejada: ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Obrigade por ter visitado a Mini Estante! Nos vemos logo...");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1 -> {

				System.out.println("Cadastrar Cliente\n\n");

				System.out.println("Digitar o Nome do Cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("Digitar o Endereço do Cliente: ");
				leia.skip("\\R?");
				endereco = leia.nextLine();

				System.out.println("Digitar o Telefone do Cliente: ");
				leia.skip("\\R?");
				telefone = leia.nextLine();

				clientes.cadastrar(new Cliente(nome, endereco, telefone, idCliente));

				keyPress();
			}
			case 2 -> {
				System.out.println("Listar Clientes\n\n");
				clientes.listarClientes();
				keyPress();
			}
			case 3 -> {
				System.out.println("Atualizar Cadastro\n\n");

				System.out.println("\n\nId Cliente: ");
				idCliente = leia.nextInt();

				if (clientes.buscarClienteCollection(idCliente) != null) {

					System.out.println("Nome do Cliente: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Endereço: ");
					leia.skip("\\R?");
					endereco = leia.nextLine();

					System.out.println("Número de Telefone:");
					leia.skip("\\R?");
					telefone = leia.nextLine();

					clientes.atualizar(new Cliente(nome, endereco, telefone, idCliente));

				} else
					System.out.println("O cliente não foi encontrado!");
				keyPress();
			}
			case 4 -> {
				System.out.println("Excluir Cadastro\n\n");

				System.out.println("Id do Cliente: ");
				idCliente = leia.nextInt();

				clientes.deletarCliente(idCliente);

				keyPress();
			}
			case 5 -> {
				System.out.println("Cadastrar Livro");
				System.out.println("Digite o Titulo do livro: ");
				leia.skip("\\R?");
				titulo = leia.nextLine();
				System.out.println("Digite o Autor: ");
				leia.skip("\\R?");
				autor = leia.nextLine();
				System.out.println("Digite o Ano: ");
				ano = leia.nextInt();
				System.out.println("Digite a Disponibilidade(1- Alugado/ 2- Disponível): ");
				alugado = leia.nextInt();
				livros.cadastrar(new Livro ( livros.gerarNumero(), titulo, autor, ano, alugado));
				keyPress();
			}
			case 6 -> {
				System.out.println("Listar Livros");
				livros.listarLivro();
				keyPress();
			}
			case 7 -> {
				System.out.println("Atualizar Livro");
				System.out.println("Digite o id do Livro: ");
				idLivro = leia.nextInt();
				if (livros.buscarLivroNaCollectio(idLivro) != null) {
					System.out.println("Digite o Titulo: ");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					System.out.println("Digite o Autor: ");
					autor = leia.nextLine();
					System.out.println("Digite o Ano: ");
					ano = leia.nextInt();
					System.out.println("Digite a Disponibilidade: ");
					att = leia.nextInt();
					livros.atualizar(new Livro (idLivro, titulo, autor, ano, att));
				}
				keyPress();
			}
			case 8 -> {
				System.out.println("Excluir Livro");
				System.out.println("Digite o id do Livro: ");
				idLivro = leia.nextInt();
				livros.deletarLivro(idLivro);
				keyPress();
			}
			case 9 -> {
				System.out.println("Alugar Livro");
				
				System.out.println("Insira o Id do Cliente");
				idCliente = leia.nextInt();
				System.out.println("Insira o Id do Livro");
				idLivro = leia.nextInt();
				System.out.println("A data de Aluguel: ");
				leia.skip("\\R?");
				dataAluguel = leia.nextLine();
				System.out.println("A data de Devolução: ");
				leia.skip("\\R?");
				dataDevolucao = leia.nextLine();
				
				Emprestimo e1 = new Emprestimo(idCliente, idLivro, dataAluguel, dataDevolucao);
				
				if(clientes.buscarClienteCollection(idCliente) != null 
						&& livros.buscarLivroNaCollectio(idLivro) != null)
				{
					emprestimos.registrarEmprestimo(e1);
					
				}else {
					System.out.println("Dados não encontrados");
				}
				
				
				
				
				keyPress();
			}
			case 10 -> {
				System.out.println("\nListar Livros Alugados");
				System.out.println("=======================");
				
				emprestimos.listarLivrosAlugados();
				keyPress();
			}
			default -> {
				System.out.println("\nOpção Inválida!");
				keyPress();
			}

			}

		}
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
