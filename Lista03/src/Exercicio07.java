import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int valor01 = leitor.nextInt();
			System.out.print("Informe o segundo valor: ");
		int valor02 = leitor.nextInt();
		 int resultado=1;
		 
		for(int i = 1; i<=valor01; i++){
			resultado*=i;
			}
				if(resultado==valor02){
				System.out.print("\n" + valor02 + " é fatorial de " + valor01);
			}else
			System.out.print("\n" + valor02 + " não é fatorial de " + valor01);
	}
}