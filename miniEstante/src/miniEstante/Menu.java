package miniEstante;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		while (true) {
			System.out.println("===============================================");
			System.out.println("                                               ");
			System.out.println("         📚 Bem-vinde a Mini Estante 📚     ");
			System.out.println("                                               ");
			System.out.println("===============================================");
			System.out.println("\t1- Cadastrar Cliente");
			System.out.println("\t2- Ver os Livros Disponíveis");
			System.out.println("\t3- Alugar Livro");
			System.out.println("\t4- Devolver Livro");
			System.out.println("\t5- Sair");
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
				System.out.println("Livros Disponíveis: ");
				keyPress();
			}
			case 2 -> {
				System.out.println("Qual Livro que quer Adicionar? ");
				keyPress();
			}
			case 3 -> {
				System.out.println("Meus livros: ");
				keyPress();
			}
			case 4 -> {
				System.out.println("Qual Livro Deseja Remover? ");
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
