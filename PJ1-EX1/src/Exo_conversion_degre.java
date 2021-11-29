import java.text.DecimalFormat;

public class Exo_conversion_degre {

	final static DecimalFormat Dformat = new DecimalFormat("0.0");

	public static void main(String[] args) {

		double value = 0.0;

		value = Utilities.getUserInputDouble("Entrez la température à convertir");

		System.out.println(Utilities.getUserSpecificInput("Votre saisie est en Celsius ou Farenheit C/F ?", "CF") == "C"
				? ("la conversion Farenheit de " + value + " degrés Celsius est "
						+ Dformat.format(5.0 / 9.0 * (value - 32.0)))
				: ("la conversion Celsius de " + value + " degrés Farenheit est "
						+ Dformat.format(9.0 / 5.0 * value + 32.0)));

	}

}
