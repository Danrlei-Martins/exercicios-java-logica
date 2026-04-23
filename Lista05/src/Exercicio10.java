import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o tamanho do vetor: ");
		int numero = leitor.nextInt();

		int vetorA[] = new int[numero];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("\nInforme um numero inteiro: ");
			vetorA[i] = leitor.nextInt();
		}
		leitor.close();

		int[] resultadoVetor = fatorial(vetorA);

		for (int i = 0; i < numero; i++) {
			System.out.print("\nFatorial de " + vetorA[i] + " é " + resultadoVetor[i]);
		}

	}

	public static int[] fatorial(int[] vetorA) {
		int[] resultados = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			resultados[i] = fatorialN(vetorA[i]);
		}

		return resultados;
	}

	public static int fatorialN(int valor) {
		int calculoFatorial = 1;

		for (int i = 1; i <= valor; i++) {
			calculoFatorial *= i;
		}

		return calculoFatorial;
	}

}
