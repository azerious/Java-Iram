
public class Assert {

	public static void isTrue(String testName, int expected, int result) {

		System.out.println(testName + " " + (expected == result ? "OK" : "Failed"));

	}

	public static void isTrue(String testName, String expected, String result) {

		System.out.println(testName + " " + (expected.equals(result) ? "OK" : "Failed"));

	}

	public static void isTrue(String testName, double expected, double result, double precision) {
		System.out.println(testName + " " + (Math.abs(expected - result) <= precision ? "OK" : "Failed"));
	}
}

/*
 * Exemple comment appeller Assert evaluationMsg_TestUpLimitValidWorktime();
 * 
 * public static void evaluationMsg_TestUpLimitValidWorktime() {
 * 
 * String result = Examen2018_Session1.evaluationMsg(60, 60); String name = new
 * Object(){}.getClass().getEnclosingMethod().getName();
 * Assert.isTrue(name,"V",result); }
 * 
 */
