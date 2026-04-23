import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matrizA [][] = new int [12][12];
		int vetorB [] = new int [12];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "] :");
				matrizA[i][j] = leitor.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < matrizA.length; i++) {
			int soma = 0;
			for (int j = 0; j < matrizA.length; j++) {
				soma += matrizA[i][j];
			}
			vetorB[i] = soma;
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}

	}
}