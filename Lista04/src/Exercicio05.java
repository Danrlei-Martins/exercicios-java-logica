import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int contadorC = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe O valor do vetor A: ");
			vetorA[i] = leitor.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o valor inteiro: ");
			vetorB[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					contadorC++;
				}
			}
		}
		int vetorC[] = new int[contadorC];
		int posicao = 0;

		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					vetorC[posicao] = vetorA[i];
					posicao++;
				}
			}
		}
		System.out.println("\nNúmeros em comum:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}

	}
}