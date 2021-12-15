
public class Ex23_correction {

	static int FIRST_RANK = 35;
	static int SEC_RANK = 40;
	static int THIRD_RANK = 45;
	static int Stocks[][] = { { 1, 5600, 200, 55 }, { 2, 42, 200, 60 }, { 3, 62, 200, 125 }, { 4, 45, 200, 150 },
			{ 5, 25, 200, 140 }, { 6, 72, 200, 86 }, { 7, 40, 200, 47 }, { 8, 48, 200, 80 }, { 9, 24, 150, 126 },
			{ 10, 36, 200, 164 }, { 11, 15, 100, 85 }, { 12, 25, 80, 23 } };

	static String Names[] = { "Spa Reine xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "Bru Plate",
			"Bru légèrement pétillante", "Pepsi", "Spa Orange", "Schweppes Tonic", "Schweppes Agrumes",
			"Lipton Ice Tea", "Lipton Ice Tea Pêche", "Jus d'orange Looza", "Cécémel", "Red Bull" };

	public static void main(String[] args) {

		String strToPrint = "";

		// for each consumption
		for (int i = 0; i < Names.length; i++) {

			strToPrint = Names[i];

			// for each stock datas
			strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][1]), FIRST_RANK);
			strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][2]), SEC_RANK);
			strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][3]), THIRD_RANK);

			System.out.println(strToPrint);
		} // end for

	}// fin main

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

}// fin class
