import java.util.Scanner;

public class Exo_airCircle {

		public static void main(String[] args) {

			double dblRayon = 0.0;

			dblRayon = getUserRayon();

			System.out.println("L'air du cercle de rayon " + dblRayon +  " est de " + CalculerAirCercle(dblRayon) + "m²");
		}
		
		public static double getUserRayon() {
			double rayon = 0.0;

			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le rayon du cercle en m");
			rayon = sc.nextDouble();

			return rayon;
		}

		public static double CalculerAirCercle(double dblRayon) {

			return Math.PI*Math.pow(dblRayon,2);

		}

	}
