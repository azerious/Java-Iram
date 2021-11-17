
public class Ex14 {

	static int Stock[][] = { { 19, 92 }, { 6, 16 }, { 14, 27 }, { 4, 72 } };
	static String Names[] = { "Eau Plate", "Coca Cola", "Bi�re pression", "Caf� long" };

	public static void main(String[] args) {

		int choixConso = -1;
		int nombreConso = 0;
		boolean validation = false;

		showStock();

		choixConso = Utilities.getUserInputInteger("Entrez le N� de consommation",1, Names.length);

		if (choixConso != -1) {

			nombreConso = Utilities.getUserInputInteger("Entrez le nombre d'unit� consomm�es pour "
					+ Names[choixConso - 1] + ". \nQuantit� actuellement en stock : " + Stock[choixConso - 1][1]
					+ ", emplacement : " + Stock[choixConso - 1][0]);
			if (nombreConso >= 0 && nombreConso <= Stock[choixConso - 1][1]) {
				Stock[choixConso - 1][1] -= nombreConso;
			} else {
				validation = Utilities.checkAnswer("Erreur de saisie ou de quantit� en stock pour "
						+ Names[choixConso - 1] + "! Annuler ou Mettre � Zero le stock. A/Z", "Z");
				if (validation) {
					Stock[choixConso - 1][1] = 0;
					System.out.println("Stock 0 pour : " + Names[choixConso - 1]);
				} else {
					System.out.println("Modification annul�e");
				}
			}
		}

		else {
			System.out.println("N� non r�f�renc�.");
		}

		showStock();
	}

	public static void showStock() {
		System.out.println(Names[0] + " N�1 - emplacement : " + Stock[0][0] + " quantit� en stock : " + Stock[0][1]);
		System.out.println(Names[1] + " N�2 - emplacement : " + Stock[1][0] + " quantit� en stock : " + Stock[1][1]);
		System.out.println(Names[2] + " N�3 - emplacement : " + Stock[2][0] + " quantit� en stock : " + Stock[2][1]);
		System.out.println(Names[3] + " N�4 - emplacement : " + Stock[3][0] + " quantit� en stock : " + Stock[3][1]);
	}

}
