
import java.util.ArrayList;

public class Exo_Correction_24 {
	final static String Names[] = { "Spa reine 25 ", "Bru plate 50", "Bru p�t 50", "Pepsi", "Spa orange",
			"Schweppes Tonic", "Schweppes Agr", "Ice Tea", "Ice Tea P�che", "Jus d'orange Looza", "C�c�mel", "Red Bull",
			"Petit Expresso", "Grand Expresso", "Caf� d�caf�in� ", "Lait Russe ", "Th� et infusions", "Irish Coffee ",
			"French Coffee ", "Cappuccino", "C�c�mel chaud", "Passione Italiano", "Amour Intense", "Rhumba Caliente ",
			"Irish Kisses ", "Cuv�e Trolls 25", "Cuvee Trolls 50", "Ambrasse-Temps 25", "Ambrasse-Temps 50 ",
			"Brasse-Temps Cerises 25", "Brasse-Temps Cerises 50", "La Blanche Ste Waudru 25", "Blanche Ste Waudru 50",
			"Brasse-Temps citr 25", "Brasse-Temps citr 50", "Spaghetti Bolo ", "Tagl Carbonara", "Penne poulet baslc ",
			"Tagl American", "Tagl saum" };

	final static double NetPrices[] = { 2.2, 2.3, 3.9, 2.2, 2.2, 2.6, 2.6, 2.6, 2.6, 2.6, 2.6, 4.5, 2.2, 2.2, 2.2, 2.5,
			2.5, 7.0, 7.0, 2.8, 2.8, 6.2, 6.2, 6.2, 6.2, 2.9, 5.5, 2.7, 5.1, 3.1, 5.8, 2.6, 4.9, 2.6, 4.9, 10.8, 11.2,
			12.2, 14.5, 16.9 };
	final static String V = "V"; // validation char (string) la commande
	final static String Q = "Q"; // quitter saisie commande (sans enregistrer)
	final static String A = "A"; // Annuler la saisie de la consommation en cours

	public static void main(String[] args) {

		ArrayList<int[]> order = new ArrayList<int[]>();
		getOrder(order);

		System.out.println("Nombre de consommations : " + order.size());

		System.out.println("ArrayList Commande : ");
		for (int i = 0; i < order.size(); i++) {

			System.out.println(Names[order.get(i)[0]] + " " + order.get(i)[1] + " " +  NetPrices[order.get(i)[0]] + " " + (order.get(i)[1]*NetPrices[order.get(i)[0]]) );

		}

	}// end main

	/**
	 * saisie de la commande par le serveur
	 * 
	 * @param a ArrayList qui contiendra toute la commande (index des consommations
	 *          et nombre d'unit�s command�es)
	 * @return nombre total de consommations
	 */
	public static void getOrder(ArrayList<int[]> ord) {
		String answ = "";
		int idCons = 0, numbCons = 0;

		try {
			
			do {
				/*
				 * le serveur ne peut valider la premi�re fois (il n'y a pas encore de
				 * consommations) l'invitation ne propose pas la validation si l'array list ne
				 * contient encore rien
				 */
				answ = (ord.size() == 0)
						? Utilities.getUserIntOrSpecificInput("Entrez le N� de la consommation " + "/" + Q + " Quitter",
								Q, 1, Names.length)
						: Utilities.getUserIntOrSpecificInput(
								"Entrez le N� de la consommation " + "/" + Q + " Quitter /" + V + " Valider", Q + V, 1,
								Names.length);

				if (answ.equals(Q)) {
					System.exit(1);

				} else if (!answ.equals(V)) {

					idCons = Integer.parseInt(answ) - 1;
					answ = Utilities.getUserIntOrSpecificInput("Entrez le nombres de " + "consommations pour "
							+ Names[idCons] + " " + A + "/ " + "Annuler /" + Q + " Quitter", Q + A, 1, 1000);
					if (answ.equals(Q)) {
						System.exit(1);
					} else if (!answ.equals(A)) {

						numbCons = Integer.parseInt(answ);

						addToOrMergeOrder(ord, idCons, numbCons);
					}
				} // end if
			} while (!answ.equals(V));
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
	}// end getOrder

	/**
	 * v�rifie que le nouvel identifiant de consommation ne se trouve pas d�j� dans
	 * la liste, si oui on ajoute � le nombre d'unit�s aux unit�s existantes (Merge)
	 * pour cette consommation si pas on ajoute cette consommation � l'ArrayList ord
	 * (addTo)
	 * 
	 * @param ord      ArrayList qui contient la commande en cours d'encodage
	 * @param idCons   identifiant de la consommation � ajouter dans l'ArrayList ou
	 *                 � trouver s'il existe d�j�
	 * @param numbCons nombre d'unit�s consomm�es correspondant � l'identificateur
	 *                 de consommation.
	 */
	private static void addToOrMergeOrder(ArrayList<int[]> ord, int idCons, int numbCons) {

		int indexAlreadyInOrder = isAlreadyInOrder(ord, idCons);

		if (indexAlreadyInOrder == -1) { // identifiant de consommation pas d�j� dans la liste, on l'ajoute � la
											// commande en cours.

			int orderLine[] = { idCons, numbCons };// cr�ation d'un nouveau tableau (une ligne ->1 consommation)
													// � ajouter dans l'ArrayList
			ord.add(orderLine);

		} else {

			ord.get(indexAlreadyInOrder)[1] = ord.get(indexAlreadyInOrder)[1] + numbCons;
		} // endif
	}// end addToOrMergeOrder

	/**
	 * d�termine si un identifiant de consommation se trouve d�j� dans la commande
	 * en cours
	 * 
	 * @param ord    ArrayList qui contient la commande en cours d'encodage
	 * @param idCons identifiant de la consommation � trouver �ventuellement dans la
	 *               commande en cours
	 * @return -1 si pas trouv�, index position dans le tableau si trouv�
	 */
	public static int isAlreadyInOrder(ArrayList<int[]> ord, int idCons) {
		for (int i = 0; i < ord.size(); i++) {

			if (ord.get(i)[0] == idCons) {
				return i;
			}
		}

		return -1;
	}
}// end class
