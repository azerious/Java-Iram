import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Exo_ticket_caisse {
	final static int MIN_TABLE = 1;
	final static int MAX_TABLE = 20;
	final static String NAMES[] = { "Spa reine 25 ", "Bru plate 50", "Bru pét 50", "Pepsi", "Spa orange",
			"Schweppes Tonic", "Schweppes Agr", "Ice Tea", "Ice Tea Pêche", "Jus d'orange Looza", "Cécémel", "Red Bull",
			"Petit Expresso", "Grand Expresso", "Café décaféiné ", "Lait Russe ", "Thé et infusions", "Irish Coffee ",
			"French Coffee ", "Cappuccino", "Cécémel chaud", "Passione Italiano", "Amour Intense", "Rhumba Caliente ",
			"Irish Kisses ", "Cuvée Trolls 25", "Cuvee Trolls 50", "Ambrasse-Temps 25", "Ambrasse-Temps 50 ",
			"Brasse-Temps Cerises 25", "Brasse-Temps Cerises 50", "La Blanche Ste Waudru 25", "Blanche Ste Waudru 50",
			"Brasse-Temps citr 25", "Brasse-Temps citr 50", "Spaghetti Bolo ", "Tagl Carbonara", "Penne poulet baslc ",
			"Tagl American", "Tagl saum" };
	final static double NETPRICES[] = { 2.2, 2.3, 3.9, 2.2, 2.2, 2.6, 2.6, 2.6, 2.6, 2.6, 2.6, 4.5, 2.2, 2.2, 2.2, 2.5,
			2.5, 7.0, 7.0, 2.8, 2.8, 6.2, 6.2, 6.2, 6.2, 2.9, 5.5, 2.7, 5.1, 3.1, 5.8, 2.6, 4.9, 2.6, 4.9, 10.8, 11.2,
			12.2, 14.5, 16.9 };
	final static byte TYPE_TVA[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
	final static DecimalFormat DfFormat = new DecimalFormat("0.00");
	final static double TAUX_TVA1 = 21.0;
	final static double TAUX_TVA2 = 12.0;
	final static double TAUX_TVA3 = 6.0;
	final static double PCT_TVA[] = { TAUX_TVA1, TAUX_TVA2, TAUX_TVA3 };
	final static int RANK1 = 31;
	final static int RANK2 = 40;
	final static int RANK3 = 47;
	final static int TAB_RANK[] = { RANK1, RANK2, RANK3 };
	final static String V = "V";
	final static String Q = "Q";
	final static String A = "A";
	final static String PATHDIR = "D:\\Attitude\\Documents\\COURS\\Iramps\\Java\\Java-Iram\\Tickets_resto";
	final static String DATEFORMAT = "yyyy-MM-dd HH'h'mm'm'-ss's'-SSS";
	final static Calendar DATENOW = Calendar.getInstance();
	final static SimpleDateFormat SmplDateFrmt = new SimpleDateFormat("dd/MM/yy HH:mm");
	final static String ENTETE = "Le Café-Brasserie\r\nLe passe temps\r\n" + SmplDateFrmt.format(DATENOW.getTime())
			+ "\r\n";
	final static String SEPARATOR = "--------------------------------------------------";

	public static void main(String[] args) throws IOException {

		String numTable = "";
		ArrayList<int[]> order = new ArrayList<int[]>();

		numTable = Utilities.getUserIntOrSpecificInputV2(
				"Entrez le numéro de table (de " + MIN_TABLE + " à " + MAX_TABLE + ")/ Q (Quitter)", "Q", MIN_TABLE,
				MAX_TABLE);
		if (numTable == "Q") {
			System.exit(1);
		}

		Utilities.getOrder(order, NAMES);

		createNewTicket(order, numTable);

	}

	public static void createNewTicket(ArrayList<int[]> order, String numberTable) throws IOException {

		String ticketName = Utilities.getActualFormattedDateTime(DATEFORMAT);
		boolean fileCreated = false;
		int totalConso = 0;

		File f = new File(PATHDIR + "\\" + ticketName + ".txt");
		fileCreated = Utilities.fileCreation(f);
		if (fileCreated) {
			FileWriter fw = new FileWriter(f, false);

			fw.write(ENTETE + "\r\n" + "Table : " + numberTable + "\r\n" + SEPARATOR + "\r\n");

			for (int i = 0; i < order.size(); i++) {
				String strNameArticle = NAMES[order.get(i)[0]];
				strNameArticle = Utilities.placeNumberToRank(strNameArticle, Integer.toString(order.get(i)[1]),
						TAB_RANK[0]);
				strNameArticle = Utilities.placeNumberToRank(strNameArticle,
						DfFormat.format(NETPRICES[order.get(i)[0]]), TAB_RANK[1]);
				strNameArticle = Utilities.placeNumberToRank(strNameArticle,
						DfFormat.format(NETPRICES[order.get(i)[0]] * order.get(i)[1]), TAB_RANK[2]);
				fw.write(strNameArticle + "\r\n");
			}

			fw.write("\r\n" + SEPARATOR + "\r\n");
			
			for (int i = 0; i < order.size(); i++) {
				totalConso = totalConso + order.get(i)[1];
			}

			fw.write(Utilities.placeNumberToRank("TOTAL CONSOMMATIONS : ", Integer.toString(totalConso), TAB_RANK[0])
					+ "\r\n");

			fw.write(SEPARATOR + "\r\n");

			for (int i = 0; i < PCT_TVA.length; i++) {
				String strLineTVA = "TOTAL TVA " + PCT_TVA[i] + "%";
				strLineTVA = Utilities.placeNumberToRank(strLineTVA,
						DfFormat.format(Utilities.AfficherMontantTVA(totalSelonTVA(i, order, TYPE_TVA), PCT_TVA[i])), TAB_RANK[1]);
				strLineTVA = Utilities.placeNumberToRank(strLineTVA, DfFormat.format(totalSelonTVA(i, order, TYPE_TVA)),
						TAB_RANK[2]);
				fw.write(strLineTVA + "\r\n");
			}

			fw.write("\r\n" + SEPARATOR + "\r\n");

			fw.write(
					Utilities.placeNumberToRank("TOTAL", totalAPayer(order), TAB_RANK[(TAB_RANK.length) - 1]) + "\r\n");
			fw.close();

		}

	}

	public static double totalSelonTVA(int TVA_INDEX, ArrayList<int[]> order, byte TYPE_TVA[]) {

		double totalTVA = 0.0;

		for (int i = 0; i < order.size(); i++) {
			if (TYPE_TVA[order.get(i)[0]] == TVA_INDEX) {
				totalTVA = totalTVA + (NETPRICES[order.get(i)[0]] * order.get(i)[1]);
			}
		}

		return totalTVA;

	}

	public static String totalAPayer(ArrayList<int[]> order) {

		double totalFinal = 0.0;

		for (int i = 0; i < order.size(); i++) {
			totalFinal = totalFinal + (NETPRICES[order.get(i)[0]] * order.get(i)[1]);
		}
		return DfFormat.format(totalFinal);

	}

}// end class
