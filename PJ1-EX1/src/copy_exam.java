import java.text.DecimalFormat;

public class copy_exam {

	final static String FORMAT = "0.00";
	static DecimalFormat DfFormat = new DecimalFormat(FORMAT);
	final static int RANKS[] = {10, 21, 32, 48, 60};
	final static int DATAS[][] = { { 205, 13238 }, { 220, 13426 }, { 221, 11034 }, { 147, 9522 }, { 140, 6435 } };
	final static String WEEKS[][] = { { "03/10/2021", "09/12/2021" }, { "10/12/2021", "16/12/2021" },
			{ "17/12/2021", "23/12/2021" }, { "24/12/2021", "30/12/2021" }, { "31/12/2021", "06/01/2022" } };
	final static String HEADER[] = { "DateFrom", "DateTo", "Cases", "Adminissions", "Status" };
	final static int MAXLENGTHFORRANKS = WEEKS[0][0].length() + 1;

	public static void main(String[] args) {
		double[] pourcentages = new double[DATAS[0].length];
		String status = "";

		header(HEADER, MAXLENGTHFORRANKS);

		// J'utilise des for dans tout mon code car je parcour des tableaux dont je
		// connais la longueur à chaque fois
		for (int i = 1; i < WEEKS.length; i++) {
			String affichageFinal = WEEKS[i][0];
			pourcentages = calculerPourcent(DATAS[i], DATAS[i - 1]);
			status = checkStatus(DATAS[i], DATAS[i - 1]);

			affichageFinal = constructionAffichage(affichageFinal, WEEKS[i][1], MAXLENGTHFORRANKS, pourcentages, status,
					DATAS[i], DATAS[i - 1]);
			System.out.println(affichageFinal);

		}
	}

	public static String constructionAffichage(String affichageFinal, String WEEKS, int maxlengthToRanks,
			double[] pourcentages, String status, int[] datasCurrent, int[] datasPrevious) {
		String finalAffichage = affichageFinal;

		finalAffichage = placeNumberToRank(finalAffichage, WEEKS, RANKS[1]);
		finalAffichage = constructTendance(finalAffichage, pourcentages, maxlengthToRanks, datasCurrent, datasPrevious);
		finalAffichage = placeNumberToRank(finalAffichage, status, RANKS[4]);

		return finalAffichage;
	}

	public static double[] calculerPourcent(int[] datasCurrent, int[] datasPrevious) {
		double[] pourcents = new double[datasCurrent.length];

		for (int i = datasCurrent.length - 1; i >= 0; i--) {
			pourcents[Math.abs(i - 1)] = Math.abs((double) datasCurrent[i] / (double) datasPrevious[i] * 100 - 100);
		}
		return pourcents;
	}

	/**
	 * Permet de verifier le nivreau de status des pourcentages de cas (rouge, vert,
	 * orange)
	 * 
	 * @param datasCurrent
	 * @param datasPrevious
	 * @return
	 */
	public static String checkStatus(int[] datasCurrent, int[] datasPrevious) {
		int statusChecker = 0;

		for (int i = 0; i < datasCurrent.length; i++) {
			// Si le montant de cas / admissions sont suppérieur à la semaine précédante
			// alors incrementer le compteur de statuschekcer
			// Le total de statuschecker donne le resultat (rouge, vert, orange)
			if (datasCurrent[i] - datasPrevious[i] > 0) {
				statusChecker++;
			} else if (datasCurrent[i] - datasPrevious[i] < 0) {
				statusChecker--;
			}
		}
		if (statusChecker < 0) {
			return "GREEN";
		} else if (statusChecker == datasCurrent.length) {
			return "RED";
		} else {
			return "ORANGE";
		}
	}

	/**
	 * Permet de construire le header independament du reste des tableaux
	 * 
	 * @param HEADER
	 * @param longueurRank
	 */
	public static void header(String[] HEADER, int longueurRank) {
		String finalHeader = "";

		for (int i = 0; i < HEADER.length; i++) {
			finalHeader = placeNumberToRank(finalHeader, HEADER[i], RANKS[i]);
		}
		System.out.println(finalHeader);
	}

	/**
	 * Fonction qui permet de construire l'affichage des % a la suite des dates
	 * 
	 * @param str
	 * @param pourcents
	 * @param longueurMax
	 * @param datasCurrent
	 * @param datasPrevious
	 * @return
	 */
	public static String constructTendance(String str, double[] pourcents, int longueurMax, int[] datasCurrent,
			int[] datasPrevious) {

		String string = str;

		for (int i = 0; i < datasCurrent.length; i++) {
			// Utilisation d'une ternairep our adapter le signe devant le pourcentage en
			// fonction des données
			string = placeNumberToRank(string,
					(datasCurrent[i] > datasPrevious[i] ? "+" + DfFormat.format(pourcents[i]) + "%"
							: "-" + DfFormat.format(pourcents[i]) + "%"),
					RANKS[i+2]);

		}
		return string;
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
