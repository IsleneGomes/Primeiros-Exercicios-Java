package lista02Ex05;

import java.util.Locale;
import java.util.Scanner;

public class ClasseLista02Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int qtd, cod;
		double total;
				
		System.out.println("Digite o c�digo do seu pedido");
		cod = sc.nextInt();
		
		System.out.println("Digite a quantidade");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			System.out.println("Especifica��o: Cachorro Quente");
			total = qtd*4.00;
					System.out.printf("O valor total do Cachorro Quente �: %.2f.\n", total);
		}
		else if (cod == 2) {
			System.out.println("Especifica��o: X - Salada");
			total = qtd*4.50;
					System.out.printf("O valor total do X - Salada �: %.2f.\n", total);
		}
		else if (cod == 3) {
			System.out.println("Especifica��o: X - Bacon");
			total = qtd*5.00;
					System.out.printf("O valor total do X - Bacon �: %.2f.\n", total);
		}
		else if (cod == 4) {
			System.out.println("Especifica��o: Torrada Simples");
			total = qtd*2.00;
					System.out.printf("O valor total da Torrada Simples �: %.2f.\n", total);
		}
		else if (cod == 5) {
			System.out.println("Especifica��o: Refrigerente");
			total = qtd*1.50;
					System.out.printf("O valor total do Refrigerente �: %.2f.\n", total);
		}
		sc.close();
	}

}
