public class Ex7b_v2 {

	public static void main(String[] args) {

		double dblBrutPrice = 0.0;
		double VATValue = 0.0;

		dblBrutPrice = Utilities.getUserInputDouble("Entrez le prix brut");// PERMET D APPELLER UNE FONCTION DANS LA CLASSE UTILITIES ==> Utilities.leNomDeLaFonction
		VATValue = Utilities.getUserInputDouble("Entrez la TVA");

		System.out.println("Pour un prix brut de " + dblBrutPrice + " € et une TVA de " + VATValue
				+ " %, le prix net s’élève à " + VATCostCompute(dblBrutPrice, VATValue) + " €");
	}

	public static double VATCostCompute(double brutPrice, double VATValue) {

		return brutPrice * (1 + VATValue / 100.0);

	}

}
