package miniEstante.model;

import java.util.Scanner;

public class Emprestimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.println("                                               ");
		System.out.println("         📚 Bem-vinde a Mini Estante 📚        ");
		System.out.println("                                               ");
		System.out.println("===============================================");

		boolean nomeValido = false;
		String nomeUsuario = "";
		while (!nomeValido) {
			System.out.print("Digite seu nome para começar o empréstimo: ");
			nomeUsuario = scanner.nextLine();
			// Validação do nome do usuário
			if (nomeUsuario.matches("[a-zA-Z ]*") && nomeUsuario.length() > 0) {
				nomeValido = true;
				System.out.println("\nOlá " + nomeUsuario + "! Estamos pronto para começar!");
			} else {
				System.out.println("Nome do usuário inválido. Por favor, digite um nome de usuário válido!");
			}
		}

		boolean livroValido = false;
		String nomeLivro = "";
		while (!livroValido) {
			System.out.println("\nQual livro da lista você deseja emprestar?");
			// ADD LISTA AQUI
			nomeLivro = scanner.nextLine();
			// Validação do nome do livro
			if (nomeLivro.matches("[a-zA-Z ]*") && nomeLivro.length() > 0) {
				livroValido = true;
				System.out.println("\nVocê selecionou o livro " + nomeLivro + "!");
			} else {
				System.out.println("Nome do livro inválido. Por favor, digite um nome de livro válido!");
			}
		}

		boolean opcaoValida = false;
		int opcao2 = 0;
		while (!opcaoValida) {
			System.out.println("\nEste livro está disponível para empréstimo?");
			System.out.println("Digite [1] para SIM ou [2] para NÃO ou pressione qualquer outra tecla para cancelar");
			opcao2 = scanner.nextInt();
			// Validação da opção
			if (opcao2 > 0 && opcao2 < 3) {
				opcaoValida = true;
			} else {
				System.out.println("Opção inválida. Por favor, digite uma opção válida!");
			}
		}

		if (opcao2 == 1) {
			System.out.println("\nÓtimo! Você selecionou SIM!");

			boolean tempoValido = false;
			int tempo = 0;
			while (!tempoValido) {
				System.out.println("Você deseja emprestar este livro por quanto tempo?");
				tempo = scanner.nextInt();
				// Validação do tempo de empréstimo
				if (tempo > 0 && tempo <= 10) {
					tempoValido = true;
					System.out.println("\nVocê selecionou " + tempo + " dias para empréstimo!");

					System.out.println("\nEstamos processando o empréstimo do livro " + nomeLivro + " para "
							+ nomeUsuario + " por " + tempo + " dias!");
					System.out.println("\nEmpréstimo realizado com sucesso!");
				} else {
					System.out.println("Por favor, digite um prazo maior que 0 e menor que 10 dias!");
				}
			}

		} else if (opcao2 == 2) {
			System.out.println("\nVocê selecionou NÃO!");
			System.out.println("Não foi possível realizar o empréstimo. Desculpe-nos pelo inconveniente!");
		} else {
			System.out.println("\nVocê pressionou uma tecla inválida. O empréstimo foi cancelado!");
		}

	}
}