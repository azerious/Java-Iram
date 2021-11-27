
public class Ex23_correction {

	public static void main(String[] args) {
		placeNumberToRank("Hello", "56", 20);

	}

	static void placeNumberToRank(String strOriginalStr, String strNumberToPlace, int rank) {

		String strSpaces = "";
		int spaceCount = 0;

		spaceCount = rank - strOriginalStr.length() - strNumberToPlace.length();

		if (spaceCount > 0) {
			for (int i = 1; i < spaceCount; i++) { // strSpaces= Repeter(" ", spaceCount)
				strSpaces = strSpaces + " ";
			}
			System.out.println(strOriginalStr + strSpaces + strNumberToPlace);
		} else {
			System.out.println(
					strOriginalStr.substring(0, (rank - strNumberToPlace.length() - 1)) + " " + strNumberToPlace);

		}
	}

}
