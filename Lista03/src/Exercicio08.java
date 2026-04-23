public class Exercicio08 {
	public static void main(String[] args) {

		int produtorio = 1;

		for (int i = 92; i <= 107; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo)
				produtorio *= i;
		}
			System.out.print("\nO produtório dos números primos é " + produtorio);
	}
}