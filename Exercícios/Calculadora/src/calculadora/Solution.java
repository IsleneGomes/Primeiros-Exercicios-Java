package calculadora;

import java.util.Scanner;


public class Solution {

	
		public static int calculadoraAdicaoSubtracao(int numero, int outroNumero, String operacao) {
		    // Write your code here
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Digite um n�mero: ");
		        numero = sc.nextInt();
		        System.out.println("Digite um o outro n�mero: ");
		        outroNumero = sc.nextInt();
		        System.out.println("Digite a opera��o (+ = soma, - =subtra��o): ");
		        operacao = sc.nextLine();
		        
		        if (operacao == "+"){
		         int soma = numero + outroNumero;
		            System.out.printf("A soma �:%d ", soma);
		        }
		        else if (operacao == "-"){
		            int diferenca = numero - outroNumero;
		            System.out.printf("A diferen�a �:%d ", diferenca);
		            }
		        
		        else {
		        System.out.println("Opera��o Inv�lida");
		        sc.close();
		        }
				return outroNumero;   
		    }

	}


