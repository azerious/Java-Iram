import java.text.SimpleDateFormat;
import java.util.Calendar;

public class introduction_datetime {
	public static void main(String[] args) {
		int intHour; // r�cup�ration de l'heure du jour 5 formats de date diff�rents
		SimpleDateFormat SmplDateFrmt1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		SimpleDateFormat SmplDateFrmt2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

		SimpleDateFormat SmplDateFrmt3 = new SimpleDateFormat("dd/MM/yy hh:mm a");

		SimpleDateFormat SmplDateFrmt4 = new SimpleDateFormat("dd/MM/yy HH:mm:ss.SSS ");

		SimpleDateFormat SmplDateFrmt5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		SimpleDateFormat SmplDateFrmt6 = new SimpleDateFormat("yyyy-MM-dd HH'h'mm:ss");
		Calendar cldr1 = Calendar.getInstance(); // instanciation d'une classe Calendar
		Calendar cldr2, cldr3;
		System.out.println("Current Date & Time without format: " + cldr1.getTime());

		System.out.println("Current Date & Time format 1 " + SmplDateFrmt1.format(cldr1.getTime())); // Format 12h

		System.out.println("Current Date & Time format 2: " + SmplDateFrmt2.format(cldr1.getTime())); // Format 24h

		System.out.println("Current Date & Time format 3: " + SmplDateFrmt3.format(cldr1.getTime())); // Format 12 + AM/PM

		System.out.println("Current Date & Time format 4: " + SmplDateFrmt4.format(cldr1.getTime())); // Format avec milisecond

		System.out.println("Current Date & Time format 5: " + SmplDateFrmt5.format(cldr1.getTime())); // Test remplacement / par -

		System.out.println("Current Date & Time format 6: " + SmplDateFrmt6.format(cldr1.getTime())); // Utilisation de characters particulers (h) via ''

		System.out.println("Ann�e : " + cldr1.get(Calendar.YEAR)); // Donne l'ann�e actuelle

		System.out.println("Ann�e : " + cldr1.get(1)); // Donne l'ann�e

		System.out.println("Mois : " + cldr1.get(Calendar.MONTH)); // Donne le mois actuel en chiffre ATTENTION COMMENCE A 0

		System.out.println("Mois : " + cldr1.get(2)); // Donne le mois actuel 

		System.out.println("Jour du mois : " + cldr1.get(Calendar.DAY_OF_MONTH)); // Donne le jour actuel en chiffre

		System.out.println("Heure du jour : " + cldr1.get(Calendar.HOUR_OF_DAY)); // Donne l'heure actuel format 24h

		System.out.println("Minute : " + cldr1.get(Calendar.MINUTE));  // Donne les minutes actuelles

		System.out.println("Seconde : " + cldr1.get(Calendar.SECOND)); // Donne les secondes actuelles

		System.out.println("Milliseconde : " + cldr1.get(Calendar.MILLISECOND)); // Donne les milisecondes actuelles

		intHour = cldr1.get(Calendar.HOUR_OF_DAY);
		System.out.println("On a r�cup�r� l'heure du jour dans une variable : " + intHour);

		cldr2 = cldr1; // copie de cldr1 dans cldr2 avant le add
		cldr3 = (Calendar) cldr1.clone(); // copie de cldr1 dans cldr3 avant le add
		cldr1.add(Calendar.HOUR_OF_DAY, 3);
		System.out.println("\nIn 3 hours Date & Time will be : " + SmplDateFrmt2.format(cldr1.getTime()));

//illustration de la diff�rence entre cldr2 = cldr1 et cldr3 = (Calendar) cldr1.clone()
		System.out.println("Calendrier 2 : Current Date & Time format 2 : " + SmplDateFrmt2.format(cldr2.getTime())
				+ " Oupssssss cldr2 impact� par le add de cldr1 !!????");

		System.out.println("Calendrier 3 Current Date & Time format 2 : " + SmplDateFrmt2.format(cldr3.getTime())
				+ " cldr3 pas impact� par le add de cldr1 !!");
	}
}