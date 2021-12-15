import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Test_creation_file {

	public static void main(String[] args) {
		String strPathDirectory = "D:\\Attitude\\Documents\\COURS\\Iramps\\Java\\Java-Iram";
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le chemin du fichier comme C:\\Temp par exemple");
			strPathDirectory = sc.nextLine();
			
			File f = new File(strPathDirectory + "\\MonFichierTexteIRAM_PS.txt"); //Création de l'objet mais le fichier "physique" n'est pas encore crée sur le disque dur
			if (f.exists()) {
				System.out.println("Le fichier existe déjà et va être modifié");
			} else {
				System.out.println("Le fichier n'existe pas encore et va être créé");
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f, false);// Si on met en deuxième paramètre : true alors on fait un "append" => il va écrire à la suite de ce qui est déjà dans le fichier
			
			System.out.println("Entrez votre nom");
			
			fw.write("Ca y est ! Voilà que je sais écrire mon nom " + sc.nextLine() + " dans un fichier texte \r\n"
					+ " Youhouuuuu !!!!!\r\n");
			
			fw.close();
			
			System.out
					.println("Allez voir votre fichier " + f.getName() + " dans le " + " répertoire " + f.getParent());
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Erreur survenue :" + e.getMessage());
		} // end catch
	}// end main
}
