
public class ConversionExplicit {

	public static void main(String[] args) {
		short shMaVariableShort;
		int intMaVariableInt = 156000;
		double dblMaVariableDouble=3.5;
		
		shMaVariableShort = (short)intMaVariableInt;
		intMaVariableInt = (int)dblMaVariableDouble;
		
		System.out.println("On force un int dans un short");// L'affichage saute car en binaire 156 000 = 10 0110 0001 0110 0000 (18 bits)
		// Hors en short il ne prend que 16bits, il supprime donc les deux plus fort ==> -10- 0110 0001 0110 0000 ==> ca donne 24928
		System.out.println(shMaVariableShort);
		System.out.println("\nOn force un double dans un int");
		System.out.println(intMaVariableInt);

	}

}
