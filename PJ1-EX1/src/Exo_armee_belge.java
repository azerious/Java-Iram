public class Exo_armee_belge {

	static final int AGE_MIN = 18;
	static final int AGE_MAX = 34;
	static final double ACUITY_MIN = 8.0;

	public static void main(String[] args) {
		
		
		String name = "";

		boolean nationality = false;
		boolean speakingFrench = false;
		boolean speakingDutch = false;

		double visualAcuity = 0.0;
		int age = 0;
		
		name = Utilities.getUserInputString("- Quel est votre nom ?");
		System.out.println(name + " : " + (isSelected(age, nationality, speakingFrench, speakingDutch, visualAcuity) ? "OK" : "Not OK"));

	}

	/**
	 * Les candidats peuvent prétendre au test d’admission s’ils répondent aux
	 * conditions ci-après. La personne doit être de nationalité belge ou issue de
	 * l’union européenne, âgée d’au moins 18 ans et de moins de 34 ans. Elle doit
	 * parler couramment au moins une des deux langues nationales. L’acuité visuelle
	 * doit être au moins de 8/10. Toutes les questions sont posées même si un
	 * critère n’est pas rempli durant le déroulement du questionnaire.
	 * 
	 * @param age
	 * @param nationality
	 * @param speakingFrench
	 * @param speakingDutch
	 * @param visualAcuity
	 * @return
	 */
	static boolean isSelected(int age, boolean nationality, boolean speakingFrench, boolean speakingDutch,
			double visualAcuity) {

		age = Utilities.getUserInputInteger("- Quel est votre age ?");
		nationality = Utilities.checkAnswer("- Etes-vous de nationalité belge ou issu de l’union européenne Y/N ?",
				"Y");
		speakingFrench = Utilities.checkAnswer("- Parlez-vous couramment le français Y/N?", "Y");
		speakingDutch = Utilities.checkAnswer("- Parlez-vous couramment le néerlandais Y/N?", "Y");
		visualAcuity = Utilities.getUserInputDouble("- Quelle est votre acuité visuelle /10 ?");

		return (age >= AGE_MIN && age < AGE_MAX) && nationality && (speakingFrench || speakingDutch)
				&& (visualAcuity >= ACUITY_MIN);
	}

}