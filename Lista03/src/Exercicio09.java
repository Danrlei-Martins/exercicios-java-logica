import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			float valorE = 1;
			int fatorial = 1;

			System.out.print("Informe um valor: ");
			int valorN = leitor.nextInt();

			for (int i = 1; i <= valorN; i++) {
				fatorial *= i;
				valorE += 1.0 / fatorial;
			}
			System.out.printf("\nO valor de E é: %.4f ", valorE);
		}

	}
}