import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vetorA[] = new int [15];
		

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			vetorA[i]= leitor.nextInt();
		}
		int maiorVetor = vetorA[0];
		
		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] >= maiorVetor) {
				maiorVetor = vetorA[i];
			}
		}
		System.out.print("\nO maior número lido foi: " + maiorVetor);


	}
}