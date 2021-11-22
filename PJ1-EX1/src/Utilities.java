import java.util.Scanner;

public class Utilities {

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner un
	 * réel
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne le réel demandé
	 */
	public static double getUserInputDouble(String question) {// public rend la fonction utilisable dans d'autres
																// classes
		double value = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextDouble();

		return value;
	}

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner une
	 * phrase
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne la phrase demandée
	 */
	public static String getUserInputString(String question) {
		String value = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextLine();

		return value;
	}

	/**
	 * Permet d'envoyer un texte libre en paramètre en lecture et de retourner un
	 * entier
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne l'entier demandé
	 */
	public static int getUserInputInteger(String question) {
		int value = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextInt();

		return value;
	}

	/**
	 * Permet de retourner une valeur en ayant mis un min et un max OU -1 si la
	 * valeur n'est pas comprise dans les extrémités
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @param min      Valeur minimum
	 * @param max      Valeur maximum
	 * @return retourne l'entier demandé si compris entre min max OU retourne -1
	 */
	public static int getUserInputInteger(String question, int min, int max) {
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
	 * @return retourne le prix NET d'un brut
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
	 * @return retourne vrai/faux si la réponse donnée correspond à la réponse
	 *         attendue (sans tenir compte des maj ou des espaces avant / après)
	 */
	public static boolean checkAnswer(String question, String answer) {
		String txtAnswer = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		txtAnswer = sc.nextLine();
		return (txtAnswer.trim().equalsIgnoreCase(answer));
	}

	/**
	 * Permet de boucler une question tant que le nombre rentré n'est pas compris
	 * entre le minimum et le maximum
	 * 
	 * @param question La question
	 * @param min      Nombre minimum accepté (inclus)
	 * @param max      Nombre maximum accepté (inclus)
	 * @return retourne l'entier demandé dans l'écart min max
	 */
	public static int getUserIntegerInput(String question, int min, int max) {
		int value = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(question);
			value = sc.nextInt();
			if (value < min) {
				System.out.println("Saisie incorrecte ! Le nombre doit être supérieur ou égal à " + min);
			} else if (value > max) {
				System.out.println("Saisie incorrecte ! Le nombre doit être inférieur ou égal " + max);
			}
		} while (value < min || value > max);
		return value;
	}

	/**
	 * 
	 * Permet de retourner l'index du nombre rechercher OU -1 si le nombre n'est pas
	 * dans le tableau
	 * 
	 * @param Nombres     Le tableau rempli de nombre sur lequel on souhaite faire
	 *                    la recherche
	 * @param inputNumber Le nombre que l'on recherche dans le tableau
	 * @return index if found, -1 if not found
	 */
	static int isInTab(int Nombres[], int inputNumber) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}

	/**
	 * 
	 * Permet de retourner un booleen vrai/faux si le nombre recherché est dans le
	 * tableau
	 * 
	 * @param Nombres     Le tableau rempli de nombre sur lequel on souhaite faire
	 *                    la recherche
	 * @param inputNumber Le nombre que l'on recherche dans le tableau
	 * @return true if found, false if not found
	 */
	static boolean isInTab(int inputNumber, int Nombres[]) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i]) {
				return true;
			}
			i++;
		}
		return false;
	}

	/**
	 * Permet de rechercher le maximum dans un tableau et de le retourner
	 * 
	 * @param Array Le tableau que l'on envoie
	 * @return retourne le maximum du tableau
	 */
	static int getMax(int Array[]) {
		int max = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
		}
		return max;
	}

}
