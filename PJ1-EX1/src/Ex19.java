
public class Ex19 {

	final static String Names[] = { "Spa reine 25 ", "Bru plate 50", "Bru pét 50", "Pepsi", "Spa orange",
			"Schweppes Tonic", "Schweppes Agr", "Ice Tea", "Ice Tea Pêche", "Jus d'orange Looza", "Cécémel", "Red Bull",
			"Petit Expresso", "Grand Expresso", "Café décaféiné ", "Lait Russe ", "Thé et infusions", "Irish Coffee ",
			"French Coffee ", "Cappuccino", "Cécémel chaud", "Passione Italiano", "Amour Intense", "Rhumba Caliente ",
			"Irish Kisses ", "Cuvée Trolls 25", "Cuvee Trolls 50", "Ambrasse-Temps 25", "Ambrasse-Temps 50 ",
			"Brasse-Temps Cerises 25", "Brasse-Temps Cerises 50", "La Blanche Ste Waudru 25", "Blanche Ste Waudru 50",
			"Brasse-Temps citr 25", "Brasse-Temps citr 50", "Spaghetti Bolo ", "Tagl Carbonara", "Penne poulet baslc ",
			"Tagl American", "Tagl saum" };
	final static double NetPrices[] = { 2.2, 2.3, 3.9, 2.2, 2.2, 2.6, 2.6, 2.6, 2.6, 2.6, 2.6, 4.5, 2.2, 2.2, 2.2, 2.5,
			2.5, 7.0, 7.0, 2.8, 2.8, 6.2, 6.2, 6.2, 6.2, 2.9, 5.5, 2.7, 5.1, 3.1, 5.8, 2.6, 4.9, 2.6, 4.9, 10.8, 11.2,
			12.2, 14.5, 16.9 };

	public static void main(String[] args) {

		int Order[][] = { { 3, 2 }, { 1, 3 }, { 12, 4 }, { 37, 1 }, { 36, 3 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } };

		previewOrder(Order);
	}

	static void previewOrder(int Order[][]) {

		int i = 0;

		while (Order[i][0] != 0 && Order[i][1] != 0) {
			System.out.println("Consomation : " + Names[Order[i][0] - 1] + " // Prix net : "
					+ NetPrices[Order[i][0] - 1] + "€ // Quantité : " + Order[i][1] + " // Prix Total : "
					+ Order[i][1] * NetPrices[Order[i][0] - 1] + "€");
			i++;
		}
	}

}
