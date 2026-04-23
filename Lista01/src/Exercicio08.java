import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Total de votos: ");
		int totalEleitores = leitor.nextInt();
		
		System.out.print("Total de votos em branco: ");
		int votosBrancos = leitor.nextInt();
		
		System.out.print("Total de votos nulos: ");
		int votosNulos = leitor.nextInt();
		
		System.out.print("Total de votos válidos: ");
		int votosValidos = leitor.nextInt();
		
		leitor.close();
		
		double percentualBrancos = ( (double)votosBrancos / totalEleitores)* 100;
		double percentualNulos = ( (double)votosNulos / totalEleitores)* 100;
		double percentualValidos = ( (double)votosValidos / totalEleitores)* 100;
		
		System.out.printf("\nVotos em branco: %.2f%% \n",percentualBrancos);
		System.out.printf("\nVotos nulos: %.2f%% \n",percentualNulos);
		System.out.printf("\nVotos válidos: %.2f%% \n",percentualValidos);
		}

}
