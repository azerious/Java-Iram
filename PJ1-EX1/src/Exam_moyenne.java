import java.text.DecimalFormat;

public class Exam_moyenne {

	final static String FORMAT = "0.00";
	final static int noteMax = 20;

	final static String format = "0.00";

	static DecimalFormat DfFormat = new DecimalFormat(format);

	final static String[] SUBJECTS = { "Math", "Sciences", "Français", "Géographie", "Histoire", "Philo", "Langues" };
	final static int[] WEIGHTS = { 6, 3, 4, 2, 2, 1, 4 };
	final static String[] STUDENTS = { "Virginie Stella", "Jonathan Maes", "Jules Piler", "ReMi SolLaMi",
			"Mattheow Ô Casu", "Mellissa Biensescheveux", "Jereny Glauque", "Julien Fourien", "Beumier Tudor",
			"Jurasifen Muraptor", "Corentin Fairelesot", "Test Subject" };
	final static double[][] RESULTS = { { 9.5, 10, 11, 10, 10, 10, 10 }, { 12, 12, 12, 14, 10, 13, 12 },
			{ 16, 16, 17, 15, 18, 17, 17 }, { 19, 20, 19, 20, 18, 18, 19 }, { 5, 11, 12, 20, 10, 11, 14 },
			{ 14, 14, 14, 15, 13, 15, 14 }, { 10, 11, 10, 11, 10, 10.5, 11 }, { 18, 17, 19, 15, 14, 16, 20 },
			{ 14, 15, 15, 15.5, 14, 13, 14.5 }, { 16, 14, 10, 2, 18, 15, 17 }, { 11, 12, 10, 10, 11, 11.5, 10 },
			{ 10, 10, 10, 10, 10, 10, 10 } };

	public static void main(String[] args) {

		double moyenne = 0.0;

		// J'utilise des boucles "for" dans tout mon code car on utilise a chaque fois
		// les boucles sur des tableaux dont on connait la longueur
		for (int i = 0; i < RESULTS.length; i++) {
			boolean checkFailed = true;

			checkFailed = checkFail(RESULTS[i]);

			if (checkFailed) {

				moyenne = calculMoyenne(RESULTS[i], WEIGHTS);

				showGrade(moyenne, STUDENTS[i], WEIGHTS);

			}

		}

	}

	public static boolean checkFail(double[] individualResult) {

		for (int y = 0; y < individualResult.length; y++) {

			if (individualResult[y] < 10) {
				return false;
			}
		}
		return true;
	}

	public static void showGrade(double moyenne, String student, int[] WEIGHTS) {
		String nomEtMoyenne = "";

		nomEtMoyenne = placeNumberToRank(student, formatNumber(FORMAT, moyenne), 25) + " " + checkGrade(moyenne);

		System.out.println(nomEtMoyenne);
	}

	public static String formatNumber(String format, double number) {
		DecimalFormat DfFormat = new DecimalFormat(format);
		return DfFormat.format(number);
	}

	/**
	 * Permet de calculer la valeur max des ponderation de manière générique
	 * 
	 * @param poids poids des différentes matières
	 * @return
	 */
	public static int ponderationTotal(int poids[]) {

		int max = 0;

		for (int i = 0; i < poids.length; i++) {
			max += poids[i];

		}

		return max;

	}

	/**
	 * Permet de calculer la moyenne de chaque élève en fonction de ses résultats
	 * 
	 * @param resultats Tableau des résultat de l'élève pour chaque matière
	 * @param maxPoid   Permet de calculer la moyenne de manière pondérée
	 * @return
	 */
	public static double calculMoyenne(double resultats[], int WEIGHTS[]) {

		double totalPoint = 0.0;
		int totalPoid = 0;

		totalPoid = ponderationTotal(WEIGHTS);

		for (int i = 0; i < resultats.length; i++) {

			totalPoint += resultats[i] * WEIGHTS[i];

		}

		return (totalPoint / totalPoid) * (100 / noteMax);
	}

	/**
	 * Permet de vérifier le grade de l'élève en fonction de sa moyenne
	 * 
	 * @param moyenne
	 * @return
	 */
	public static String checkGrade(double moyenne) {

		// Commencer par la plus grande pour éviter de faire un double check avec le &&
		// Faire un tableau avec les grade et les valeur des grades

		if (moyenne >= 90) {
			return "La plus grande distinction";
		} else if (moyenne >= 80) {
			return "Grande distinction";
		} else if (moyenne >= 70) {
			return "Distinction";
		} else {
			return "Satisfaction";
		}

	}

	/**
	 * combine an original string with a decimal number placed after the string at a
	 * specific rank to do a number's right alignment. Original string is completed
	 * by spaces " "
	 * 
	 * @param strOriginalStr   : original string wich will be completed by the
	 *                         number
	 * @param strNumberToPlace : decimal number in string format to add at the end
	 *                         of the original string
	 * @param rank             : rank to place de last number's figure
	 */
	public static String placeNumberToRank(String strOriginalStr, String strNumberToPlace, int rank) {
		int spaceCount = 0;
		String strTmp = "";
		spaceCount = rank - strOriginalStr.length() - strNumberToPlace.length();

		if (spaceCount > 0) {
			strTmp = strOriginalStr + " ".repeat(spaceCount) + strNumberToPlace;

			// in the case of Original String is too long, sacrify the string's end to leave
			// space for the number
		} else {
			strTmp = strOriginalStr.substring(0, rank - strNumberToPlace.length() - 1);
			strTmp = strTmp + " " + strNumberToPlace;
		} // end if

		return strTmp;
	}// end placeNumberToRank

}
