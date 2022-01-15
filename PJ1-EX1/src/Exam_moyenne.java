import java.text.DecimalFormat;

public class Exam_moyenne {
	
	final static String format = "0.00";

	static DecimalFormat DfFormat = new DecimalFormat(format);
	final static String[] SUBJECTS = { "Math", "Sciences", "Fran�ais", "G�ographie", "Histoire", "Philo", "Langues" };
	final static int[] WEIGHTS = { 6, 3, 4, 2, 2, 1, 4 };
	final static String[] STUDENTS = { "Virginie Stella", "Jonathan Maes", "Jules Piler", "ReMi SolLaMi",
			"Mattheow � Casu", "Mellissa Biensescheveux", "Jereny Glauque", "Julien Fourien", "Beumier Tudor",
			"Jurasifen Muraptor", "Corentin Fairelesot" };
	final static double[][] RESULTS = { { 9.5, 10, 11, 10, 10, 10, 10 }, { 12, 12, 12, 14, 10, 13, 12 },
			{ 16, 16, 17, 15, 18, 17, 17 }, { 19, 20, 19, 20, 18, 18, 19 }, { 5, 11, 12, 20, 10, 11, 14 },
			{ 14, 14, 14, 15, 13, 15, 14 }, { 10, 11, 10, 11, 10, 10.5, 11 }, { 18, 17, 19, 15, 14, 16, 20 },
			{ 14, 15, 15, 15.5, 14, 13, 14.5 }, { 16, 14, 10, 2, 18, 15, 17 }, { 11, 12, 10, 10, 11, 11.5, 10 } };

	public static void main(String[] args) {

		checkFailAndShowResult();

	}

	/**
	 * Permet de V�rifier si un �chec est dans la liste des points Et si tous est
	 * r�ussi, donne la moyenne de l'�l�ve (avec son nom et sa distinction)
	 * 
	 */
	public static void checkFailAndShowResult() {

		int totalPoid = 0;
		double moyenne = 0.0;
		String nomEtMoyenne = "";

		totalPoid = ponderationTotal(WEIGHTS);

		// J'utilise des boucles "for" dans tout mon code car on utilise a chaque fois
		// les boucles sur des tableaux dont on connait la longueur
		for (int i = 0; i < RESULTS.length; i++) {
			int checkFailed = 0;

			for (int y = 0; y < RESULTS[i].length; y++) {

				if (RESULTS[i][y] < 10) {
					checkFailed--;
				}
			}

			if (checkFailed == 0) {

				moyenne = calculMoyenne(RESULTS[i], totalPoid, WEIGHTS);

				nomEtMoyenne = placeNumberToRank(STUDENTS[i], DfFormat.format(moyenne), 25) + " " + checkGrade(moyenne);

				System.out.println(nomEtMoyenne);

			}

		}

	}

	/**
	 * Permet de calculer la valeur max des ponderation de mani�re g�n�rique
	 * 
	 * @param poids poids des diff�rentes mati�res
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
	 * Permet de calculer la moyenne de chaque �l�ve en fonction de ses r�sultats
	 * 
	 * @param resultats Tableau des r�sultat de l'�l�ve pour chaque mati�re
	 * @param maxPoid   Permet de calculer la moyenne de mani�re pond�r�e
	 * @return
	 */
	public static double calculMoyenne(double resultats[], int maxPoid, int WEIGHTS[]) {

		double totalPoint = 0.0;

		for (int i = 0; i < resultats.length; i++) {

			totalPoint += resultats[i] * WEIGHTS[i];

		}

		return (totalPoint / maxPoid) * 5;
	}

	/**
	 * Permet de v�rifier le grade de l'�l�ve en fonction de sa moyenne
	 * 
	 * @param moyenne
	 * @return
	 */
	public static String checkGrade(double moyenne) {

		
		// Commencer par la plus grande pour �viter de faire un double check avec le &&
		// Faire un tableau avec les grade et les valeur des grades
		if (moyenne >= 60 && moyenne < 70) {
			return "Satisfaction";
		} else if (moyenne >= 70 && moyenne < 80) {
			return "Distinction";
		} else if (moyenne >= 80 && moyenne < 90) {
			return "Grande distinction";
		} else if (moyenne >= 90 && moyenne <= 100) {
			return "La plus grande distinction";
		} else {
			return "";
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
