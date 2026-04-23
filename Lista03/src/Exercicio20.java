import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float S = 0;

		System.out.print("Informe um valor inteiro e positivo: ");
		int numero = leitor.nextInt();
		
		leitor.close();
		
		for(int i =1; i <= numero; i++){
			S += 1.0f/i;
			System.out.print("1/" + i + " + ");
		}
		System.out.printf("\nO valor final de S é: %.2f ", S);
			

	}
}