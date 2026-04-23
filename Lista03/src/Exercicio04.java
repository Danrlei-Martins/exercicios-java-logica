import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int valorLido = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe um valor: ");
			valorLido = leitor.nextInt();

			if (valorLido > maior) {
				maior = valorLido;
			} else if (valorLido < menor) {
				menor = valorLido;
			}
			soma += valorLido;
			
			leitor.close();
		}
		System.out.println("\nO maior valor é: " + maior + "\nO menor valor é: " + menor + "\nA média dos valores é: "
				+ ((double) soma / 10));

	}

}
