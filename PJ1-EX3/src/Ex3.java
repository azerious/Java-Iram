
public class Ex3 {

	public static void main(String[] args) {
		int intQuantityConso = 0; // Quantite de conso commandées
		double dblPriceUnity = 0.0;// Prix Unitaire de la conso
		double dblTotalPricePerConso = 0.0;// Prix total par conso
		
		intQuantityConso = 3;
		dblPriceUnity = 2;
		dblTotalPricePerConso = intQuantityConso*dblPriceUnity;
		
		System.out.print("Prix total pour cette consomation est de : " + dblTotalPricePerConso + " €");
		

	}

}
