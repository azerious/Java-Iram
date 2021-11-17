import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		DecimalFormat roundNumber = new DecimalFormat("0.00");

		final double VAT_POURCENT_1 = 6.0;
		final double VAT_POURCENT_2 = 12.0;
		final double VAT_POURCENT_3 = 21.0;

		double dblBrutPrice = 0.0;
		double VAT = 21.0;

		VAT = getVATChoice(VAT_POURCENT_1, VAT_POURCENT_2, VAT_POURCENT_3);

		if (VAT != -1.0) {
			dblBrutPrice = Utilities.getUserInputDouble("Veuillez entrer votre montant brut");
			System.out.println("Pour un prix brut de " + dblBrutPrice + "€, le prix net est de "
					+ roundNumber.format(Utilities.ComputeNetPrice(dblBrutPrice, VAT)) + "€ (TVA " + VAT + "%)");
		}

	}

	public static double getVATChoice(double VAT_POURCENT_1, double VAT_POURCENT_2, double VAT_POURCENT_3) {

		int userChoice = 3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Pour un taux de TVA de " + VAT_POURCENT_1 + "% tapez 1, 2 pour " + VAT_POURCENT_2
				+ "% et 3 pour " + VAT_POURCENT_3 + "%");
		userChoice = sc.nextInt();

		if (userChoice == 1) {
			return VAT_POURCENT_1;
		} else if (userChoice == 2) {
			return VAT_POURCENT_2;
		} else if (userChoice == 3) {
			return VAT_POURCENT_3;
		} else {
			System.out.println("Saisie du taux incorrecte");
			return -1.0;
		}

	}
}
