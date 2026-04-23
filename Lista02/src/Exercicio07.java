import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a idade do nadador: ");
		int idade = leitor.nextInt();
		leitor.close();

		if (idade >= 18) {
			System.out.print("\nA categoria do nadador é Adulto = maiores de 18 anos ");
		} else if (idade >= 14) {
			System.out.print("\nA categoria do nadador é Juvenil B = 14 -17 anos ");
		} else if (idade >= 11) {
			System.out.print("\nA categoria do nadador é Juvenil A = 11-13 anos ");
		} else if (idade >= 8 ) {
			System.out.print("\nA categoria do nadador é ​Infantil B = 8-10 anos");
		} else 
			System.out.print("\nA categoria do nadador é ​Infantil A = 5-7 anos");
	}
} 