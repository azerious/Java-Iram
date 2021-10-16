
public class Ex5c {

	public static void main(String[] args) {
		double prixNet = 0.0;
		double tauxTVA = 0.0;

		prixNet = 121.0;
		tauxTVA = 21.0;

		System.out.println("Pour un prix net de " + prixNet + " € et une TVA de " + tauxTVA
				+ " %, le coût de la TVA s’élève à " + CalculMontantTVA(prixNet, tauxTVA) + " €");

		prixNet = 85.5;
		tauxTVA = 12.5;

		System.out.println("Pour un prix net de " + prixNet + " € et une TVA de " + tauxTVA
				+ " %, le coût de la TVA s’élève à " + CalculMontantTVA(prixNet, tauxTVA) + " €");

	}

	static double CalculMontantTVA(double prixNet, double tauxTVA) {
		double montantTVA = 0.0;

		montantTVA = prixNet * tauxTVA / (100+tauxTVA);

		return montantTVA;
	}

}
