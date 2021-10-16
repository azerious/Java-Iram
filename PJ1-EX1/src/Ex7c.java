import java.util.Scanner;

public class Ex7c {

	public static void main(String[] args) {

		double dblBrutPrice = 0.0;
		double VATValue = 0.0;

		dblBrutPrice = getUser_doubleInput("Entrez le prix brut");
		VATValue = getUser_doubleInput("Entrez la TVA");

		System.out.println("Pour un prix brut de " + dblBrutPrice + " € et une TVA de " + VATValue
				+ " %, le prix net s’élève à " + VATCostCompute(dblBrutPrice, VATValue) + " €");
	}

	public static double getUser_doubleInput(String question) {
		double value = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextDouble();

		return value;
	}

	public static double VATCostCompute(double brutPrice, double VATValue) {

		return brutPrice*(1+VATValue/100.0);

	}

}
