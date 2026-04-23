import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetor[][] = new int [5][5];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]:");
				vetor[i][j] = leitor.nextInt();
			}
		}
		int vetorMenor = vetor[0][0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i][i] <= vetorMenor) {
				vetorMenor = vetor[i][i];
			}
		}
		System.out.print("\nO menor elemento da diagonal principal é: " + vetorMenor);
	}
}