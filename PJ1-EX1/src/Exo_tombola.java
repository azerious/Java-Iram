
public class Exo_tombola {

	public static void main(String[] args) {

		int[] tickets = new int[10];

		randomTickets(tickets);

		for (int i = 0; i < tickets.length; i++) {

			System.out.println("N° du lot " + (i + 1) + " Numéro de billet " + tickets[i]);

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
							"N° de billet " + temp + " attribué au lot N° " + (i + 1) + " – numéro de billet rejeté");
				}

			} while (isInTab);

			tickets[i] = temp;

			System.out.println(
					"N° de billet " + tickets[i] + " attribué au lot N° " + (i + 1) + " – numéro de billet accepté");

		}

	}

}