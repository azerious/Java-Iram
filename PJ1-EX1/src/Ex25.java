import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25 {

	final static String Names[] = { "Spa reine 25 ", "Bru plate 50", "Bru pét 50", "Pepsi", "Spa orange",
			"Schweppes Tonic", "Schweppes Agr", "Ice Tea", "Ice Tea Pêche", "Jus d'orange Looza", "Cécémel", "Red Bull",
			"Petit Expresso", "Grand Expresso", "Café décaféiné ", "Lait Russe ", "Thé et infusions", "Irish Coffee ",
			"French Coffee ", "Cappuccino", "Cécémel chaud", "Passione Italiano", "Amour Intense", "Rhumba Caliente ",
			"Irish Kisses ", "Cuvée Trolls 25", "Cuvee Trolls 50", "Ambrasse-Temps 25", "Ambrasse-Temps 50 ",
			"Brasse-Temps Cerises 25", "Brasse-Temps Cerises 50", "La Blanche Ste Waudru 25", "Blanche Ste Waudru 50",
			"Brasse-Temps citr 25", "Brasse-Temps citr 50", "Spaghetti Bolo ", "Tagl Carbonara", "Penne poulet baslc ",
			"Tagl American", "Tagl saum" };

	final static String V = "V"; // validation char (string) la commande
	final static String Q = "Q"; // quitter saisie commande (sans enregistrer)
	final static String A = "A"; // Annuler la saisie de la consommation en cours
	final static int RANK = 30;

	public static void main(String[] args) {
		String strToPrint = "";

		ArrayList<int[]> order = new ArrayList<int[]>();
		Exo_Correction_24.getOrder(order);

		try {
			File f = new File("D:\\Attitude\\Documents\\COURS\\Iramps\\Java\\Java-Iram\\MonFichierTestExoTicket.txt");
			if (f.exists()) {
				System.out.println("Le fichier existe déjà et va être modifié");
			} else {
				System.out.println("Le fichier n'existe pas encore et va être créé");
				f.createNewFile();
			}

			FileWriter fw = new FileWriter(f, false);

			for (int i = 0; i < order.size(); i++) {

				strToPrint = Utilities.placeNumberToRank(Names[order.get(i)[0]], Integer.toString(order.get(i)[1]),
						RANK);

				fw.write(strToPrint + "\r\n");

			}

			fw.close();

		} catch (Exception e) {
			System.out.println("Erreur survenue :" + e.getMessage());
		} // end catch

	}// end main

}