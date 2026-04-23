import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float salario = 0, somaSalario = 0;
		int idade = 1, totalPessoas = 0, maiorIdade = 0, menorIdade = 0, salarioBaixoFem = 0;

		while (idade > 0) {
			System.out.print("\nQual sua idade ? ");
			idade = leitor.nextInt();
			if (idade < 0) {
				break;
			}
			System.out.print("Qual seu sexo ? 1-FEM/2-MASC:  ");
			int sexo = leitor.nextInt();

			System.out.print("Qual seu salário ? ");
			salario = leitor.nextFloat();

			if (totalPessoas == 0) {
				maiorIdade = idade;
				menorIdade = idade;
			}
			if (idade >= maiorIdade) {
				maiorIdade = idade;
			} else if (idade <= menorIdade) {
				menorIdade = idade;
			}
			if (sexo == 1 && salario <= 100) {
				salarioBaixoFem++;
			}
			somaSalario += salario;
			totalPessoas++;
		}
		System.out.printf("\nSalário médio da população: R$ %.2f " +
						  "\nMaior idade:  %d anos." +
						  "\nMenor idade: %d anos. " +
						  "\n%d mulheres tem salário abaixo de R$100,00 ", somaSalario / totalPessoas, maiorIdade, menorIdade, salarioBaixoFem);
	}
}