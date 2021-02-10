package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Account {

	public static void main(String[] args) {
		// Importar o Locale e Scanner
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		// Importar a Classe Client
		Client client;

		// Entrar com n�mero da conta e nome do titular
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		// Fazer a pergunta se quer ou n�o fazer dep�sito inicial
		System.out.println("Is there na initial deposit (y/n)?: ");
		char DecisionDeposit = sc.next().charAt(0);

		// Aplicar a condi��o para o deposito inicial
		if (DecisionDeposit == 'y') {
			System.out.println("Enter a deposit value: ");
			double inicialDeposit = sc.nextDouble();
			// dar entrada para o construtor com 3 par�metros caso sim
			client = new Client(number, holder, inicialDeposit);
		} else {
			// dar entrada para o construtor com 2 par�metros caso n�o
			client = new Client(number, holder);
		}
		// Imprimir a situa��o da conta

		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);

		// Entrar com o valor do dep�sito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		// fazer a liga��o entre atributo deposit da classe Client e o depositValue
		client.deposit(depositValue);
		// Imprimir a situa��o da conta
		System.out.println("Update account data:");
		System.out.println(client);

		System.out.println();
		// Entrar com o valor da retirada
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		// fazer a liga��o entre atributo withdraw da classe Client e o withdrawValue
		client.withdraw(withdrawValue);
		// Imprimir a situa��o da conta
		System.out.println("Update account data:");
		System.out.println(client);

		sc.close();
	}

}
