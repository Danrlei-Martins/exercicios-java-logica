import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe quantos carros foram vendidos:");
		int numeroCarrosVendidos = leitor.nextInt();

		System.out.print("Informe o valor total das vendas:  R$");
		float valorTotalVendas = leitor.nextFloat();

		System.out.print("Informe o salário fixo:  R$");
		float salarioFixo = leitor.nextFloat();

		System.out.print("Informe o valor recebido por carro vendido:  R$");
		float valorCarroVendido = leitor.nextFloat();

		leitor.close();

		float salarioFinal = calculoSalario(numeroCarrosVendidos, valorTotalVendas, salarioFixo, valorCarroVendido);
		System.out.printf("\nO salário final do vendedor será de: R$%.2f", salarioFinal);

	}

	public static float calculoSalario(int numeroCarrosVendidos, float valorTotalVendas, float salarioFixo,
			float valorCarroVendido) {
		
		float salarioFinal = (float) ((float) (valorCarroVendido * numeroCarrosVendidos) + (valorTotalVendas * 0.05) + salarioFixo);

		return salarioFinal;
	}

}
