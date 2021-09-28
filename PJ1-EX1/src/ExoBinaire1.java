
public class ExoBinaire1 {

	
		public static void main(String[] args) {
		int intEx1 = 0b0111; // ob est le prefixe pour parler de binaire
		short shEx1 = 0b0111;
		byte byEx1 = 0b0111;
		
		int intEx2 = 0b1010101;
		short shEx2 = 0b1010101;
		byte byEx2 = 0b1010101;
		
		int intEx3 = 0b10110011;
		short shEx3 = 0b10110011;
		//byte byEx3 = 0b10110011; // Ne rentre pas dans un byte car valeur trop grande (128max)
		byte by2Ex3 = (byte)0b10110011;// le (byte) force la valeur en byte mais donne une valeure erronée
		
		int intEx4 = 0b00000000;
		short shEx4 = 0b00000000;
		byte byEx4 = 0b00000000;
		
		int intEx5 = 0b10111011100000;
		short shEx5 = 0b10111011100000;
		//byte byEx5 = 0b10111011100000;// Valeur toujours trop grande
		
		long lngEx6 = 0b1010101001010000;
		int intEx6 = 0b1010101001010000;
		//short shEx6 = 0b1010101001010000;// valeur trop grande pour un short
		//byte byEx6 = 0b1010101001010000;
		
		int intEx8 = 2147483647;
		//int intEx8 = 2147483648;// Valeur max d'un entier est de 2147483647
		long lngEx8 = 2147483648L;// Permet de depasser la limite du int MAIS on doit mettre un L a la fin du nombre
		
		byte intEx9a = 126;
		byte intEx9b = 127;
		//byte byEx9c = 128;// valeur maximum d'un byte (poids de 128 avec 0)
		//byte intEx9d = -129;// les valeurs max d'un byte sont donc de -128 a 127
		byte intEx9e = -128;
		byte lngEx9f = -127;
		
		System.out.println ("intEx1 " + intEx1);
		System.out.println ("shEx1 "+ shEx1);
		System.out.println ("byEx1 "+ byEx1);
		
		System.out.println ("\nintEx2 "+ intEx2);
		System.out.println ("shEx2 "+ shEx2);
		System.out.println ("byEx2 "+ byEx2);
		
		System.out.println ("\nintEx3 "+ intEx3);
		System.out.println ("shEx3 "+ shEx3);
		//System.out.println ("byEx3 "+ byEx3);
		System.out.println ("by2Ex3 "+ by2Ex3);
		
		System.out.println ("\nintEx4 "+ intEx4);
		System.out.println ("shEx4 "+ shEx4);
		System.out.println ("byEx4 "+ byEx4);
		
		System.out.println ("\nintEx5 "+ intEx5);
		System.out.println ("shEx5 "+ shEx5);
		//System.out.println ("byEx5 "+ byEx5);
		
		System.out.println ("\nlngEx6 "+ lngEx6);
		System.out.println ("intEx6 "+ intEx6);
		//System.out.println ("shEx6 "+ shEx6);
		//System.out.println ("byEx "+ byEx6);
		
		System.out.println ("\nintEx8 "+ intEx8);
		System.out.println ("lngEx8 "+ lngEx8);
		
		System.out.println ("\nintEx9a "+ intEx9a);
		System.out.println ("intEx9b "+ intEx9b);
		//System.out.println ("byEx9c "+ byEx9c);
		//System.out.println ("intEx9d "+ intEx9d);
		System.out.println ("intEx9e "+ intEx9e);
		System.out.println ("lngEx9f "+ lngEx9f);
		
		}//fin class

}
