import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		int multiplicacao = 1;

		for (int i = numero; i >= 1; i--) {

			multiplicacao = multiplicacao * i;
		}

		System.out.println("Fatoração: " + multiplicacao);
		
		sc.close();

	}

}
