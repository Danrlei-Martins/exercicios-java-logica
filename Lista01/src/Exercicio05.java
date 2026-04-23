import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Quantos anos completos você tem? :");
		int totalAnos = leitor.nextInt();

		System.out.print("Quantos mêses completos você tem? :");
		int totalMeses = leitor.nextInt();

		System.out.print("E por fim, quantos dias? :");
		int totalDias = leitor.nextInt();

		leitor.close();

		int idadeTotalDias = (totalAnos * 365) + (totalMeses * 30) + totalDias;
		System.out.println("\nVocê tem " + idadeTotalDias + " dias de vida até o momento! ");
   }

}
