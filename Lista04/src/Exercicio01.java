public class Exercicio01 {
	public static void main(String[] args) {

		int [] pares = new int [100];

		for (int i = 0; i < pares.length; i++) {
			pares[i] = i * 2;
			System.out.print("\n" + pares[i]);
		}

	}
}