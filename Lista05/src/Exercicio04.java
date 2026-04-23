import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o custo de fábrica do carro novo: R$");
		float custoFabrica = leitor.nextFloat();

		leitor.close();
		
		float valorFinal = custoConsumidor(custoFabrica);
		
		System.out.printf("\nO custo final de um carro novo para o consumidor será de R$%.2f", valorFinal);

	}

	public static float custoConsumidor(float custoFabrica) {
		float calculoCusto = (float) (((custoFabrica * 0.45) + (custoFabrica * 0.28)) + custoFabrica);
		
		return calculoCusto;
	}

}
