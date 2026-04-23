import java.util.Scanner;

public class Exercício09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("                            ---MENU--- \nPRODUTO.                 CÓDIGO.        PREÇO\n \nCachorro-quente          100               R$1,20 \nBauru  simples           101               R$1,30 \nBauru com ovo            102               R$1,50 \nHambúrguer               103               R$1,20 \nMisto quente             104               R$1,30 \nRefrigerante             105               R$1,00\n");
		System.out.print("\nInforme o código do produto:");
		int codigo = leitor.nextInt();
		System.out.print("\nInforme a quantidade: ");
		int quantidade = leitor.nextInt();
		leitor.close();

		float valorTotal = 0;

		switch (codigo) {
		case 100:
			valorTotal = quantidade * 1.20f;
			break;
		case 101:
			valorTotal = quantidade * 1.30f;
			break;
		case 102:
			valorTotal = quantidade * 1.50f;
			break;
		case 103:
			valorTotal = quantidade * 1.20f;
			break;
		case 104:
			valorTotal = quantidade * 1.30f;
			break;
		case 105:
			valorTotal = quantidade * 1.00f;
			break;
		default:
			System.out.print("Informe um código válido!");
		}
		if (valorTotal > 0){
		System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
		}
	}
}