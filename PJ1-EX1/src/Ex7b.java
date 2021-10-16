import java.util.Scanner;

public class Ex7b {

	public static void main(String[] args) {

		double dblNetPrice = 0.0;
		double VATValue = 0.0;

		dblNetPrice = getUserNetPriceInput();
		VATValue = getUserVATInput();

		System.out.println("Pour un prix net de " + dblNetPrice + " € et une TVA de " + VATValue
				+ " %, le coût de la TVA s’élève à " + VATCostCompute(dblNetPrice, VATValue) + " €");
	}

	public static double getUserNetPriceInput() {

		double netPrice = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez le prix net");
		netPrice = sc.nextDouble();

		return netPrice;
	}

	public static double getUserVATInput() {

		double VATValue = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez letaux de la TVA");
		VATValue = sc.nextDouble();

		return VATValue;
	}

	public static double VATCostCompute(double netPrice, double VATValue) {

		return VATValue * netPrice / (100 + VATValue);

	}

}
