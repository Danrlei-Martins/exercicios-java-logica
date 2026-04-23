import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matriz [][] = new int [5][5];
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leitor.nextInt();
				soma += matriz[i][j];
			}
		}
		System.out.print("\nA soma de todos os valores é: " + soma);

	}
}