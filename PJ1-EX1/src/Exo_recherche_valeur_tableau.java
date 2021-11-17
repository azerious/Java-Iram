
public class Exo_recherche_valeur_tableau {

	public static void main(String[] args) {

		int Nombres[] = { 15, 25, 0, 35, 48, 2, 0, 89, 100, 7 };
		int inputNumber = 0;

		inputNumber = Utilities.getUserInputInteger("Entrez la valeur entière à vérifier dans la liste");

		System.out.println(
				checkNumber(Nombres, inputNumber) == -1 ? "la valeur " + inputNumber + " ne se trouve pas dans la liste"
						: "la valeur " + inputNumber + " se trouve bien dans la liste");

	}

	static int checkNumber(int Nombres[], int inputNumber) {
		int i = 0;

		/*
		 * System.out.println(java.util.Arrays.asList(Nombres).indexOf(inputNumber) !=
		 * -1 ? "la valeur " + inputNumber + " se trouve bien dans la liste" :
		 * "la valeur " + inputNumber + " ne se trouve pas dans la liste");
		 */

		do {
			if (inputNumber == Nombres[i]) {
				return 1;
			}
			i++;
		} while (i < Nombres.length);
		return -1;
	}
}