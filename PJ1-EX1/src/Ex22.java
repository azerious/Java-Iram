
public class Ex22 {

	public static void main(String[] args) {

		int Stocks[][] = { { 1, 56, 200, 55 }, { 2, 42, 200, 60 }, { 3, 62, 200, 125 }, { 4, 45, 200, 150 },
				{ 5, 25, 200, 140 }, { 6, 72, 200, 86 }, { 7, 40, 200, 47 }, { 8, 48, 200, 80 }, { 9, 24, 150, 126 },
				{ 10, 36, 200, 164 }, { 11, 15, 100, 85 }, { 12, 25, 80, 23 } };
		String Names[] = { "Spa Reine", "Bru Plate", "Bru légèrement pétillante", "Pepsi", "Spa Orange",
				"Schweppes Tonic", "Schweppes Agrumes", "Lipton Ice Tea", "Lipton Ice Tea Pêche", "Jus d'orange Looza",
				"Cécémel", "Red Bull" };

		for (int i = 0; i < Stocks.length; i++) {
			System.out.print("N°" + Stocks[i][0] + " " + Names[i] + " ");
			
			for (int j = 1; j < Stocks[0].length; j++) {
				System.out.print(Stocks[i][j] + " ");
			}
			System.out.println();
		}

	}

}
