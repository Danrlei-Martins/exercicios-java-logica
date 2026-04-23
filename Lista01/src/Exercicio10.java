import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe quantos carros foram vendidos:");
		int numeroCarrosVendidos = leitor.nextInt();

		System.out.print("Informe o valor total das vendas:  R$");
		double valorTotalVendas = leitor.nextDouble();

		System.out.print("Informe o salário fixo:  R$");
		double salarioFixo = leitor.nextDouble();

		System.out.print("Informe o valor recebido por carro vendido:  R$");
		double valorCarroVendido = leitor.nextDouble();

		leitor.close();

		double salarioFinal = (valorCarroVendido * numeroCarrosVendidos) + (valorTotalVendas * 0.05) + salarioFixo;
		System.out.printf("\nO salário final do vendedor será de: R$%.2f", salarioFinal);
		}

}
