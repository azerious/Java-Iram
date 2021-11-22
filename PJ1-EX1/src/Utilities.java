import java.util.Scanner;

public class Utilities {

	/**
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner un
	 * r�el
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne le r�el demand�
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
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner une
	 * phrase
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne la phrase demand�e
	 */
	public static String getUserInputString(String question) {
		String value = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextLine();

		return value;
	}

	/**
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner un
	 * entier
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne l'entier demand�
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
	 * valeur n'est pas comprise dans les extr�mit�s
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @param min      Valeur minimum
	 * @param max      Valeur maximum
	 * @return retourne l'entier demand� si compris entre min max OU retourne -1
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
	 * Permet de v�rifier si le num�ro de table encod� est correct
	 * 
	 * @param NUM_MAX_TABLE Num�ro de table Max
	 * @return
	 */
	public static int getAndCheckTableNumber(int NUM_MAX_TABLE) {
		int intNumTable = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le N� de table");
		intNumTable = sc.nextInt();

		if (intNumTable > NUM_MAX_TABLE) {
			System.out.println("Saisie incorrecte ! Le N� table le plus �lev� est " + NUM_MAX_TABLE
					+ ". Contactez l�administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} // fin else if 1
		else if (intNumTable < 1) {
			System.out.println("Saisie incorrecte ! Le N� de table doit �tre sup�rieur ou �gal � 1");
			return -1;
		} // Fin else if 2
		else {
			return intNumTable;
		}
	}

	/**
	 * Permet de retourner si une r�ponse est vraie ou non
	 * 
	 * @param question La question
	 * @param answer   La r�ponse
	 * @return retourne vrai/faux si la r�ponse donn�e correspond � la r�ponse
	 *         attendue (sans tenir compte des maj ou des espaces avant / apr�s)
	 */
	public static boolean checkAnswer(String question, String answer) {
		String txtAnswer = "";

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		txtAnswer = sc.nextLine();
		return (txtAnswer.trim().equalsIgnoreCase(answer));
	}

	/**
	 * Permet de boucler une question tant que le nombre rentr� n'est pas compris
	 * entre le minimum et le maximum
	 * 
	 * @param question La question
	 * @param min      Nombre minimum accept� (inclus)
	 * @param max      Nombre maximum accept� (inclus)
	 * @return retourne l'entier demand� dans l'�cart min max
	 */
	public static int getUserIntegerInput(String question, int min, int max) {
		int value = 0;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(question);
			value = sc.nextInt();
			if (value < min) {
				System.out.println("Saisie incorrecte ! Le nombre doit �tre sup�rieur ou �gal � " + min);
			} else if (value > max) {
				System.out.println("Saisie incorrecte ! Le nombre doit �tre inf�rieur ou �gal " + max);
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
	 * Permet de retourner un booleen vrai/faux si le nombre recherch� est dans le
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
