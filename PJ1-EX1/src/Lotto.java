import java.util.ArrayList;

public class Lotto {

	final static int WINNUMBERS[] = { 1, 2, 3, 4, 5, 6 };
	final static ArrayList<int[]> PLAYEDNUMBERS = new ArrayList<int[]>();
	final static int MIN_GRILLE_PLAYED = 1;
	final static int MAX_GRILLE_PLAYED = 3;
	final static int MIN_LOTTO_NUMBER = 1;
	final static int MAX_LOTTO_NUMBER = 42;

	public static void main(String[] args) {

		int nbrGrilles = 1;

		nbrGrilles = Utilities.getUserIntegerInput(
				"Combien de grilles voulez-vous jouer? " + MIN_GRILLE_PLAYED + " à " + MAX_GRILLE_PLAYED + " grilles",
				MIN_GRILLE_PLAYED, MAX_GRILLE_PLAYED); // Défini combien de grilles le joueur souhaite

		setPlayedNumbers(nbrGrilles); // Permet au joueur de choisir ses nombres pour la/les grilles
		playLotto(nbrGrilles); // Joue au lotto avec les grilles définie par le joueur (affiche le résultat)

	}

	public static void setPlayedNumbers(int nbrGrilles) {

		int tempNumber = 0;
		boolean isInTab = false;

		for (int i = 0; i < nbrGrilles; i++) { // J'utilise une boucle "for" car l'on travail sur un tableau (longueur connue)
			
			int tempPlayedNumbers[] = new int[6]; // Déclaration d'un nouveau tableau rempli de 0 pour pouvoir déjà avoir une valeur a comparer dans PLAYED_NUMBERS
			PLAYEDNUMBERS.add(tempPlayedNumbers);

			System.out.println("------------- Grille N°" + (i + 1) + " -------------");

			for (int j = 0; j < WINNUMBERS.length; j++) {

				do { // J'utilise une boucle "faire : tant que" car on doit AU MOINS une fois faire la demande de numéro choisi MAIS il est possible de devoir répéter la question en cas de numéros identiques

					tempNumber = Utilities.getUserIntegerInput("Entrez le nombre n° " + (j + 1), MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER);

					isInTab = Utilities.isInTab(tempNumber, PLAYEDNUMBERS.get(i)); // Vérifie si le cuméro entré par le joueur est déjà présent dans la grille

					if (isInTab) {
						System.out.println("Ce nombre se trouve déjà dans la grille");
					}

				} while (isInTab);

				tempPlayedNumbers[j] = tempNumber;

			}

			PLAYEDNUMBERS.set(i, tempPlayedNumbers); // Modification du tableau créé au préalable par les vrai valeur rentrées par le joueur
		}

	}

	public static void playLotto(int nbrGrilles) {

		System.out.println("---------- Résultat du Lotto ----------");
		for (int i = 0; i < nbrGrilles; i++) {
			int nbrWinNumbers = 0;

			for (int j = 0; j < PLAYEDNUMBERS.get(i).length; j++) { // Vérifie le nombres de numéro gagnant dans les grilles du joueurs

				if (Utilities.isInTab(PLAYEDNUMBERS.get(i)[j], WINNUMBERS)) {
					nbrWinNumbers++;
				}

			}

			if (nbrWinNumbers >= 3) {

				System.out.println("La grille N°" + (i + 1) + " remporte un " + nbrWinNumbers);

			} else {

				System.out.println("La grille N°" + (i + 1) + " ne gagne pas");

			}

		}

	}

}
