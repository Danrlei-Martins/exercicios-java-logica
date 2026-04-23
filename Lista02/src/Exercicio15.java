import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o índice de poluição: ");
		float IP = leitor.nextFloat();
		leitor.close();
		
		if (IP >= 0.5){
			System.out.print("Atenção! Indústrias dos grupos 1, 2 e 3 devem paralisar as atividades!");
		}else if(IP >=0.4){
			System.out.print("Atenção! Indústrias dos grupos 1e 2 devem paralisar as atividades!");
		}else if(IP >= 0.3){
			System.out.print("Atenção! Indústria do grupo1 deve paralisar as atividades!");
		}
	}
}