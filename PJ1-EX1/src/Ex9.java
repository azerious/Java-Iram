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
		int intNumTable = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le N° de table");
		intNumTable = sc.nextInt();

		if (intNumTable >= 1 && intNumTable <= NUM_MAX_TABLE) {
			return intNumTable;
		} else if (intNumTable > NUM_MAX_TABLE) {
			System.out.println("Saisie incorrecte ! Le N° table le plus élevé est " + NUM_MAX_TABLE
					+ ". Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} // fin else if 1
		else if (intNumTable < 1) {
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égal à 1");
			return -1;
		} // Fin else if 2
		else {
			return -1;
		} // Fin else

	}// Fin getAndCheckTableNumber

}