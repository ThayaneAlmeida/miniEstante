package miniEstante;

import java.io.IOException;
import java.util.Scanner;

import miniEstante.controller.ClienteController;
import miniEstante.model.Cliente;

public class Menu {

	public static void main(String[] args) {

		ClienteController clientes = new ClienteController();

		Scanner leia = new Scanner(System.in);

		Cliente c1 = new Cliente("Rebeca Damas", "Rua X", 949752214, clientes.gerarIdCliente());
		clientes.cadastrar(c1);

		int opcao = 0;
		String nome, endereco;
		long telefone;
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
			System.out.println("===============================================");
			System.out.println("Digite a opção desejada: ");

			opcao = leia.nextInt();

			if (opcao == 5) {
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
				telefone = leia.nextLong();

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
					telefone = leia.nextInt();

					clientes.atualizar(new Cliente(nome, endereco, telefone, idCliente));

				} else
					System.out.println("O cliente não foi encontrado!");
				keyPress();
			}
			case 4 -> {
				System.out.println("Excluir Cadastro\n\n");

				System.out.println("Nome do Cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

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

	private static Cliente Cliente(String nome, String endereco, long telefone, int gerarIdCliente) {
		// TODO Auto-generated method stub
		return null;
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
