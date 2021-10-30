import java.util.Scanner;

public class IntroductionTernaire {
	public static void main(String[] args) {
		int age = 0;
		double prixBillet = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre âge");
		age = sc.nextInt();
		// version avec structure classique if..else
		if (age < 18) {
			prixBillet = 15.0;
		} else {
			prixBillet = 22.0;
		} // end if
		System.out.println("Prixbillet :" + prixBillet + "€");
		// version avec opérateur ternaire
		prixBillet = age < 18 ? 15.0 : 22.0;
		System.out.println("Prixbillet :" + prixBillet + "€");
		// version encore plus concise avec opérateur ternaire
		System.out.println("Prixbillet :" + (age < 18 ? 15.0 : 22.0) + "€");
	}// end main
}// end class