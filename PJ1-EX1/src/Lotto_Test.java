import java.util.ArrayList;

public class Lotto_Test {

	final static ArrayList<int[]> PLAYEDNUMBERS = new ArrayList<int[]>();
	final static int MIN_GRILLE_PLAYED = 1;
	final static int MAX_GRILLE_PLAYED = 3;
	final static int MIN_LOTTO_NUMBER = 1;
	final static int MAX_LOTTO_NUMBER = 42;
	final static int WINNUMBERS[] = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		
		System.out.println("Test de grilles avec différentes valeurs + limites");
		setPlayedNumbers(1);
		playLotto1numeroGagnant();
		playLotto2numeroGagnant();
		playLotto3numeroGagnant();
		playLotto4numeroGagnant();
		playLotto5numeroGagnant();
		playLotto6numeroGagnant();
	}

	public static void playLotto1numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 22, 23, 40, 20, 21 };

		playLotto(1, Test3numeroGagnant, name);

	}
	
	public static void playLotto2numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 2, 23, 40, 20, 21 };

		playLotto(1, Test3numeroGagnant, name);

	}
	public static void playLotto3numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 2, 3, 40, 20, 21 };

		playLotto(1, Test3numeroGagnant,name);

	}
	public static void playLotto4numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 2, 3, 4, 20, 21 };

		playLotto(1, Test3numeroGagnant,name);

	}
	public static void playLotto5numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 2, 3, 4, 5, 21 };

		playLotto(1, Test3numeroGagnant,name);

	}
	public static void playLotto6numeroGagnant() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		int Test3numeroGagnant[] = { 1, 2, 3, 4, 5, 6 };

		playLotto(1, Test3numeroGagnant, name);

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
		
		for (int i = 0; i< PLAYEDNUMBERS.size(); i++ ) {
			for(int j = 0; j < PLAYEDNUMBERS.get(i).length; j++) {
				System.out.print(PLAYEDNUMBERS.get(i)[j] + " ");
			}
			System.out.println();
		}
		

	}
	
	public static void playLotto(int nbrGrilles, int[] test, String name) {
		
		System.out.println("---------- " + name + " ----------");
		
		for (int i = 0; i < nbrGrilles; i++) {
			int nbrWinNumbers = 0;

			for (int j = 0; j < test.length; j++) {

				if (Utilities.isInTab(test[j], WINNUMBERS)) {
					nbrWinNumbers++;
				}

			}

			if (nbrWinNumbers >= 3) {

				System.out.println("La grille N°" + (i + 1) + " remporte un " + nbrWinNumbers);

			} else {

				System.out.println("La grille N°" + (i + 1) + " ne gagne pas");

			}
			System.out.println();

		}

	}
}
