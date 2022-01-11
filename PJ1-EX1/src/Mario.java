import java.util.ArrayList;

public class Mario {
	final static int[][] GAME_BOARD = new int[7][7];
	final static int NBR_BOMBS = 9;
	final static ArrayList<int[]> BOMB_POS = new ArrayList<int[]>();

	public static void main(String[] args) {

		int x_player = GAME_BOARD[0].length / 2;
		int y_player = GAME_BOARD.length / 2;

		setBombsPositions(x_player, y_player); // Défini les positions des bombes
		showBombsPositions(x_player, y_player); // Affiche les positions des bombes
		letsPlay(x_player, y_player); // Démare le jeu

	}


	public static void setBombsPositions(int x_player, int y_player) {

		int tempBombX = 0;
		int tempBombY = 0;

		for (int i = 0; i < NBR_BOMBS; i++) {

			do {
				tempBombX = Utilities.randomInt(0, GAME_BOARD[0].length - 1);
				tempBombY = Utilities.randomInt(0, GAME_BOARD.length - 1);

			} while (isInTab(tempBombX, tempBombY) || (tempBombX == x_player && tempBombY == y_player));

			int bombPos[] = { tempBombY, tempBombX };

			BOMB_POS.add(bombPos);

		}

	}

	public static void showBombsPositions(int x_player, int y_player) {

		for (int i = 0; i < NBR_BOMBS; i++) {

			System.out.print("(" + BOMB_POS.get(i)[1] + "," + BOMB_POS.get(i)[0] + ") ");

		}

		System.out.println();

	}

	/**
	 * Permet de déplacer Mario sur la grille immaginaire et vérifie à chaque déplacement si il y a contacte avec une bombe
	 * 
	 * @param x_player
	 * @param y_player
	 */
	public static void letsPlay(int x_player, int y_player) {

		String playerMove = "";
		int tempX_player = x_player;
		int tempY_player = y_player;

		do {
			playerMove = Utilities.getUserSpecificInput(
					"Position actuelle : (" + tempX_player + "," + tempY_player + ") déplacement RLUD/ ?", "RLUD");

			if (playerMove.equalsIgnoreCase("R")) { // Si Mario va a droite x +1 
				tempX_player ++;

			} else if (playerMove.equalsIgnoreCase("L")) { // Si Mario va a gauche x -1
				tempX_player --;

			} else if (playerMove.equalsIgnoreCase("U")) { // Si Mario va en haut y +1
				tempY_player ++;

			} else if (playerMove.equalsIgnoreCase("D")) { // Si Mario va en bas y -1
				tempY_player --;

			}

		} while (!isInTab(tempX_player, tempY_player) && (tempX_player > 0 && tempY_player > 0
				&& tempX_player < GAME_BOARD[0].length && tempY_player < GAME_BOARD.length));
		if (isInTab(tempX_player, tempY_player)) {

			System.out.println("Bombe touchée - Vous avez perdu!");

		} else {

			System.out.println("Félicitations, vous avez gagné !");

		}

	}

	public static boolean isInTab(int x_player, int y_player) {

		for (int i = 0; i < BOMB_POS.size(); i++) {
			if (y_player == BOMB_POS.get(i)[0]) {
				if (x_player == BOMB_POS.get(i)[1]) {
					return true;
				}
			}

		}
		return false;

	}

}
