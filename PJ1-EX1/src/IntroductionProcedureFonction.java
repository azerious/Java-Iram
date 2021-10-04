
public class IntroductionProcedureFonction {

	public static void main(String[] args) {// le void qpres static signifie qu'il s'agit d'une PROCEDURE (Ne renvoi pas de valeur != des fonctions
		// qui elles renvoient des valeur (return) )
		
		MaProcedurePrixSolde(100.0, 15.0);// Appel de la procédure que l'on crée plus bas
		MaProcedurePrixSolde(200.0, 30.0);
		MaProcedurePrixSolde(50.0, 10.0);

	}

	
	static void MaProcedurePrixSolde(double PrixAffiche, double PctRemise) {// Attention ordre des params
		
		double PrixAPayer = 0.0;
		
		PrixAPayer = PrixAffiche - (PctRemise/100.0)*PrixAffiche;// Assignation de la variable locale
		
		System.out.println("A payer - " + PrixAPayer + " €");
	
	}
}
