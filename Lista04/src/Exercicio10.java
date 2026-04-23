import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int contadorB = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			vetorA[i] = leitor.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			boolean ehPrimo = true;
			if (vetorA[i] < 2) {
				ehPrimo = false;
			} else {
				for (int j = 2; j < vetorA[i]; j++) {
					if (vetorA[i] % j == 0) {
						ehPrimo = false;
						break;
					}
				}
			}
			if (ehPrimo) {
				vetorB[contadorB] = vetorA[i];
				contadorB++;
			}
		}
		System.out.println("\nNúmeros primos encontrados: ");
		for (int i = 0; i < contadorB; i++) {
			System.out.print(vetorB[i] + " ,  ");
		}
	}
}