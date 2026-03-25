import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o código do funcionário: ");
		int codigoFuncionario = leitor.nextInt();
		System.out.print("Informe o salário do funcionário: ");
		float salario = leitor.nextFloat();
		leitor.close();

		float novoSalario = 0;
		float diferenca = 0;

		switch (codigoFuncionario) {
		case 101:
			diferenca = salario * 0.10f;
			break;
		case 102:
			diferenca = salario * 0.20f;
			break;
		case 103:
			diferenca = salario * 0.30f;
			break;
		default:
			diferenca = salario * 0.40f;
		}
		novoSalario = salario + diferenca;
		System.out.printf("\nSalário antigo: R$ %.2f \nNovo salário: R$ %.2f \nDiferença: R$ %.2f", salario, novoSalario, diferenca);
	}
}