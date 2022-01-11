import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Utilities {
	final static String NAMES[] = {};
	final static double NETPRICES[] = {};
	final static String V = "V"; // validation char (string) la commande
	final static String Q = "Q"; // quitter saisie commande (sans enregistrer)
	final static String A = "A"; // Annuler la saisie de la consommation en cours

	/**
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner un
	 * r�el
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne le r�el demand�
	 */
	public static double getUserInputDouble(String question) {// public rend la fonction utilisable dans d'autres
																// classes
		double value = 0.0;
		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println(question);
				value = sc.nextDouble();

				return value;
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner une
	 * phrase
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne la phrase demand�e
	 */
	public static String getUserInputString(String question) {
		String value = "";
		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println(question);
				value = sc.nextLine();

				return value;
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * Permet d'envoyer un texte libre en param�tre en lecture et de retourner un
	 * entier
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @return retourne l'entier demand�
	 */
	public static int getUserInputInteger(String question) {
		int value = 0;

		do {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.println(question);
				value = sc.nextInt();
				return value;

			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);

	}

	/**
	 * Permet de retourner une valeur en ayant mis un min et un max OU -1 si la
	 * valeur n'est pas comprise dans les extr�mit�s
	 * 
	 * @param question Phrase libre que l'on envoie dans le Scanner
	 * @param min      Valeur minimum
	 * @param max      Valeur maximum
	 * @return retourne l'entier demand� si compris entre min max OU retourne -1
	 */
	public static int getUserInputInteger(String question, int min, int max) {
		int value = 0;
		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println(question);
				value = sc.nextInt();

				return min <= value && max >= value ? value : -1;

			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * Permet de calculer le prix net d'un prix
	 * 
	 * @param prixBrut Prix brut
	 * @param TVA      Taux tva (en %)
	 * @return retourne le prix NET d'un brut
	 */
	public static double ComputeNetPrice(double prixBrut, double TVA) {

		return prixBrut * (TVA / 100 + 1);
	}

	/**
	 * Permet de calaculer le montant de la TVA � partir d'un prix NET
	 * 
	 * @param prixNet
	 * @param tauxTVA
	 */
	public static double AfficherMontantTVA(double prixNet, double tauxTVA) {
		double montantTVA = 0.0;

		montantTVA = prixNet * tauxTVA / (100 + tauxTVA);

		return montantTVA;
	}

	/**
	 * Permet de v�rifier si le num�ro de table encod� est correct
	 * 
	 * @param NUM_MAX_TABLE Num�ro de table Max
	 * @return
	 */
	public static int getAndCheckTableNumber(int NUM_MAX_TABLE) {
		int intNumTable = 0;
		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("Entrez le N� de table");
				intNumTable = sc.nextInt();

				if (intNumTable > NUM_MAX_TABLE) {
					System.out.println("Saisie incorrecte ! Le N� table le plus �lev� est " + NUM_MAX_TABLE
							+ ". Contactez l�administrateur du programme si vous souhaitez augmenter ce nombre");
					return -1;
				} // fin else if 1
				else if (intNumTable < 1) {
					System.out.println("Saisie incorrecte ! Le N� de table doit �tre sup�rieur ou �gal � 1");
					return -1;
				} // Fin else if 2
				else {
					return intNumTable;
				}
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * Permet de retourner si une r�ponse est vraie ou non
	 * 
	 * @param question La question
	 * @param answer   La r�ponse
	 * @return retourne vrai/faux si la r�ponse donn�e correspond � la r�ponse
	 *         attendue (sans tenir compte des maj ou des espaces avant / apr�s)
	 */
	public static boolean checkAnswer(String question, String answer) {
		String txtAnswer = "";
		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println(question);
				txtAnswer = sc.nextLine();
				return (txtAnswer.trim().equalsIgnoreCase(answer));
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * ask the user multiple choices of letters and only one answer can be chosen
	 * will ask again if the answer is incorrect and return the right result
	 * 
	 * @param msg
	 * @param expectedAnswers
	 * @return
	 */
	public static String getUserSpecificInput(String msg, String expectedAnswers) {

		String strAnswer;
		do {

			try {
				Scanner sc = new Scanner(System.in);

				do {
					System.out.println(msg);
					strAnswer = sc.next().trim().toUpperCase();
					// if only one char and if this char is in the expected answer string
					if (strAnswer.length() == 1 && expectedAnswers.indexOf(strAnswer) >= 0) {
						return strAnswer;
					} else {
						System.out.println("Erreur de saisie, votre choix doit �tre parmi " + expectedAnswers
								+ " une lettre seulement");
					} // FIN ELSE
				} // FIN DO
				while (true);// end do while
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}// FIN FONCTION

	/**
	 * Permet de boucler une question tant que le nombre rentr� n'est pas compris
	 * entre le minimum et le maximum
	 * 
	 * @param question La question
	 * @param min      Nombre minimum accept� (inclus)
	 * @param max      Nombre maximum accept� (inclus)
	 * @return retourne l'entier demand� dans l'�cart min max
	 */
	public static int getUserIntegerInput(String question, int min, int max) {
		int value = 0;
		do {

			try {

				Scanner sc = new Scanner(System.in);
				do {
					System.out.println(question);
					value = sc.nextInt();
					if (value < min || value > max) {
						System.out.println("le nombre doit �tre compris entre : " + min + " et : " + max);
					}
				} while (value < min || value > max);
				return value;
			} catch (Exception e) {
				System.out.println("Saisie incorrecte");

			}
		} while (true);
	}

	/**
	 * 
	 * Permet de retourner l'index du nombre rechercher OU -1 si le nombre n'est pas
	 * dans le tableau
	 * 
	 * @param Nombres     Le tableau rempli de nombre sur lequel on souhaite faire
	 *                    la recherche
	 * @param inputNumber Le nombre que l'on recherche dans le tableau
	 * @return index if found, -1 if not found
	 */
	static int isInTab(int Nombres[], int inputNumber) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}

	/**
	 * 
	 * Permet de retourner un booleen vrai/faux si le nombre recherch� est dans le
	 * tableau
	 * 
	 * @param Nombres     Le tableau rempli de nombre sur lequel on souhaite faire
	 *                    la recherche
	 * @param inputNumber Le nombre que l'on recherche dans le tableau
	 * @return true if found, false if not found
	 */
	static boolean isInTab(int inputNumber, int Nombres[]) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i]) {
				return true;
			}
			i++;
		}
		return false;

	}

	/**
	 * Permet de rechercher le maximum dans un tableau et de le retourner
	 * 
	 * @param Array Le tableau que l'on envoie
	 * @return retourne le maximum du tableau
	 */
	static int getMax(int Array[]) {
		int max = Array[0];
		do {

			try {

				for (int i = 1; i < Array.length; i++) {
					if (Array[i] > max) {
						max = Array[i];
					}
				}
				return max;
			} catch (Exception e) {
				System.out.println("Erreur de saisie recommencez");

			}
		} while (true);
	}

	/**
	 * renvoie un nombre al�atoire entre un min et un max donn�
	 */
	public static int randomInt(int min, int max) {
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}// en randInt

	/**
	 * 
	 * @param msg             Question pos�e
	 * @param expectedAnswers liste des lettres accept�es comme r�ponse
	 * @param min             valeur minimum accept�e
	 * @param max             valeur maximum accept�e
	 * @return renvoie le nombre rentr� compris entre un minimum et un maximum en
	 *         String ou la lettre rentr� faisant partie des lettres autoris�es
	 */
	public static String getUserIntOrSpecificInput(String msg, String expectedAnswers, int min, int max) {

		String strInput;
		int intInput = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(msg);
			if (sc.hasNextInt() == true) {
				intInput = sc.nextInt();
				if (intInput < min || intInput > max) {
					System.out.println("La commande doit �tre comprise entre " + min + " et " + max);
				} else {
					return String.valueOf(intInput); // OU Integer.toString(intInput)
				}
			} else {
				strInput = sc.next().trim().toUpperCase();
				if (strInput.length() == 1 && expectedAnswers.indexOf(strInput) >= 0) {
					return strInput;
				} else {
					System.out.println("Erreur de saisie, votre choix doit �tre parmi " + expectedAnswers
							+ " une lettre seulement");
				}
			}

		} while (true);

	}

	/**
	 * combine an original string with a decimal number placed after the string at a
	 * specific rank to do a number's right alignment. Original string is completed
	 * by spaces " "
	 * 
	 * @param strOriginalStr   : original string wich will be completed by the
	 *                         number
	 * @param strNumberToPlace : decimal number in string format to add at the end
	 *                         of the original string
	 * @param rank             : rank to place de last number's figure
	 */
	public static String placeNumberToRank(String strOriginalStr, String strNumberToPlace, int rank) {
		int spaceCount = 0;
		String strTmp = "";
		spaceCount = rank - strOriginalStr.length() - strNumberToPlace.length();

		if (spaceCount > 0) {
			strTmp = strOriginalStr + " ".repeat(spaceCount) + strNumberToPlace;

			// in the case of Original String is too long, sacrify the string's end to leave
			// space for the number
		} else {
			strTmp = strOriginalStr.substring(0, rank - strNumberToPlace.length() - 1);
			strTmp = strTmp + " " + strNumberToPlace;
		} // end if

		return strTmp;
	}// end placeNumberToRank

	public static String getUserIntOrSpecificInputV2(String msg, String expectedAnswers, int min, int max) {

		String strInput;
		int intInput = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(msg);
			if (sc.hasNextInt() == true) {
				intInput = sc.nextInt();
				if (intInput < min) {
					System.out.println("Saise incorrecte");
				} else if (intInput > max) {
					System.out.println(
							"N� de table maximum " + max + ", contactez votre d�veloppeur pour augmenter ce nombre");
				} else {
					return String.valueOf(intInput); // OU Integer.toString(intInput)
				}
			} else {
				strInput = sc.next().trim().toUpperCase();
				if (strInput.length() == 1 && expectedAnswers.indexOf(strInput) >= 0) {
					return strInput;
				} else {
					System.out.println("Saise incorrecte");
				}
			}

		} while (true);

	}

	public static void getOrder(ArrayList<int[]> ord) {
		String answ = "";
		int idCons = 0, numbCons = 0;

		try {

			do {
				/*
				 * le serveur ne peut valider la premi�re fois (il n'y a pas encore de
				 * consommations) l'invitation ne propose pas la validation si l'array list ne
				 * contient encore rien
				 */
				answ = (ord.size() == 0)
						? Utilities.getUserIntOrSpecificInput("Entrez le N� de la consommation " + "/" + Q + " Quitter",
								Q, 1, NAMES.length)
						: Utilities.getUserIntOrSpecificInput(
								"Entrez le N� de la consommation " + "/" + Q + " Quitter /" + V + " Valider", Q + V, 1,
								NAMES.length);

				if (answ.equals(Q)) {
					System.exit(1);

				} else if (!answ.equals(V)) {

					idCons = Integer.parseInt(answ) - 1;
					answ = Utilities.getUserIntOrSpecificInput("Entrez le nombres de " + "consommations pour "
							+ NAMES[idCons] + " " + A + "/ " + "Annuler /" + Q + " Quitter", Q + A, 1, 1000);
					if (answ.equals(Q)) {
						System.exit(1);
					} else if (!answ.equals(A)) {

						numbCons = Integer.parseInt(answ);

						addToOrMergeOrder(ord, idCons, numbCons);
					}
				} // end if
			} while (!answ.equals(V));
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
	}// end getOrder

	public static void getOrder(ArrayList<int[]> ord, String NAMES[]) {
		String answ = "";
		int idCons = 0, numbCons = 0;

		try {

			do {
				/*
				 * le serveur ne peut valider la premi�re fois (il n'y a pas encore de
				 * consommations) l'invitation ne propose pas la validation si l'array list ne
				 * contient encore rien
				 */
				answ = (ord.size() == 0)
						? Utilities.getUserIntOrSpecificInput("Entrez le N� de la consommation " + "/" + Q + " Quitter",
								Q, 1, NAMES.length)
						: Utilities.getUserIntOrSpecificInput(
								"Entrez le N� de la consommation " + "/" + Q + " Quitter /" + V + " Valider", Q + V, 1,
								NAMES.length);

				if (answ.equals(Q)) {
					System.exit(1);

				} else if (!answ.equals(V)) {

					idCons = Integer.parseInt(answ) - 1;
					answ = Utilities.getUserIntOrSpecificInput("Entrez le nombres de " + "consommations pour "
							+ NAMES[idCons] + " " + A + "/ " + "Annuler /" + Q + " Quitter", Q + A, 1, 1000);
					if (answ.equals(Q)) {
						System.exit(1);
					} else if (!answ.equals(A)) {

						numbCons = Integer.parseInt(answ);

						addToOrMergeOrder(ord, idCons, numbCons);
					}
				} // end if
			} while (!answ.equals(V));
		} catch (Exception e) {
			System.out.println("Erreur" + e.getMessage());
		}
	}// end getOrder

	/**
	 * v�rifie que le nouvel identifiant de consommation ne se trouve pas d�j� dans
	 * la liste, si oui on ajoute � le nombre d'unit�s aux unit�s existantes (Merge)
	 * pour cette consommation si pas on ajoute cette consommation � l'ArrayList ord
	 * (addTo)
	 * 
	 * @param ord      ArrayList qui contient la commande en cours d'encodage
	 * @param idCons   identifiant de la consommation � ajouter dans l'ArrayList ou
	 *                 � trouver s'il existe d�j�
	 * @param numbCons nombre d'unit�s consomm�es correspondant � l'identificateur
	 *                 de consommation.
	 */
	private static void addToOrMergeOrder(ArrayList<int[]> ord, int idCons, int numbCons) {

		int indexAlreadyInOrder = isAlreadyInOrder(ord, idCons);

		if (indexAlreadyInOrder == -1) { // identifiant de consommation pas d�j� dans la liste, on l'ajoute � la
											// commande en cours.

			int orderLine[] = { idCons, numbCons };// cr�ation d'un nouveau tableau (une ligne ->1 consommation)
													// � ajouter dans l'ArrayList
			ord.add(orderLine);

		} else {

			ord.get(indexAlreadyInOrder)[1] = ord.get(indexAlreadyInOrder)[1] + numbCons;
		} // endif
	}// end addToOrMergeOrder

	/**
	 * d�termine si un identifiant de consommation se trouve d�j� dans la commande
	 * en cours
	 * 
	 * @param ord    ArrayList qui contient la commande en cours d'encodage
	 * @param idCons identifiant de la consommation � trouver �ventuellement dans la
	 *               commande en cours
	 * @return -1 si pas trouv�, index position dans le tableau si trouv�
	 */
	public static int isAlreadyInOrder(ArrayList<int[]> ord, int idCons) {
		for (int i = 0; i < ord.size(); i++) {

			if (ord.get(i)[0] == idCons) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * cr�e le fichier pass� en param�tre via le chemin strPath et renvoie true si
	 * la cr�ation a r�ussi
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

	/**
	 * renvoie la date heure actuelle dans un format comme Time_form choisi et pass�
	 * en param�tre
	 * 
	 * @param Time_form
	 * @return
	 */
	public static String getActualFormattedDateTime(String Time_form) {

		SimpleDateFormat SmplDateFrmt = new SimpleDateFormat(Time_form);
		Calendar cldr = Calendar.getInstance();
		return SmplDateFrmt.format(cldr.getTime());
	}// end getActualFormattedDateTime

}
