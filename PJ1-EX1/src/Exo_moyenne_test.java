
public class Exo_moyenne_test {

	final static double[] results = { 9.5, 18.5 };

	public static void main(String[] args) {

		evaluationMsg_checkgrade_SatisfactionLimiteInf();
		evaluationMsg_checkgrade_Satisfaction();
		evaluationMsg_checkgrade_Distinction();
		evaluationMsg_checkgrade_DistinctionLimiteInf();
		evaluationMsg_checkgrade_GrandeDistinctionLimiteInf();
		evaluationMsg_checkgrade_GrandeDistinction();
		evaluationMsg_checkgrade_GrandeDistinctionLimiteSup();
		evaluationMsg_checkgrade_LaPlusGrandeDistinctionLimiteInf();
		evaluationMsg_checkgrade_LaPlusGrandeDistinction();
		evaluationMsg_checkgrade_LaPlusGrandeDistinctionLimiteSup();
		evaluation_ponderationTotaleMemePoids();
		evaluation_ponderationTotaleDifferentPoids();

	}

//	  public static void evaluationMsg_TestUpLimitValidWorktime() {
//	  
//	  String result = Examen2018_Session1.evaluationMsg(60, 60); String name = new
//	  Object(){}.getClass().getEnclosingMethod().getName();
//	  Assert.isTrue(name,"V",result); }

	public static void evaluationMsg_checkgrade_SatisfactionLimiteInf() {
		String result = Exam_moyenne.checkGrade(60);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Satisfaction", result);

	}

	public static void evaluationMsg_checkgrade_Satisfaction() {
		String result = Exam_moyenne.checkGrade(66.5);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Satisfaction", result);

	}

	public static void evaluationMsg_checkgrade_DistinctionLimiteInf() {
		String result = Exam_moyenne.checkGrade(70);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Distinction", result);

	}

	public static void evaluationMsg_checkgrade_Distinction() {
		String result = Exam_moyenne.checkGrade(78.4);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Distinction", result);

	}

	public static void evaluationMsg_checkgrade_GrandeDistinctionLimiteInf() {
		String result = Exam_moyenne.checkGrade(80);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Grande distinction", result);

	}

	public static void evaluationMsg_checkgrade_GrandeDistinctionLimiteSup() {
		String result = Exam_moyenne.checkGrade(89.9);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Grande distinction", result);

	}

	public static void evaluationMsg_checkgrade_GrandeDistinction() {
		String result = Exam_moyenne.checkGrade(85.3);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Grande distinction", result);

	}

	public static void evaluationMsg_checkgrade_LaPlusGrandeDistinctionLimiteInf() {
		String result = Exam_moyenne.checkGrade(90);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "La plus grande distinction", result);

	}

	public static void evaluationMsg_checkgrade_LaPlusGrandeDistinctionLimiteSup() {
		String result = Exam_moyenne.checkGrade(100);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "La plus grande distinction", result);

	}

	public static void evaluationMsg_checkgrade_LaPlusGrandeDistinction() {
		String result = Exam_moyenne.checkGrade(96.8);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "La plus grande distinction", result);

	}

	public static void evaluation_ponderationTotaleMemePoids() {
		int[] WEIGHTS = { 1, 1 };
		int result = Exam_moyenne.ponderationTotal(WEIGHTS);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 2, result);

	}

	public static void evaluation_ponderationTotaleDifferentPoids() {
		int[] WEIGHTS = { 2, 1 };
		int result = Exam_moyenne.ponderationTotal(WEIGHTS);
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 3, result);

	}



}