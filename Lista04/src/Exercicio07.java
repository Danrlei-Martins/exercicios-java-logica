import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[20];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um número inteiro: ");
			vetorA[i] = leitor.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];

			System.out.println("\nA soma dos elementos do número " + vetorA[i] + " é: " + soma);
		}

	}

}
