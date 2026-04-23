
public class Exercicio05 {
	public static void main(String[] args) {

		int alturaChico = 150, alturaZe = 110, anos = 0;

		while (alturaZe <= alturaChico) {
			alturaChico += 2;
			alturaZe += 3;
			anos++;
		}
		System.out.println("\nZé levara " + anos + " anos para ficar maior que Chico.");
	}

}
