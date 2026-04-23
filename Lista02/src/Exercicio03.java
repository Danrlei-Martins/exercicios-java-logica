import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o valor: ");
		int valor = leitor.nextInt();
		
		leitor.close();

		String pariedade = valor % 2 == 0 ? "O número informado é PAR!" : "O número informado é IMPAR!";
		System.out.println(pariedade);
		
		String positivo = valor >= 0 ? "O número informado é POSITIVO!" : "O número informado é NEGATIVO!";
		System.out.println(positivo);

	}

}
