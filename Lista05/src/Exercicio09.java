import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe valor de n: ");
		int n = leitor.nextInt();
		System.out.print("Informe valor de a1: ");
		int a1 = leitor.nextInt();
		System.out.print("Informe valor de r: ");
		int r = leitor.nextInt();
		leitor.close();

		int[] resultado = parametros(n, a1, r);

		for (int i = 0; i < n; i++) {
			System.out.print(resultado[i] + " ");
		}

	}

	public static int[] parametros(int n, int a1, int r) {
		int[] termos = new int[n];

		for (int i = 0; i < n; i++) {
			termos[i] = a1;
			a1 += r;
		}

		return termos;
	}

}