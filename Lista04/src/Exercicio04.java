import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int valorA[] = new int[10];
		int valorB[] = new int[10];
		int valorC[] = new int[valorA.length + valorB.length];

		for (int i = 0; i < valorA.length; i++) {
			System.out.print("Informe O valor do vetor A: ");
			valorA[i] = leitor.nextInt();
		}
		for (int i = 0; i < valorB.length; i++) {
			System.out.print("nforme O valor do vetor B: ");
			valorB[i] = leitor.nextInt();
		}

		for (int i = 0; i < valorA.length; i++) {
			valorC[i] = valorA[i];
			valorC[i + valorA.length] = valorB[i];
		}

		for (int i = 0; i < valorA.length + valorB.length; i++) {
			System.out.print(valorC[i] + "  ");
		}

	}

}
