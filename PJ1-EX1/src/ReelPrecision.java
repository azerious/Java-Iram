
public class ReelPrecision {

	public static void main(String[] args) {
		
		float x1,x2,x3;
		x1=3331720f;// On met le f en fin de variable pour forcer le float
		x2=0.625f;
		x3=x1+x2;
		System.out.println(x3);// Imprécision de 0.125 
		
		x1=123456789f;
		x3=5+x1;
		x3=x3-x1;
		System.out.println(x3);// Fail total, ca devrait afficher 5
		
		x1=853000000f;
		x2=7400000f;
		x3=x1+x2;
		System.out.println(x3);// Works perfectly
		
		x1=0.00000000000853f;
		x2=0.000000000000074f;
		x3=x1+x2;
		System.out.println(x3);// légère imprécision
		
		x1=0.00000000000853f;
		x2=0.000000000000074f;
		x3=10.0f+x1+x2;
		System.out.println(x3);// On laisse tombé 8.604E-12
		
		
		System.out.println("On test maintenant avec des reels et pas des float");
		
		
		double x1dbl,x2dbl,x3dbl;
		x1dbl=3331720;
		x2dbl=0.625;
		x3dbl=x1dbl+x2dbl;
		System.out.println(x3dbl);
		
		x1dbl=123456789;
		x3dbl=5+x1dbl;
		x3dbl=x3dbl-x1dbl;
		System.out.println(x3dbl);
		
		x1dbl=853000000;
		x2dbl=7400000;
		x3dbl=x1dbl+x2dbl;
		System.out.println(x3dbl);
		
		x1dbl=0.00000000000853;
		x2dbl=0.000000000000074;
		x3dbl=x1dbl+x2dbl;
		System.out.println(x3dbl);
		
		x1dbl=0.00000000000853;
		x2dbl=0.000000000000074;
		x3dbl=10.0+x1dbl+x2dbl;
		System.out.println(x3dbl);
	}

}
