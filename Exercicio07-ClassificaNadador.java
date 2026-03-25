import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a idade do nadador: ");
		int idade = leitor.nextInt();
		leitor.close();

		if (idade >= 5 && idade <= 7) {
			System.out.print("\nA categoria do nadador é ​Infantil A = 5-7 anos");
		} else if (idade >= 8 && idade <= 10) {
			System.out.print("\nA categoria do nadador é ​Infantil B = 8-10 anos");
		} else if (idade >= 11 && idade <= 13) {
			System.out.print("\nA categoria do nadador é Juvenil A = 11-13 anos ");
		} else if (idade >= 14 && idade <= 17) {
			System.out.print("\nA categoria do nadador é Juvenil B = 14 -17 anos ");
		} else {
			System.out.print("\nA categoria do nadador é Adulto = maiores de 18 anos ");
		}
	}
} 