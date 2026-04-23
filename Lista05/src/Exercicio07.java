import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a valor de N: ");
		int valorN = leitor.nextInt();

		leitor.close();
		
		System.out.printf("\nO valor de E é: %.3f", calcularE(valorN));

	}
	public static int fatorialN(int valorN) {
		int calculoFatorial = 1;

		for (int i = 1; i <= valorN; i++) {
			calculoFatorial *= i;
		}


		return calculoFatorial;
	}
	public static double calcularE(int valorN){
		double valorE =1.0;
		
		for(int i = 1; i <= valorN; i++){
			valorE += 1.0 /fatorialN(i);
			}
		
		return valorE;
		}
}