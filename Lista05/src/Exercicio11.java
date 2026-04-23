import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor: ");
		int tamanho = leitor.nextInt();

		int[] vetorA = new int[tamanho];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nInforme um número inteiro: ");
			vetorA[i] = leitor.nextInt();
		}
		leitor.close();

		int maiorValor = maiorValor(vetorA);

		System.out.println("\nO maior valor encontrado foi: " + maiorValor);

	}

	public static int maiorValor(int[] vetorA) {
		int maior = vetorA[0];

		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] >= maior) {
				maior = vetorA[i];
			}

		}

		return maior;
	}

}
