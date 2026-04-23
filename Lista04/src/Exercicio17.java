import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matrizA [][] = new int [4][4];
		int matrizB [][] = new int [4][4];
		int matrizC[][] = new int [4][4];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Informe o  valor da matriz A [" + i + "][" + j + "] :");
				matrizA[i][j] = leitor.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print("Informe o valor da matriz B [" + i + "][" + j + "] :");
				matrizB[i][j] = leitor.nextInt();

				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
			System.out.println();
		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.println(matrizA[i][j] + " + " + matrizB[i][j] + " = " + matrizC[i][j]);
			}
			System.out.println();
		}
	}
}