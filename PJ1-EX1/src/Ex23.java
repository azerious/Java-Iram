
public class Ex23 {
	static int STOCKS[][] = { { 1, 56, 200, 55 }, { 2, 42, 200, 60 }, { 3, 62, 200, 125 }, { 4, 45, 200, 150 },
			{ 5, 25, 200, 140 }, { 6, 72, 200, 86 }, { 7, 40, 200, 47 }, { 8, 48, 200, 80 }, { 9, 24, 150, 126 },
			{ 10, 36, 200, 164 }, { 11, 15, 100, 85 }, { 12, 25, 80, 23 } };
	static String NAMES[] = { "Spa Reine", "Bru Plate", "Bru légèrement pétillante", "Pepsi", "Spa Orange",
			"Schweppes Tonic", "Schweppes Agrumes", "Lipton Ice Tea", "Lipton Ice Tea Pêche", "Jus d'orange Looza",
			"Cécémel", "Red Bull" };

	public static void main(String[] args) {

		placeNumberRank(35, 40, 45);

	}

	static void placeNumberRank(int firstPlace, int secondPlace, int thirdPlace) {
		for (int i = 0; i < NAMES.length; i++) {
			String allSTOCKS = NAMES[i];
			String quantityStock = Integer.toString(STOCKS[i][1]);
			String quantityToHave = Integer.toString(STOCKS[i][2]);
			String quantitySold = Integer.toString(STOCKS[i][3]);
			for (int index = allSTOCKS.length(); index < (firstPlace - quantityStock.length()); index++) {

				allSTOCKS += " ";

			}

			allSTOCKS += quantityStock;

			for (int index = allSTOCKS.length(); index < (secondPlace - quantityToHave.length()); index++) {

				allSTOCKS += " ";

			}

			allSTOCKS += quantityToHave;

			for (int index = allSTOCKS.length(); index < (thirdPlace - quantitySold.length()); index++) {

				allSTOCKS += " ";

			}

			allSTOCKS += quantitySold;
			System.out.print(allSTOCKS);
			System.out.println();

		}
	}
}
