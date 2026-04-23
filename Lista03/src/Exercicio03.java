import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe um número inteiro e positivo: \nDigite 0 para finalizar.");

		int produtorio = 1;
		boolean ehPar = false;
		int numero;

		do {
			numero = leitor.nextInt();

			if (numero > 0 && numero % 2 == 0) {
				produtorio *= numero;
				ehPar = true;
			}

		} while (numero != 0);

		if (ehPar) {
			System.out.println("\nO valor final do produtório é: " + produtorio);
		} else
			System.out.println("\nNenhum valor par encontrado.");

	}

}
