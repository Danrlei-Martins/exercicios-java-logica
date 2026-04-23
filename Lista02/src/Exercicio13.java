import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o valor: R$ ");
		int valorLido = leitor.nextInt();
		leitor.close();

		int nota100 = valorLido / 100;
		int resto100 = valorLido % 100;

		int nota50 = resto100 / 50;
		int resto50 = resto100 % 50;

		int nota10 = resto50 / 10;
		int resto10 = resto50 % 10;

		int nota5 = resto10 / 5;
		int resto5 = resto10 % 5;

		int nota2 = resto5 / 2;
		int resto2 = resto5 % 2;

		int nota1 = resto2 / 1;

		System.out.print("\nValor informado: R$" + valorLido + "\nNotas de R$100 : " + nota100 + "\nNotas de R$50 : " + nota50 + "\nNotas de R$10 : " + nota10 + "\nNotas de R$5 : " + nota5 +
						 "\nNotas de R$2 : " + nota2 + "\nNotas de R$1 : " + nota1);
	}
}