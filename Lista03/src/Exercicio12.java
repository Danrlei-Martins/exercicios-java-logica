import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float salario = 1, somaSalarios = 0, somaFilhos = 0, maiorSalario = 0;
		int numeroDeFilhos = 0, totalRept = 0, salarioBaixo = 0;

		while (salario > 0) {
			System.out.print("\nInforme o salário: ");
			salario = leitor.nextFloat();

			if (salario <= 0) {
				break;
			}
			System.out.print("Informe a quantidade de filhos: ");
			numeroDeFilhos = leitor.nextInt();

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario <= 100) {
				salarioBaixo++;
			}
			somaSalarios += salario;
			somaFilhos += numeroDeFilhos;
			totalRept++;
		}
		if (totalRept > 0) {
			System.out.printf("\nMédia salárial: R$ %.2f \nMédia de filhos: %.1f \nMaior salário: R$ %.2f \nSalário menor que R$100: %.0f%%", somaSalarios / totalRept, somaFilhos / totalRept, maiorSalario,
							  (salarioBaixo * 100.0) / totalRept);
		} else
			System.out.print("\nInsira um valor válido!");

	}
}