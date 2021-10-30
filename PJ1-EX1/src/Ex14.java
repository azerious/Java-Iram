
public class Ex14 {

	static int Stock[][] = { { 19, 92 }, { 6, 16 }, { 14, 27 }, { 4, 72 } };
	static String Names[] = { "Eau Plate", "Coca Cola", "Bière pression", "Café long" };

	public static void main(String[] args) {

		final int NUM_MIN = 1, NUM_MAX = 4;
		int choixConso = -1;
		int nombreConso = 0;
		boolean validation = false;

		System.out.println(Names[0] + " N°1 - emplacement : " + Stock[0][0] + " quantité en stock : " + Stock[0][1]);
		System.out.println(Names[1] + " N°2 - emplacement : " + Stock[1][0] + " quantité en stock : " + Stock[1][1]);
		System.out.println(Names[2] + " N°3 - emplacement : " + Stock[2][0] + " quantité en stock : " + Stock[2][1]);
		System.out.println(Names[3] + " N°4 - emplacement : " + Stock[3][0] + " quantité en stock : " + Stock[3][1]);

		choixConso = Utilities.getUserInput_WithMinMax("Entrez le N° de consommation", NUM_MIN, NUM_MAX);

		if (choixConso != -1) {

			nombreConso = Utilities.getUserMultipleInputInteger("Entrez le nombre d'unité consommées pour "
					+ Names[choixConso - 1] + ". Quantité actuellement en stock : " + Stock[choixConso - 1][1]
					+ ", emplacement : " + Stock[choixConso - 1][0]);
			if (nombreConso >= 0 && nombreConso <= Stock[choixConso - 1][1]) {
				Stock[choixConso - 1][1] -= nombreConso;
			} else {
				validation = Utilities.checkAnswer("Erreur de saisie ou de quantité en stock pour "
						+ Names[choixConso - 1] + "! Annuler ou Mettre à Zero le stock. A/Z", "Z");
				if (validation) {
					Stock[choixConso - 1][1] = 0;
				} else {
					System.out.println("Modification annulée");
				}
			}
		}

		else {
			System.out.println("N° non référencé.");
		}

		System.out.println(Names[0] + " N°1 - emplacement : " + Stock[0][0] + " quantité en stock : " + Stock[0][1]);
		System.out.println(Names[1] + " N°2 - emplacement : " + Stock[1][0] + " quantité en stock : " + Stock[1][1]);
		System.out.println(Names[2] + " N°3 - emplacement : " + Stock[2][0] + " quantité en stock : " + Stock[2][1]);
		System.out.println(Names[3] + " N°4 - emplacement : " + Stock[3][0] + " quantité en stock : " + Stock[3][1]);
	}

}
