import java.util.Scanner;

public class Ex6b {

	public static void main(String[] args) {

		double dblNetPrice = 0.0;
		double TVAValue = 0.0;

		TVAValue = 21.0;

		dblNetPrice = getUserNetPriceInput();

		System.out.println("Pour un prix net de " + dblNetPrice + " € et une TVA de " + TVAValue
				+ " %, le coût de la TVA s’élève à " + VATCostCompute(dblNetPrice, TVAValue) + " €");
	}

	public static double getUserNetPriceInput() {

		double netPrice = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez le prix net");
		netPrice = sc.nextDouble();

		return netPrice;
	}

	public static double VATCostCompute(double netPrice, double TVAValue) {

		return TVAValue * netPrice / (100 + TVAValue);

	}

}
