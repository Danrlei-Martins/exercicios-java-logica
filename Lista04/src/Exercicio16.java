import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matrizA [][] = new int [4][4];
		int matrizB [][] = new int [4][4];
		int matrizC [][] = new int [4][4];
		int somatorio = 0;

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
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				String textoConta = "";

				for (int k = 0; k < 4; k++) {
					int multiplicacao = matrizA[i][k] * matrizB[k][j];
					matrizC[i][j] += multiplicacao;

					textoConta += "(" + matrizA[i][k] + " * " + matrizB[k][j] + ")";

					if (k < 3) {
						textoConta += " + ";
					}
				}
				System.out.println("Matriz C [" + i + "][" + j + "] -> " + textoConta + " = " + matrizC[i][j]);
			}

			System.out.println();
		}

		leitor.close();
	}
}