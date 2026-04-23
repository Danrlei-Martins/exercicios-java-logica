import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a quantidade de linhas: ");
		int linhas = leitor.nextInt();
		System.out.print("Informe a quantidade de colunas: ");
		int colunas = leitor.nextInt();

		int[][] matriz = new int[linhas][colunas];

		System.out.println();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		leitor.close();

		System.out.println("\nA soma de todos os valores é: " + somaMatriz(matriz));
	}

	public static int somaMatriz(int[][] matriz) {
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		return soma;
	}

}
