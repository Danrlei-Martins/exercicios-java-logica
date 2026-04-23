import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite sua idade expressa em dias:");
		int totalDias = leitor.nextInt();

		leitor.close();

		System.out.println("\n" + conversor(totalDias));

	}

	public static String conversor(int totalDias) {
		int totalAnos = totalDias / 365;
		int sobraDias = totalDias % 365;
		int totalMeses = sobraDias / 30;
		int diasRestantes = sobraDias % 30;

		int resultado[] = { totalAnos, totalMeses, diasRestantes };

		return "Você tem " + totalAnos + " anos, " + totalMeses + " mêses e " + diasRestantes + " dias.";

	}

}
