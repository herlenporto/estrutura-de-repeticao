import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
        
        sc.close();
		
	}
}
