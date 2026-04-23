import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero = 1;
		while (numero > 0) {
			System.out.print("\nInforme um número inteiro e positivo: ");
			numero = leitor.nextInt();
			if (numero <= 0) {
				break;
			}
			if (numero % 2 == 0) {
				int qtdDivisores = 0;
				for (int i = 1; i <= numero; i++) {
					if (numero % i == 0) {
						qtdDivisores++;
					}
				}
				System.out.print("\no número "+ numero + " tem "+ qtdDivisores + " Divisores: ");
			} else if (numero % 2 == 1 && numero < 10) {
				int fatorial = 1;
				for (int i = 1; i <= numero; i++) {
					fatorial *= i;
				}
				System.out.print("\nA fatorial de " + numero + " é " + fatorial);
			} else {
				int total = 0;
				for (int i = 1; i <= numero; i++) {
					total += i;
				}
				System.out.print("\nA soma dos inteiros  de " + numero + " é " + total + "\n");
			}
		}
	}
}
