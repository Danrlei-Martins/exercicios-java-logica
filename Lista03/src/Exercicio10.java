public class Exercicio10 {
	public static void main(String[] args) {

		int quantidadePerfeitos = 0, numeroTest = 1;

		while (quantidadePerfeitos < 5) {
			int somaDivisores = 0;
			for (int i = 1; i <= numeroTest / 2; i++) {
				if (numeroTest % i == 0) {
					somaDivisores += i;
				}
			}
			if (somaDivisores == numeroTest) {
				quantidadePerfeitos++;
				System.out.print("\n" + numeroTest);
			}
			numeroTest++;
		}

	}
}