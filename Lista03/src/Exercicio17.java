import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = leitor.nextInt();

		leitor.close();

		for (int i = 1; i <= numero; i++) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}

	}
}