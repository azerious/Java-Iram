
public class Exo_parcour_de_tableaux {

	public static void main(String[] args) {
		int Tab[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

		for (int i = 0; i < Tab.length; i++) {
			for (int j = 0; j < Tab[0].length; j++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- B --------");
		System.out.println();

		for (int i = 0; i < Tab.length; i++) {
			for (int j = Tab[0].length - 1; j >= 0; j--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- C --------");
		System.out.println();

		for (int j = 0; j < Tab[0].length; j++) {
			for (int i = 0; i < Tab.length; i++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- D --------");
		System.out.println();

		for (int j = Tab[0].length - 1; j >= 0; j--) {
			for (int i = Tab.length - 1; i >= 0; i--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- E --------");
		System.out.println();

		for (int j = 0; j < Tab[0].length; j = j + 2) {
			for (int i = 0; i < Tab.length; i++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- F --------");
		System.out.println();

		for (int i = 1; i < Tab.length; i = i + 2) {
			for (int j = 0; j < Tab[0].length; j++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- G --------");
		System.out.println();

		for (int i = Tab.length - 2; i >= 0; i = i - 2) {
			for (int j = Tab[0].length - 1; j >= 0; j--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-------- H --------");
		System.out.println();

		for (int i = 0, j = 0; i < Tab.length && j < Tab[0].length; i++, j++) {
			System.out.print(Tab[i][j] + " ");
		}
	}

}
