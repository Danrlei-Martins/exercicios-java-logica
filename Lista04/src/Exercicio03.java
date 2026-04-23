import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um numero inteiro: ");
			vetorA[i] = leitor.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {

			int fatorial = 1;

			for (int j = 1; j <= vetorA[i]; j++) {
				fatorial *= j;
			}
			vetorB[i] = fatorial;
			System.out.println("\nO fatorial de " + vetorA[i] + " é " + vetorB[i]);
		}

	}
}