
public class Test {

	public static void main(String[] args) {
		String test = Utilities.getUserMultipleInputString("Entrez le prix du pain");
		String test2 = Utilities.getUserMultipleInputString("Entrez le prix du pain");
		
		System.out.println("Le prix du pain est de : " + test + "€");
		System.out.println("Le prix du pain est de : " + test2 + "€");
	}

}
