import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite sua idade expressa em dias:");
		int totalDias = leitor.nextInt();
		
		leitor.close();
		
		int totalAnos = totalDias / 365;
		int sobraDias =  totalDias % 365;
		int totalMeses = sobraDias / 30;
		int diasFinais = sobraDias % 30;
		
		System.out.println("\nVocê tem " + totalAnos + " anos, " + totalMeses + " mêses e " + diasFinais + " dias.");
		}

}
