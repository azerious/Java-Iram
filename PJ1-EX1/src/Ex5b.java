
public class Ex5b {

	public static void main(String[] args) {
		AfficherMontantTVA(121.0, 21.0);
		AfficherMontantTVA(85.5, 12.5);
	}

	static void AfficherMontantTVA(double prixNet, double tauxTVA) {
		double montantTVA = 0.0;

		montantTVA = prixNet * tauxTVA / (100+tauxTVA);
		//montantTVA = prixNet - prixNet / (1 + tauxTVA / 100);

		System.out.println("Pour un prix net de " + prixNet + " € et une TVA de " + tauxTVA
				+ " %, le coût de la TVA s'élève à " + montantTVA + " €");
	}

}
