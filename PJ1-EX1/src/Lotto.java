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
				"Combien de grilles voulez-vous jouer? " + MIN_GRILLE_PLAYED + " � " + MAX_GRILLE_PLAYED + " grilles",
				MIN_GRILLE_PLAYED, MAX_GRILLE_PLAYED); // D�fini combien de grilles le joueur souhaite

		setPlayedNumbers(nbrGrilles); // Permet au joueur de choisir ses nombres pour la/les grilles
		playLotto(nbrGrilles); // Joue au lotto avec les grilles d�finie par le joueur (affiche le r�sultat)

	}

	public static void setPlayedNumbers(int nbrGrilles) {

		int tempNumber = 0;
		boolean isInTab = false;

		for (int i = 0; i < nbrGrilles; i++) { // J'utilise une boucle "for" car l'on travail sur un tableau (longueur connue)
			
			int tempPlayedNumbers[] = new int[6]; // D�claration d'un nouveau tableau rempli de 0 pour pouvoir d�j� avoir une valeur a comparer dans PLAYED_NUMBERS
			PLAYEDNUMBERS.add(tempPlayedNumbers);

			System.out.println("------------- Grille N�" + (i + 1) + " -------------");

			for (int j = 0; j < WINNUMBERS.length; j++) {

				do { // J'utilise une boucle "faire : tant que" car on doit AU MOINS une fois faire la demande de num�ro choisi MAIS il est possible de devoir r�p�ter la question en cas de num�ros identiques

					tempNumber = Utilities.getUserIntegerInput("Entrez le nombre n� " + (j + 1), MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER);

					isInTab = Utilities.isInTab(tempNumber, PLAYEDNUMBERS.get(i)); // V�rifie si le cum�ro entr� par le joueur est d�j� pr�sent dans la grille

					if (isInTab) {
						System.out.println("Ce nombre se trouve d�j� dans la grille");
					}

				} while (isInTab);

				tempPlayedNumbers[j] = tempNumber;

			}

			PLAYEDNUMBERS.set(i, tempPlayedNumbers); // Modification du tableau cr�� au pr�alable par les vrai valeur rentr�es par le joueur
		}

	}

	public static void playLotto(int nbrGrilles) {

		System.out.println("---------- R�sultat du Lotto ----------");
		for (int i = 0; i < nbrGrilles; i++) {
			int nbrWinNumbers = 0;

			for (int j = 0; j < PLAYEDNUMBERS.get(i).length; j++) { // V�rifie le nombres de num�ro gagnant dans les grilles du joueurs

				if (Utilities.isInTab(PLAYEDNUMBERS.get(i)[j], WINNUMBERS)) {
					nbrWinNumbers++;
				}

			}

			if (nbrWinNumbers >= 3) {

				System.out.println("La grille N�" + (i + 1) + " remporte un " + nbrWinNumbers);

			} else {

				System.out.println("La grille N�" + (i + 1) + " ne gagne pas");

			}

		}

	}

}
