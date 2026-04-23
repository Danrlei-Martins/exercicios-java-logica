import java.util.Scanner;
public class Exercicio16 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int soma = 0;

		System.out.print("Informe valor de n: ");
		int n = leitor.nextInt();
		System.out.print("Informe valor de a1: ");
		int a1 = leitor.nextInt();
		System.out.print("Informe valor de r: ");
		int r = leitor.nextInt();
		leitor.close();

		int termoAtual = a1;

		for (int i = 1; i <= n; i++) {
			System.out.print(termoAtual + ", ");
			soma += termoAtual;
			termoAtual += r;
		}
		System.out.print("\nA soma dos elementos é: " + soma);

		}
	}