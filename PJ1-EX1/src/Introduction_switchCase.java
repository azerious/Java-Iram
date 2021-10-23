import java.util.Scanner;

public class Introduction_switchCase {
	public static void main(String[] args) {
		final double dblPCT_TVA1 = 6.0, dblPCT_TVA2 = 12.0, dblPCT_TVA3 = 21.0;
		double dblPctTVA = 0.0, dblPrixNet, dblPrixBrut;
		int intChoixTVA;
		boolean bFlagSaisieOK = false;
		Scanner SaisieUtilisateur = new Scanner(System.in);
		System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21%\".");
		intChoixTVA = SaisieUtilisateur.nextInt();
		switch (intChoixTVA) {
		case 1:
			dblPctTVA = dblPCT_TVA1;
			bFlagSaisieOK = true;
			break;
		case 2:
			dblPctTVA = dblPCT_TVA2;
			bFlagSaisieOK = true;
			break;
		case 3:
			dblPctTVA = dblPCT_TVA3;
			bFlagSaisieOK = true;
			break;
		default:
			System.out.println("Saisie du taux incorrecte");
		}
		if (bFlagSaisieOK) {
			System.out.println("Entrez le prix brut");
			dblPrixBrut = SaisieUtilisateur.nextDouble();
			dblPrixNet = dblPrixBrut + dblPrixBrut * (dblPctTVA / 100);
			System.out.println("Pour un prix brut de " + dblPrixBrut + "€ le prix net est de " + dblPrixNet + "€ (TVA "
					+ dblPctTVA + "%)");
		} // fin si
		SaisieUtilisateur.close();
	}// fin main
}
