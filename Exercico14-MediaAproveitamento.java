import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("ID do aluno: ");
		int idAluno = leitor.nextInt();
		System.out.print("Informe a primeira nota: ");
		float nota01 = leitor.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota02 = leitor.nextFloat();
		System.out.print("Informe a terceira nota: ");
		float nota03 = leitor.nextFloat();
		System.out.print("Informe a média dos exercicios:  ");
		float ME = leitor.nextFloat();
		leitor.close();

		float MA = (nota01 + nota02 * 2 + nota03 * 3 + ME) / 7;
		char conceito;

		if (MA >= 9) {
			conceito = 'A';
		} else if (MA >= 7.5) {
			conceito = 'B';
		} else if (MA >= 6) {
			conceito = 'C';
		} else if (MA >= 4) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		String status = (MA>= 6) ? "APROVADO" : "REPROVADO";

		System.out.printf("\nID do aluno: %d \nNotas do aluno: NOTA 1: %.1f  NOTA 2: %.1f  NOTA 3: %.1f \nMédia exercícios: %.1f \nMédia de aproveitamento: %.1f \nConceito: %c \nStatus: %s ", idAluno , nota01, nota02, nota03, ME, MA, conceito, status);
	}
}