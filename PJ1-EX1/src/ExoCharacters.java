
public class ExoCharacters {

	public static void main(String[] args) {
		
			char chCharTest1='a';// Autorise le character "a" 
			System.out.println(chCharTest1 + "h d'accord!");
			
			char chCharTest2=90;// Ou alors via le code ASCII du character
			System.out.println("Le caractère " +chCharTest2 + " a pour point de code " + (int)chCharTest2);
			
			char chCharTest3=50;
			System.out.println("Le caractère " +chCharTest3 + " a pour point de code " + (int)chCharTest3);
			
			char chPremierCharTest=50;
			char chDeuxiemeCharTest=54;
			int intTroisiemeCharTest;
			intTroisiemeCharTest = (int)chPremierCharTest + (int)chDeuxiemeCharTest;
			System.out.println(chPremierCharTest + "+" + chDeuxiemeCharTest + "=" +(char)intTroisiemeCharTest );
			
	}

}
