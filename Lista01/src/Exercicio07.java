import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Insira o valor do seu sálario atual: R$");
		double salarioAtual = leitor.nextDouble();

		System.out.print("Quantos porcentos seu sálario ira aumentar? ");
		double porcentagemAumento = leitor.nextDouble();

		leitor.close();

		double valorAumento = salarioAtual * (porcentagemAumento / 100.0);
		double novoSalario = salarioAtual + valorAumento;

		System.out.printf("\nSeu novo sálario será de: R$%.2f", novoSalario);
		}

}
