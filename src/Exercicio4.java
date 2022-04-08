import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe qual número deseja ver a tabuada:");
		int tabuada = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}

		sc.close();

	} 

}
