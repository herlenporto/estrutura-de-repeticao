import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nota = sc.nextInt();

		while (nota < 0 | nota > 10) {
			System.out.println("Nota invalida");
			nota = sc.nextInt();
		}
		
		sc.close();

	}

}
