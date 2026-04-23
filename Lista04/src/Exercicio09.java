import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		int vetorC[] = new int[10];
		int temp = 0;
		boolean teveTroca = true;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor do vetor A: ");
			vetorA[i] = leitor.nextInt();
		}
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor do vetor B: ");
			vetorB[i] = leitor.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i + vetorA.length] = vetorB[i];
		}
		while (teveTroca) {
			teveTroca = false;
			for (int i = 0; i < vetorC.length - 1; i++) {
				if (vetorC[i] <= vetorC[i + 1]) {
					temp = vetorC[i];
					vetorC[i] = vetorC[i + 1];
					vetorC[i + 1] = temp;
				}

			}
		}
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}

	}

}
