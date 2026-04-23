import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[20];
		int temp = 0;
		boolean teveTroca = true;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um número inteiro: ");
			vetorA[i] = leitor.nextInt();
		}

		while (teveTroca) {
			teveTroca = false;
			for (int i = 0; i < vetorA.length - 1; i++) {
				if (vetorA[i] >= vetorA[i + 1]) {
					temp = vetorA[i];
					vetorA[i] = vetorA[i + 1];
					vetorA[i + 1] = temp;
					teveTroca = true;
				}

			}

		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}

	}
}