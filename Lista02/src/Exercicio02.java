import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o primeiro valor: ");
		int valor01 = leitor.nextInt();

		System.out.print("Informe o segundo valor: ");
		int valor02 = leitor.nextInt();

		System.out.print("Informe o terceiro valor: ");
		int valor03 = leitor.nextInt();
		
		leitor.close();

		if (valor01 >= valor02 && valor01 >= valor03) {
			System.out.print("\nO maior valor informado foi: " + valor01);
		} else if (valor02 >= valor03 && valor02 >= valor01) {
			System.out.print("\nO maior valor informado foi: " + valor02);
		} else
			System.out.print("\nO maior valor informado foi: " + valor03);

	}

}
