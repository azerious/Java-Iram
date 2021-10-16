
public class Introduction_String {

	public static void main(java.lang.String[] args) {

		String strNom = "Le Passe Temps";
		System.out.println("1 lenght : " + strNom.length());// Donne la longueur de la String
		System.out.println("2 CompareTo 'Le Passe Temps' : " + strNom.compareTo("Le Passe Temps"));// Compare deux chaines de characters -> si identique retourn 0
		System.out.println("3 CompareTo 'Le Passe Temps ' : " + strNom.compareTo("Le Passe Temps "));// 
		System.out.println("4 CompareTo 'le passe temps': " + strNom.compareTo("le passe temps"));
		System.out.println("5 CompareToIgnoreCase 'le passe temps': " + strNom.compareToIgnoreCase("le passe temps"));// comparer en ignorant la case

		strNom = " Le Passe Temps ";
		System.out.println("6 :" + strNom);
		System.out.println("7:" + strNom.trim());// enleve les espace en debut et fin de phrase
		System.out.println("8:" + strNom);

		strNom = strNom.trim();// permet de supprimer les espace avant et apres  directement dans l'assignation de la variable
		System.out.println("9 :" + strNom);

		strNom = "Le Passe Temps";
		System.out.println("10:" + strNom.substring(10, 12));// decoupe la string(a,b) du character a au character b non inclus
		System.out.println("11:" + strNom.charAt(3));// Donne le 4eme character de la string
		System.out.println("12:" + strNom.concat("\nBienvenu"));// Rajoute () a la string
		System.out.println("13 Contenu de la variable : " + strNom);
		
		strNom = strNom + "\nBienvenu";// Concatenation de la string
		System.out.println("14 Contenu de la variable : " + strNom);
		
		strNom = "Le Passe Temps";
		System.out.println("15 endsWith: " + strNom.endsWith("Temps"));// verifie la fin de la string (depuis la fin)
		System.out.println("16 endsWith: " + strNom.endsWith("mps"));
		System.out.println("17 endsWith: " + strNom.endsWith("mas"));
		System.out.println("18 replace: " + strNom.replace("temps", "Partout"));// replace (a,b) remplace la chaine de character a par la b ATTENTION case sensitiv
		System.out.println("19 replace: " + strNom.replace("Temps", "Partout"));// remplace TOUTES les ocurences
		String strExo = "BruXelleS";
		System.out.println("exo : " + strExo.substring(0,1).toLowerCase() + strExo.substring(1));
		System.out.println("exo : " + Character.toLowerCase(strExo.charAt(0)));// Permet d'appliquer le lowercase a un charAt et pas juste a une string
		
		System.out.println("20 replace All: " + strNom.replaceAll("e", "EEE"));// remplace TOUTE les chaine de character a par la chaine b
		System.out.println("21 to lower case: " + strNom.toLowerCase());// force le lower case a toute la string
		System.out.println("22 to upper case: " + strNom.toUpperCase());// force le upercase a toute la string
		System.out.println("23 Index of: " + strNom.indexOf("s", 0));// indique l'index du character "s" a partir de l'index 0
		System.out.println("24 Index of: " + strNom.indexOf("s", 2));
		System.out.println("25 Index of: " + strNom.indexOf("s", 7));//  indique l'index du character "s" a partir de l'index 7
		System.out.println("26 Index of: " + strNom.indexOf("x", 0));//  indique l'index du character "x" a partir de l'index 0 SI le character n'existe pas renvoi -1
		System.out.println("27 Last Index of e : " + strNom.lastIndexOf("e", 10));
		System.out.println("28 Last Index of e: " + strNom.lastIndexOf("e", 9));
		System.out.println("29 Last Index of e : " + strNom.lastIndexOf("e", 0));// donne le dernier index du character "e" avant l'index 0
		System.out.println("30 Last Index of e : " + strNom.lastIndexOf("e"));// donne le dernier index du character "e"
		
		strNom = Integer.toString(38);
		System.out.println("31 string ou entier ?? " + strNom);// force le type de variable en string
		
		strNom = "Le Passe Temps";
		System.out.println("égal ? " + strNom.equals("Le Passe Temps"));// renvoie true / false
	}

}
