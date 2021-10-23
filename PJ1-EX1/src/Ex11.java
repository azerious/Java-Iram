import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		String conso1 = "Eau plate";
		String conso2 = "Coca Cola";
		String conso3 = "Bière Pression";
		String conso4 = "Café long";
		String addition = "";

		double conso1Price = 3.00;
		double conso2Price = 3.00;
		double conso3Price = 2.80;
		double conso4Price = 2.90;

		int conso = 0;
		boolean happyHour = false;

		conso = getUser_input();

		if (conso != -1) {
			happyHour = checkAnswer();
			switch (conso) {
			case 1:
				if (happyHour) {
					addition = "Prix de la consommation : " + conso1 + " : " + conso1Price / 2 + "€";
				} else {
					addition = "Prix de la consommation : " + conso1 + " : " + conso1Price + "€";
				}
				break;

			case 2:
				if (happyHour) {
					addition = "Prix de la consommation : " + conso2 + " : " + conso2Price / 2 + "€";
				} else {
					addition = "Prix de la consommation : " + conso2 + " : " + conso2Price + "€";
				}
				break;

			case 3:
				if (happyHour) {
					addition = "Prix de la consommation : " + conso3 + " : " + conso3Price / 2 + "€";
				} else {
					addition = "Prix de la consommation : " + conso3 + " : " + conso3Price + "€";
				}

			case 4:
				if (happyHour) {
					addition = "Prix de la consommation : " + conso4 + " : " + conso4Price / 2 + "€";
				} else {
					addition = "Prix de la consommation : " + conso4 + " : " + conso4Price + "€";
				}
				break;
			}
		}

		System.out.println(addition);

	}

	public static int getUser_input() {

		int userChoice = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le numéro de la consomation (entre 1 et 4)");
		userChoice = sc.nextInt();

		switch (userChoice) {
		case 1:
			return 1;

		case 2:
			return 2;

		case 3:
			return 3;

		case 4:
			return 4;

		default:
			System.out.println("N° non référencé");
			return -1;

		}

	}

	public static boolean checkAnswer() {

		String happyHour = "N";

		Scanner sc = new Scanner(System.in);
		System.out.println("Happy Hour ? Y/N");
		happyHour = sc.nextLine().toUpperCase();

		switch (happyHour) {
		case "Y":
			return true;

		case "N":
			return false;

		default:
			System.out.println("Réponse incorrecte, par défaut le tarif non Happy hour est appliqué");
			return false;

		}

	}

}
