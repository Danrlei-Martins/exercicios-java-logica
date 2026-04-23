import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o custo de fábrica do carro novo: R$");
		double custoFabrica = leitor.nextDouble();
		
		leitor.close();
		
		double custoConsumidor = ((custoFabrica * 0.45) + (custoFabrica * 0.28))+ custoFabrica;
		System.out.printf("\nO custo final de um carro novo para o consumidor será de R$%.2f", custoConsumidor);
		}

}
