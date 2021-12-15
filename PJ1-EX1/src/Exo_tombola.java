
public class Exo_tombola {

	public static void main(String[] args) {

		int[] tickets = new int[10];

		randomTickets(tickets);

		for (int i = 0; i < tickets.length; i++) {

			System.out.println("N� du lot " + (i + 1) + " Num�ro de billet " + tickets[i]);

		}

	}

	static void randomTickets(int tickets[]) {
		int temp = 0;
		boolean isInTab = false;

		for (int i = 0; i < tickets.length; i++) {

			do {
				temp = Utilities.randomInt(1, 50);
				isInTab = Utilities.isInTab(temp, tickets);

				if (isInTab) {
					System.out.println(
							"N� de billet " + temp + " attribu� au lot N� " + (i + 1) + " � num�ro de billet rejet�");
				}

			} while (isInTab);

			tickets[i] = temp;

			System.out.println(
					"N� de billet " + tickets[i] + " attribu� au lot N� " + (i + 1) + " � num�ro de billet accept�");

		}

	}

}