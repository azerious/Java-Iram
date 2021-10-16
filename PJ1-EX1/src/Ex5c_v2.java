
public class Ex5c_v2 {

	public static void AfficherCoutTVA(double net, double TVA) {
		
		System.out.println("Pour un prix net de " + net + "€ et "
				+ "une tva de " + TVA + "%, le cout de la TVA s’élève "
				+ "à " + CalculerCoutTVA(net, TVA)  + "€");
	}
	
	public static double CalculerCoutTVA (double  net,  double   TVA) {

		return TVA*net / (100 + TVA);
	}//End function calculerCoutTVA
	
	public static void main(String[] args) {

		double dblPrixNet = 0.0;
		double  dblTVA = 0.0;
		
		dblPrixNet = 100.0;
		dblTVA= 21.0;		
		AfficherCoutTVA(dblPrixNet, dblTVA);

		dblPrixNet = 85.5;
		dblTVA= 12.5;
		AfficherCoutTVA(dblPrixNet, dblTVA);   

	}//end main

}
