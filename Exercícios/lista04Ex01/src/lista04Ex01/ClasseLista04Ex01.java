package lista04Ex01;

import java.util.Scanner;

public class ClasseLista04Ex01 {

	public static void main(String[] args) {
		int N,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de refer�ncia");
		N = sc.nextInt();

		for (i=0; i < N && N<=1000; i+=2) {
			int j = i +1; // j necess�rio para lan�ar o +1 pois se fizxer isso com o i ele entende que � incremento e n�o valor �mpar
			System.out.println("Valores pares: "+ i ); //imprime n�meros pares
			System.out.println("Valores �mpares: "+ j ); //imprime n�meros �mpares
		}
		sc.close();
	}

}
