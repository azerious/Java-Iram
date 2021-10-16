import java.util.Scanner;

public class Test_Scanner { // Scanner est la fonction qui permet de prendre les saisies des utilisateurs
	public static void main(String[] args) {
		int intSaisieUtilisateur;
		byte bytSaiseUtilisateur;
		double dblSaisieUtilisateur;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un nombre entier");
		intSaisieUtilisateur = sc.nextInt();
		System.out.println("Le nombre entier saisi est " + intSaisieUtilisateur);

		System.out.println("Entrez un byte");
		bytSaiseUtilisateur = sc.nextByte();
		System.out.println("Le byte saisi est " + bytSaiseUtilisateur);

		System.out.println("Entrez un nombre réel");
		dblSaisieUtilisateur = sc.nextDouble();
		System.out.print("Le réel saisi est " + dblSaisieUtilisateur);
	}
}