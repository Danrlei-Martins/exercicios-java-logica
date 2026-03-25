import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o horario de inicio: ");
		int horaInicio = leitor.nextInt();
		System.out.print("Informe o horario que termina: ");
		int horaFim = leitor.nextInt();
		
		int duracao ;

		if (horaFim <= horaInicio) {
			duracao = (24 - horaInicio) + horaFim;
			System.out.print("\nO jogo durou " + duracao + " horas");
		} else{
			duracao = horaFim - horaInicio;
		System.out.print("\nO jogo durou " + duracao + " horas.");
		}
	}
}