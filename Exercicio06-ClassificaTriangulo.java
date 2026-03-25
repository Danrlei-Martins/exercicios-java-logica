import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o valor do lado A: ");
		float ladoA = leitor.nextFloat();

		System.out.print("Informe o valor do lado B: ");
		float ladoB = leitor.nextFloat();

		System.out.print("Informe o valor do lado C: ");
		float ladoC = leitor.nextFloat();
		leitor.close();

		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.print("\nOs três valores são iguais e formam um triângulo EQUILÁTERO");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.print("\nDois valores são iguais e formam um triângulo ISÓSCELES");
		} else
			System.out.print("\nOs três valores são diferentes e formam um triângulo ESCALENO");


	}
}