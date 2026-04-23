public class Exercicio02 {
	public static void main(String[] args) {

		int [] primos = new int [10];

		int numero = 2;
		int contadorPrimos = 0;


		while (contadorPrimos < primos.length) {
			boolean ehPrimo = true;
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
			if (ehPrimo == true) {
				primos[contadorPrimos]=numero;
				contadorPrimos++;
			}
			numero++;
		}
		for(int i =0; i < contadorPrimos; i++){
			System.out.println(primos[i]);
		}

	}
}