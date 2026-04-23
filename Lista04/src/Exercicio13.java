import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {

			System.out.print("Informe o valor da posição [" + i + "][" + i + "]:");
			matriz[i][i] = leitor.nextInt();

			soma += matriz[i][i];

		}
		System.out.println("A soma da diagonal principal é: " + soma);
	}
}