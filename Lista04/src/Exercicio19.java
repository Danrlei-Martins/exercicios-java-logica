import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matrizA [][] = new int [6][6];
		int valorB = 0;
		int vetorC [] = new int [36];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "] :");
				matrizA[i][j] = leitor.nextInt();
			}
			System.out.println();
		}
		System.out.print("\nInforme o valor de B: ");
		valorB = leitor.nextInt();

		int posicaoC = 0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				vetorC[posicaoC] = matrizA[i][j] * valorB;
				posicaoC++;

			}
		}
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print("\nA posição " + i + " do Vetor C recebeu o valor: " + vetorC[i]);
		}

	}
}