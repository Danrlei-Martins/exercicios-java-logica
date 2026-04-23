import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		float nota1 = leitor.nextFloat();

		System.out.print("Digite a segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Digite a terceira nota: ");
		float nota3 = leitor.nextFloat();
		
		leitor.close();

		float notaMedia = (nota1 + nota2 + nota3) / 3;
		

        System.out.println("\nA médias das notas é de: " + notaMedia);
        
	
		
		
	
		
	}

}
