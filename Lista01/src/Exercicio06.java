import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a temperatura em Fahrenheit:");
		double temperaturaFahrenheit = leitor.nextDouble();

		leitor.close();

		double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
		System.out.printf("\n%.0fºF é equivalente a %.0fºC. \n ", temperaturaFahrenheit, temperaturaCelsius);
		}

}
