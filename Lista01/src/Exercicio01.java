import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite valor da base:");
		float valorBase = leitor.nextFloat();

		System.out.print("Digite valor da altura:");
		float valorAltura = leitor.nextFloat();

		leitor.close();

		float valorArea = valorBase * valorAltura;

		System.out.println("\nA área do retangudo é de: " + valorArea);
	}

}
