import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[15];
		int pares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe os valores do vetor: ");
			vetorA[i] = leitor.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				pares++;

			}
		}
		System.out.print("\nA quantidade de números pares é: " + pares);

	}

}
