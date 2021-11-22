
public class Exo_max_inside_array {

	public static void main(String[] args) {
		int Array[] = { 15, 25, 0, 35, 48, 2, 0, 89, 100, 7, -6 };
		int maximum = 0;

		maximum = get_max(Array);

		System.out.println("Le nombre maximum est : " + maximum);
	}

	static int get_max(int Array[]) {
		int max = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
		}
		return max;
	}
}
