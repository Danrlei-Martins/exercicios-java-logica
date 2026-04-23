import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe um número para calcular a fatorial: ");
		int numero = leitor.nextInt();
		leitor.close();

		int fatorial = 1;

		for (int i = numero; i > 1; i--) {
			fatorial *= i;
		}
		System.out.println("\nA fotorial de " + numero + " resulta em: " + fatorial);

	}

}
