package miniEstante;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import miniEstante.controller.ClienteController;
import miniEstante.model.Cliente;

public class Menu {

	public static void main(String[] args) {

		ClienteController clientes = new ClienteController();

		Scanner leia = new Scanner(System.in);

		Cliente c1 = new Cliente("Danilo Moraes", "Avenida Lírio Branco", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c1);

		Cliente c2 = new Cliente("Gabriel Farias", "Alameda Manoel Lopes", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c2);

		Cliente c3 = new Cliente("Gustavo Santiago", "Avenida Rio Amarelo", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c3);

		Cliente c4 = new Cliente("Laise Farias", "Avenida Castro Gomes", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c4);

		Cliente c5 = new Cliente("Lucas Marinho", "Alameda João Silva", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c5);

		Cliente c6 = new Cliente("Rebeca Damas", "Rua Lago do Sul", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c6);

		Cliente c7 = new Cliente("Thayane Almeida", "Rua Pedro Afonso", "(11)999999999", clientes.gerarIdCliente());
		clientes.cadastrar(c7);

		int opcao = 0;
		String nome, endereco, telefone;
		int idCliente = 0;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite a tecla Enter!");
				leia.nextLine();
				opcao = 0;
			}

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

				System.out.println("IdCliente: ");
				idCliente = leia.nextInt();

				clientes.deletarCliente(idCliente);
				keyPress();
			}
			case 5 -> {
				System.out.println("Cadastrar Livro");
				keyPress();
			}
			case 6 -> {
				System.out.println("Listar Livros");
				keyPress();
			}
			case 7 -> {
				System.out.println("Atualizar Livro");
				keyPress();
			}
			case 8 -> {
				System.out.println("Excluir Livro");
				keyPress();
			}
			case 9 -> {
				System.out.println("Alugar Livro");
				keyPress();
			}
			case 10 -> {
				System.out.println("Listar Livros Alugados");
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

		}
	}

}
