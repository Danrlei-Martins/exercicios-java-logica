import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int valores[] = new int[2];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe o " + (i + 1) + "° valor: ");
			valores[i] = leitor.nextInt();
		}
		leitor.close();

		boolean ehFatorial = correspondeFatorial(valores);

		if (ehFatorial) {
			System.out.print("\n" + valores[0] + " é fatorial de " + valores[1]);
		} else
			System.out.print("\n" + valores[0] + " não é fatorial de " + valores[1]);
	}
	

	public static boolean correspondeFatorial(int valores[]) {
		int calculoFatorial = 1;

		for (int i = 1; i <= valores[0]; i++) {
			calculoFatorial *= i;
		}

		return calculoFatorial == valores[1];
	}

}
