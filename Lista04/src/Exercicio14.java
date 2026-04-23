import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetor[][] = new int [5][5];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]:");
				vetor[i][j] = leitor.nextInt();
				if (i == 4 || j == 2) {
					soma += vetor[i][j];
				}
			}
		}
		System.out.print("\na soma dos elementos da linha 5 e da coluna 3: " + soma);
	}
}