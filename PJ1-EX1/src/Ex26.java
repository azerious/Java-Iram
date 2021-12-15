
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;
import java.io.FileWriter;

public class Ex26 {

	public static void main(String[] args) {
		String PathDir = "";
		String Actual_Formatted_Date_Time = "";
		String line1 = "cafe braserie";
		String line2 = "le passe temps";
		try {
			PathDir = getUserPathDir(PathDir);
			Actual_Formatted_Date_Time = getActualFormattedDateTime("yyyy-MM-dd HH'h'mm'm'-ss's'-SSS");
			File f = new File(PathDir + "\\" + Actual_Formatted_Date_Time + ".txt");
			if (fileCreation(f)) {
				FileWriter fw = new FileWriter(f);
				fw.write(line1 + "\r\n");
				fw.write(line2 + "\r\n");
				SimpleDateFormat SmplDateFrmt = new SimpleDateFormat("dd/MM/yy");
				Calendar cldr = Calendar.getInstance();
				fw.write(SmplDateFrmt.format(cldr.getTime()));
				fw.close();
			}
		} catch (Exception e) {
			System.out.println("Erreur survenue : " + e.getMessage());
		} // FIN CATCH
	}// end main

	/**
	 * renvoie la date heure actuelle dans un format comme Time_form choisi et passé
	 * en paramètre
	 * 
	 * @param Time_form
	 * @return
	 */
	public static String getActualFormattedDateTime(String Time_form) {

		SimpleDateFormat SmplDateFrmt = new SimpleDateFormat(Time_form);
		Calendar cldr = Calendar.getInstance();
		return SmplDateFrmt.format(cldr.getTime());
	}// end getActualFormattedDateTime

	/**
	 * fonction renvoie un chemin valide saisi par l’utilisateur
	 * 
	 * @param directoryPath
	 * @return
	 */
	public static String getUserPathDir(String directoryPath) {
		directoryPath = Utilities.getUserInputString("entrez un Chemin :  ");
		do {
			File f = new File(directoryPath);
			if (f.isDirectory()) {
				return directoryPath;
			}
			directoryPath = Utilities.getUserInputString(" Chemin non valide entrez un autre Chemin : ");
		} while (true);

	}// getUserPathDir

	/**
	 * crée le fichier passé en paramètre via le chemin strPath et renvoie true si
	 * la création a réussi
	 * 
	 * @param f
	 * @param strPath
	 * @return
	 */
	public static boolean fileCreation(File f) {
		boolean creation_of_file = false;
		try {
			f.createNewFile();
			creation_of_file = true;
		} catch (Exception e) {
			System.out.println("Chemin de destination invalide");
			creation_of_file = false;
		} // end catch
		return creation_of_file;
	}// end fileCreation

}// end class
