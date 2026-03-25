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

		String resultado = (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) ? "Os valores informados formam um TRIÂNGULO!" : "Os valores informados NÃO formam um TRIÂNGULO";
		System.out.print(resultado);
	}
}