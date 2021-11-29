
public class Ex23_correction {

	public static void main(String[] args) {
		String str = "";
		str = placeNumberToRank(str, "56", 20);
		str = placeNumberToRank(str, "200", 30);
		str = placeNumberToRank(str, "3984", 35);
		System.out.println(str);
	}

	static String placeNumberToRank(String strOriginalStr, String strNumberToPlace, int rank) {

		String strSpaces = "";
		int spaceCount = 0;

		spaceCount = rank - strOriginalStr.length() - strNumberToPlace.length();

		if (spaceCount > 0) {

			strSpaces = strSpaces + " ".repeat(spaceCount);
			return (strOriginalStr + strSpaces + strNumberToPlace);
		} else {
			return (strOriginalStr.substring(0, (rank - strNumberToPlace.length() - 1)) + " " + strNumberToPlace);

		}
	}

}
