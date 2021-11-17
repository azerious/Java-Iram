public class Exo_airCircle {

	public static void main(String[] args) {
		
		double dblRayon = 0.0;
		
		dblRayon = Utilities.getUserInputDouble("Entrez le rayon du cercle en m");

		System.out.println("L'air du cercle de rayon " + dblRayon + " est de " + CalculerAirCercle(dblRayon) + "m²");
	}

	public static double CalculerAirCercle(double dblRayon) {

		return Math.PI * Math.pow(dblRayon, 2);

	}

}