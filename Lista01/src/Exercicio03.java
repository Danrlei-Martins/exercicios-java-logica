import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Valor da primeira nota:");
		float nota1 = leitor.nextFloat();
		
		System.out.print("Valor da segunda nota:");
		float nota2 = leitor.nextFloat();
		
		System.out.print("Valor da terceira nota:");
		float nota3 = leitor.nextFloat();
		
		leitor.close();
		
		float mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5)/ 10;
		System.out.println("\nA média ponderada das notas é: "+ mediaPonderada);
		}

}
