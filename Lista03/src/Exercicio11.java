import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = leitor.nextInt();
		leitor.close();

		int numeroEncontrado = 0;
		int numeroTeste = numero+1;

		while (numeroEncontrado < 1) {
			int somaDivisores = 0;
			for (int i = 1;  i < numeroTeste/2 ; i++) {
				if (numeroTeste % i == 0) {
					somaDivisores += i;
				}
			}
			if (somaDivisores == numeroTeste) {
				numeroEncontrado++;
				System.out.print("\nO próximo número perfeito depois do " + numero + " é o " + numeroTeste);
			}
			numeroTeste++;
		}

	}
}