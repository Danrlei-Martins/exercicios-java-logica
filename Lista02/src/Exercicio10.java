import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe seu saldo médio no último ano: R$ ");
		float saldoMedio = leitor.nextFloat();
		leitor.close();

		if (saldoMedio < 0) {
			System.out.print("\nSeu saldo médio é R$ " + saldoMedio + "\nVocê não tem crédito disponivel");
		} else if (saldoMedio <= 200) {
			System.out.print("\nSeu saldo médio é R$ " + saldoMedio + "\nVocê não tem crédito disponivel");
		} else if (saldoMedio <= 400) {
			System.out.printf("\nSeu saldo médio é R$ %.2f . \nVocê tem R$ %.2f de crédito disponivel.", saldoMedio, saldoMedio * 0.20f);
		} else if (saldoMedio <= 600) {
			System.out.printf("\nSeu saldo médio é R$ %.2f . \nVocê tem R$ %.2f de crédito disponivel.", saldoMedio, saldoMedio * 0.30f);
		} else {
			System.out.printf("\nSeu saldo médio é R$ %.2f . \nVocê tem R$ %.2f de crédito disponivel.", saldoMedio, saldoMedio * 0.40f);
		}
	}
}