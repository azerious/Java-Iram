import java.text.DecimalFormat;

public class Ex13 {

	public static void main(String[] args) {
		DecimalFormat DfFormat = new DecimalFormat("0.00");

		final String Names[] = { "Eau Plate", "Coca Cola", "Bière pression", "Café long" };
		final double Prices[] = { 3.00, 3.00, 2.80, 2.90 };
		final double PCT_REMISE_HAPPY_HOUR = 50.0;
		final int NUM_MIN = 1, NUM_MAX = 4;

		int choixConso = -1;
		double discount = 0.0;

		choixConso = Utilities.getUserInput_WithMinMax("Entrez le N° de consommation", NUM_MIN, NUM_MAX);

		 if (choixConso != -1) {

			if (Utilities.checkAnswer("Happy Hour? Y/N", "Y")) {
				discount = PCT_REMISE_HAPPY_HOUR / 100;
			} else {
				discount = 1;
			}

			System.out.println("Prix de la consommation " + Names[choixConso - 1] + " : "
					+ DfFormat.format(Prices[choixConso - 1] * discount) + " €");
		} else {
			System.out.println("N° non référencé.");
		}
		
		
		System.out.println(Names[0]+ " " + Names[1]);
	}
}