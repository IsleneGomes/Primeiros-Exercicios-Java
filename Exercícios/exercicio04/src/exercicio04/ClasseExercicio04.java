package exercicio04;
import java.util.Locale;
import java.util.Scanner;

public class ClasseExercicio04 {

	public static void main(String[] args) {
		
		int func, hora;
		float salario, valorHora;
		
		Scanner entrInt = new Scanner(System.in);
		Scanner entr = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o n�mero do funcion�rio: ");
		func = entrInt.nextInt();
		
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		hora = entrInt.nextInt();
		
		System.out.println("Digite o valor da hora trabalhadas: ");
		valorHora = entr.nextFloat();
				
		
		salario = (hora * valorHora);
		
		System.out.printf("NUMBER: %d,\nSALARY: U$ %.2f.", func, salario);
		
		entrInt.close();
		entr.close();
	}

}
