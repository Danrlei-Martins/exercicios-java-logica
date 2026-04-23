import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int voto = 1, candidato01 = 0, candidato02 = 0, candidato03 = 0, candidato04 = 0, votoNulo = 0, votoBranco = 0;

		while (voto != 0) {
			System.out.print(
				"\n===============================\n" +
				"        URNA ELETRÔNICA        \n" +
				"===============================\n" +
				"  1 - Candidato 01             \n" +
				"  2 - Candidato 02             \n" +
				"  3 - Candidato 03             \n" +
				"  4 - Candidato 04             \n" +
				"  5 - Voto Nulo                \n" +
				"  6 - Voto em Branco           \n" +
				"  0 - Encerrar Votação         \n" +
				"===============================\n" +
				"Digite o código do seu voto: "
			);
			voto = leitor.nextInt();
			System.out.print("\033[H\033[2J");
			System.out.flush();


			switch (voto) {
			case 1:
				candidato01++;
				break;
			case 2:
				candidato02++;
				break;
			case 3:
				candidato03++;
				break;
			case 4:
				candidato04++;
				break;
			case 5:
				votoNulo++;
				break;
			case 6:
				votoBranco++;
				break;
			case 0:
				break;
			default:
				System.out.print("Informe um valor válido. ");
			}
		}
		System.out.print("\nCandidato 01 teve " + candidato01 + " votos." +
						 "\nCandidato 02 teve " + candidato02 + " votos." +
						 "\nCandidato 03 teve " + candidato03 + " votos." +
						 "\nCandidato 04 teve " + candidato04 + " votos." +
						 "\nVotos nulos: " + votoNulo +
						 "\nVotos em branco: " + votoBranco);
	}
}