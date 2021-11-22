
public class Ex21 {

	public static void main(String[] args) {

		String Names[] = { "Spa reine 25 cl", "Bru plate 50 cl", "Bru légèrement pétillante 50 cl", "Pepsi, Pepsi max",
				"Spa orange" };

		defineStock(Names, getStock(Names));

	}

	
	static int[] getStock(String Names[]) {
		int[] Stock = new int[Names.length];

		for (int i = 0; i < Names.length; i++) {
			Stock[i] = Utilities.getUserInputInteger("Entrez le stock pour " + Names[i]);
		}
		return Stock;
	}
	
	static void defineStock(String Names[], int Stock[]) {
			
		System.out.println("--Récapitulatif--");
		for (int i = 0; i < Names.length; i++) {
			System.out.println(Names[i] + " Stock : " + Stock[i]);
		}

	}

}
