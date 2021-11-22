
public class Boucle_imbriquee_intro {

	public static void main(String[] args) {
		int Tab[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

		for (int i = 0; i < Tab.length; i++) {
			for (int j = 0; j < Tab[0].length; j++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}
	}

}
