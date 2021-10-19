import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		final int NUM_MAX_TABLE = 20;
		int isTableGood = 0;

		isTableGood = getAndCheckTableNumber(NUM_MAX_TABLE);

		if (isTableGood != -1) {
			System.out.println("Vous avez entré le numéro de table " + isTableGood);
		} // Fin if
	}// Fin Main

	public static int getAndCheckTableNumber(int NUM_MAX_TABLE) {
		int intNumTable = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le N° de table");
		intNumTable = sc.nextInt();

		if (intNumTable > NUM_MAX_TABLE) {
			System.out.println("Saisie incorrecte ! Le N° table le plus élevé est " + NUM_MAX_TABLE
					+ ". Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} // fin if
		else if (intNumTable < 1) {
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égal à 1");
			return -1;
		} // Fin else if
		else {
			return intNumTable;
		}// Fin else
	}// Fin getAndCheckTableNumber

}