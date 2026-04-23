import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o valor de I (1 para Crescente ou 2 para Decrescente) : ");
		int valorI = leitor.nextInt();
		System.out.print("Informe o valor de A :");
		float valorA = leitor.nextFloat();
		System.out.print("Informe o valor de B :");
		float valorB = leitor.nextFloat();
		System.out.print("Informe o valor de C :");
		float valorC = leitor.nextFloat();
		leitor.close();

		float valorMaior;
		float valorMedio;
		float valorMenor;

		if (valorA >= valorB && valorA >= valorC) {
			valorMaior = valorA;
		} else if (valorB >= valorA && valorB >= valorC) {
			valorMaior = valorB;
		} else {
			valorMaior = valorC;
		}
		if (valorA <= valorB && valorA <= valorC) {
			valorMenor = valorA;
		} else if (valorB <= valorA && valorB <= valorC) {
			valorMenor = valorB;
		} else {
			valorMenor = valorC;
		}
		valorMedio = (valorA + valorB + valorC) - valorMaior - valorMenor;

		switch (valorI) {
		case 1 :
			System.out.print(valorMenor  + " , " + valorMedio + " e " + valorMaior);
			break;
		case 2:
			System.out.print(valorMaior  + " , " + valorMedio + " e " + valorMenor);
			break;
		default:
			System.out.print("Informe um valor válido!");
		}
	}
}