import java.util.Scanner;
public class Exercicio19 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade = 1, sexo, corCabelo, corOlhos, maiorIdade=0, perfil01=0;

		while (idade > 0) {
			System.out.print("\nQual a sua idade? ");
			idade = leitor.nextInt();
			if (idade <= 0) {
				break;
			}
			System.out.print("Qual seu sexo? 1-FEM/2-MASC ");
			sexo = leitor.nextInt();
			System.out.print("Qual a cor dos olhos? 1-AZUL/ 2-VERDE/ 3-CASTANHO ");
			corOlhos = leitor.nextInt();
			System.out.print("Qual a cor do cabelo? 1-LOIRO/ 2-CASTANHO/ 3-PRETO  ");
			corCabelo = leitor.nextInt();
			
			System.out.print("\033[H\033[2J");
			System.out.flush();
			
			if(idade > maiorIdade){
				maiorIdade = idade;
			}
			if(idade >=18 && idade <= 35 && sexo == 1 && corOlhos == 2 && corCabelo==1){
				perfil01++;
			}
		}
		System.out.print("\nMaior idade é " + maiorIdade + "\nQuantidade de mulheres que bate com o perfil: " + perfil01);




		}
	}