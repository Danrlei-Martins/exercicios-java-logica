import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a quantidade de linhas: ");
		int linhas = leitor.hashCode();
		System.out.println("Informe a quantidade de colunas: ");
		int colunas = leitor.hashCode();

		int[][] matriz = new int[linhas][colunas];

		System.out.println();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		leitor.close();

		System.out.print("\nO menor elemento da diagonal principal é: " + menorValor(matriz));
	}

	public static int menorValor(int[][] matriz) {
		int menor = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][i] <= menor)
				menor = matriz[i][i];
		}

		return menor;
	}

}
