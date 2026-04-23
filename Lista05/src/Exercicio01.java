import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o valor da base: ");
		float valorBase = leitor.nextFloat();
		System.out.print("Informe o valor da altura: ");
		float valorAltura = leitor.nextFloat();

		leitor.close();
		float valorFinal = areaRetangulo( valorBase,valorAltura);

		System.out.println("\nA área do retângulo é: " + valorFinal);

	}

	public static float areaRetangulo(float valorBase, float valorAltura) {

		float resultado = valorBase * valorAltura;

		return resultado;
	}
}
