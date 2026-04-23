import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float notas[] = new float[3];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + "° nota: ");
			notas[i] = leitor.nextFloat();
		}
		leitor.close();

		float mediaFinal = calcularMedia(notas);
		
		System.out.println("\n" + mediaFinal);
	}

	public static float calcularMedia(float notas[]) {
		float soma = 0;

		for (int i = 0; i < notas.length; i++) {
			soma = (notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5);
		}
		

		return soma / 10;
	}

}
