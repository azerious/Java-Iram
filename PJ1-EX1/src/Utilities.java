import java.util.Scanner;

public class Utilities {

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner un
	 * réel
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return
	 */
	public static double getUserMultipleInputDouble(String question) {// public rend la fonction utilisable dans
																		// d'autres class
		double value = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextDouble();

		return value;
	}

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner un
	 * entier
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return
	 */
	public static int getUserMultipleInputInteger(String question) {
		int value = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextInt();

		return value;
	}

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner une
	 * phrase
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return
	 */
	public static String getUserMultipleInputString(String question) {
		String value = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextLine();

		return value;
	}

	/**
	 * Permet de retourner une valeur en ayant mis un min et un max OU -1 si la
	 * valeur n'est pas comprise dans les extrémités
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @param min      Valeur minimum
	 * @param max      Valeur maximum
	 * @return
	 */
	public static int getUserInput_WithMinMax(String question, int min, int max) {
		int value = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextInt();

		return min <= value && max >= value ? value : -1;

	}

	/**
	 * Permet de calculer le prix net d'un prix
	 * 
	 * @param prixBrut Prix brut
	 * @param TVA      Taux tva (en %)
	 * @return
	 */
	public static double ComputeNetPrice(double prixBrut, double TVA) {

		return prixBrut * (TVA / 100 + 1);
	}

	/**
	 * Permet de vérifier si le numéro de table encodé est correct
	 * 
	 * @param NUM_MAX_TABLE Numéro de table Max
	 * @return
	 */
	public static int getAndCheckTableNumber(int NUM_MAX_TABLE) {
		int intNumTable = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le N° de table");
		intNumTable = sc.nextInt();

		if (intNumTable > NUM_MAX_TABLE) {
			System.out.println("Saisie incorrecte ! Le N° table le plus élevé est " + NUM_MAX_TABLE
					+ ". Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} // fin else if 1
		else if (intNumTable < 1) {
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égal à 1");
			return -1;
		} // Fin else if 2
		else {
			return intNumTable;
		}
	}

	/**
	 * Permet de retourner si une réponse est vraie ou non
	 * 
	 * @param question La question
	 * @param answer   La réponse
	 * @return
	 */
	public static boolean checkAnswer(String question, String answer) {
		String txtAnswer = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		txtAnswer = sc.nextLine();
		return (txtAnswer.equals(answer));
	}
}
