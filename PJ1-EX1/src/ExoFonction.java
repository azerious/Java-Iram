
public class ExoFonction {

	public static void main(String[] args) {

		double prixBrut = 0.0;
		double tauxTVA = 0.0;

		prixBrut = 100.0;
		tauxTVA = 6.0;

		System.out.println("Pour un prix brut de " + prixBrut + " €, le prix net est de "
				+ CalculerPrixNet(prixBrut, tauxTVA) + " €");

		prixBrut = 125.5;
		tauxTVA = 21.0;

		System.out.println("Pour un prix brut de " + prixBrut + " €, le prix net est de "
				+ CalculerPrixNet(prixBrut, tauxTVA) + " €");

	}// fin main

	static double CalculerPrixNet(double prixBrut, double tauxTVA) {

		double prixNet = 0.0;

		prixNet = prixBrut * (1 + tauxTVA / 100.0);

		return prixNet;

	}// fin CalculerPrixNet

}
