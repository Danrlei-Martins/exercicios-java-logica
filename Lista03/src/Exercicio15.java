import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float nota01 = 0, nota02 = 0, nota03 = 0, mediaNotas = 0, notaMaior = 0;
		int codigoAluno = 1;

		while (codigoAluno >= 0) {
			System.out.print("Informe o código do aluno: ");
			codigoAluno = leitor.nextInt();
			if (codigoAluno < 0) {
				break;
			}
			System.out.print("Informe a primeira nota do aluno: ");
			nota01 = leitor.nextFloat();
			System.out.print("Informe a segunda nota do aluno: ");
			nota02 = leitor.nextFloat();
			System.out.print("Informe a terceira nota do aluno: ");
			nota03 = leitor.nextFloat();

			notaMaior = (nota01 >= nota02) ? nota01 : nota02;
			notaMaior = (notaMaior >=  nota03) ? notaMaior : nota03;

			mediaNotas = (nota01 * 3 + nota02 * 3 + nota03 * 3 + notaMaior) / 10;

			if (mediaNotas >= 5) {
				System.out.printf("\nCódigo do aluno: %d " +
								  "\nNotas do aluno: %.1f , %.1f e %.1f . " +
								  "\nMédia das notas: %.1f . " +
								  "\nSituação: APROVADO", codigoAluno, nota01, nota02, nota03, mediaNotas);
			} else
				System.out.printf("\nCódigo do aluno: %d " +
								  "\nNotas do aluno: %.1f , %.1f e %.1f . " +
								  "\nMédia das notas: %.1f . " +
								  "\nSituação: REPROVADO", codigoAluno, nota01, nota02, nota03, mediaNotas);
		}
	}
}