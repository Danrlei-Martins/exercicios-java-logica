import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o números de linhas: ");
		int linhas = leitor.nextInt();
		System.out.print("Informe o números de colunas: ");
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

		System.out.println("\nA soma da diagonal principal é: " + somaDiagonal(matriz));
	}

	public static int somaDiagonal(int[][] matriz) {
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			soma += matriz[i][i];
		}

		return soma;
	}

}
