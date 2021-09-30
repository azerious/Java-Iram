
public class Ex4_TVA {

	public static void main(String[] args) {
		final double TAUX_TVA = 21.0;// le final devqnt est pour definir une constante, par soucis de visibilte on met les const en MAJ
		double dblPrixBrut = 0.0;
		double dblPrixNet = 0.0;
		
		dblPrixBrut = 100.0;
		dblPrixNet = dblPrixBrut * (TAUX_TVA/100.0+1);
		
		System.out.println("Pour un prix brut de " + dblPrixBrut + " le prix net est de " + dblPrixNet + " €");
	}

}
