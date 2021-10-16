import java.util.Scanner;

public class Utilities {

	public static double getUser_doubleInput(String question) {// public rend la fonctuon utilisable dans d'autre class
		double value = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		value = sc.nextDouble();

		return value;
	}

}
