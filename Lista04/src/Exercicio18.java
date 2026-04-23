import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float matriz [][] = new float [9][9];
		float soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Informe o " + (i + 1) + "° valor: ");
				matriz[i][j] = leitor.nextFloat();
				if (i % 2 == 0) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.print("\nA soma dos elementos das linhas pares da matriz é: " + soma);

	}
}