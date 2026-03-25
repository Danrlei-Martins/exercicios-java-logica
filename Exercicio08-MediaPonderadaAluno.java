import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o código do aluno: ");
		int codigoAluno = leitor.nextInt();
		System.out.print("Informe a primeira nota do aluno: ");
		float nota01 = leitor.nextFloat();
		System.out.print("Informe a segunda nota do aluno: ");
		float nota02 = leitor.nextFloat();
		System.out.print("Informe a terceira nota do aluno: ");
		float nota03 = leitor.nextFloat();
		leitor.close();

		float maiorNota = (nota01 >= nota02 && nota01 >= nota03) ? nota01 : (nota02 >= nota03) ? nota02 : nota03;

		float notaMedia = (nota01 * 3 + nota02 * 3 + nota03 * 3 + maiorNota) / 10;

		if (notaMedia >= 7) {
			System.out.print("\nCódigo do aluno: " + codigoAluno);
			System.out.print("\nNotas do aluno: " + nota01 + " , " + nota02 + " e " + nota03);
			System.out.printf("\nNota média: %.2f", notaMedia);
			System.out.print("\nSituação do aluno: APROVADO");
		} else {
			System.out.print("\nCódigo do aluno: " + codigoAluno);
			System.out.print("\nNotas do aluno: " + nota01 + " , " + nota02 + " e " + nota03);
			System.out.printf("\nNota média: %.2f", notaMedia);
			System.out.print("\nSituação do aluno: REPROVADO");
		}
	}
}