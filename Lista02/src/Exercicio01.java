import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor o primeiro valor: ");
		int valorA = leitor.nextInt();
		
		System.out.print("Informe o valor o segundo valor: ");
		int valorB = leitor.nextInt();
		
		leitor.close();
		
		//String resultado = (valorA % valorB == 0 || valorB % valorA == 0) ? "\nSão múltiplos entre si" : "\nNão são múltiplos entre si";
		
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("\nSão múltiplos entre si");
		}else 
			System.out.println("\nNão são múltiplos entre si");
		
			
		
	
	}

}
