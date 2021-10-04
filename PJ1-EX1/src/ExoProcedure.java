import java.text.DecimalFormat;

public class ExoProcedure {

	public static void main(String[] args) {
		
		PrixBrutEtNet(100.0,6.0);
		PrixBrutEtNet(125.5,21.0);

	}
	
	static void PrixBrutEtNet(double prixBrut, double tauxTVA) {
		
		DecimalFormat DfFormat = new DecimalFormat("0.00");
		
		double prixNet = 0.0;
		
		prixNet = prixBrut*(1+tauxTVA/100.0);
		
		System.out.println("Pour un prix brut de " + prixBrut + " €, le prix net est de " + DfFormat.format(prixNet) + " €");
	}

}
