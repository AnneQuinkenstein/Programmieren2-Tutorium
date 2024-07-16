package loesungUebung1ComparableKlassen;

import java.util.Random;

public class Hauptklasse {

	/**
	 * sortiert einige Arrays
	 * @param args wird nicht benutzt
	 */
	public static void main(String[] args) {
		
		System.out.printf("%n%n------------------------- Rechnen -----------------------------------%n%n");
		
		Bruch b1 = new Bruch(3,7);
		Bruch b2 = new Bruch(4,8);
		Bruch b3 = new Bruch(2,5);
		Bruch b4 = new Bruch(); 
		Bruch b5 = new Bruch(7); 
		
		

		System.out.printf("%5s ausrechnen: %.2f %n", b4.toString(), b4.ausrechnen());
		System.out.printf("%5s ausrechnen: %.2f %n", b5.toString(), b5.ausrechnen());
		System.out.printf("%5s * %5s = %5s %n", b1.toString(), b3.toString(), b1.multiplizieren(b3).toString());
		System.out.printf("%5s / %5s = %5s %n", b2.toString(), b1.toString(), b2.dividieren(b1).toString());
		System.out.printf("%5s Kehrwert: %5s %n", b2.toString(), b2.kehrwert().toString());
		// Test der Exception 
		try 
		{
		Bruch b6 = new Bruch(3,0); 
		System.out.printf("%5s Bruch mit Nenner 0 %n", b6.toString());
		}
		catch(ArithmeticException e) {
			System.out.println("  Bruch(3,0): " + e.getMessage());
		}
		
		
		System.out.printf("%n%n------------------------- Sortieren -----------------------------------%n%n");
		System.out.printf("                             ---- Array 1 -----%n%n");
		Bruch[] liste1 = createBruecheArray(5); 
		System.out.print("                                 unsortiert: ");
		for (int i = 0; i < liste1.length; i++)
			System.out.print(liste1[i] + " ");
		System.out.println();
		System.out.print("                          als Dezimalzahlen: ");
		for (int i = 0; i < liste1.length; i++)
			System.out.print(liste1[i].ausrechnen() + " - ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		Sortieren.sortiere(liste1);
		System.out.print("                       aufsteigend sortiert: ");
		for (int i = 0; i < liste1.length; i++)
			System.out.print(liste1[i] + " ");
		System.out.println();
		System.out.print("                           als Dezimalzahlen: ");
		//Um Sortierung der Brüche besser nachvollziehen zu können in Dezimalzahlen umgerechnet
		for (int i = 0; i < liste1.length; i++)
			System.out.print(liste1[i].ausrechnen() + " - ");
		System.out.println();
		System.out.println();

		System.out.println();
		System.out.print("absteigend nach Diff Zähler - Nenner sortiert: ");
		Sortieren.sortiere(liste1, new BruchVergleicher());
		for (int i = 0; i < liste1.length; i++)
			System.out.print(liste1[i] + " ");
		System.out.println();
		System.out.print("         Differenz zwischen Zähler und Nenner: ");
		for (int i = 0; i < liste1.length; i++) {
			int diff = Math.abs(liste1[i].getZaehler() - liste1[i].getNenner()); 
			System.out.print(diff + " ");
		}
		System.out.println();
		
		System.out.printf("%n%n             ---- Array 2 -----%n%n");
		Bruch[] liste2 = createBruecheArray(5); 
		System.out.print("                              unsortiert: ");
		for (int i = 0; i < liste2.length; i++)
			System.out.print(liste2[i] + " ");
		System.out.println();
				
		
		System.out.print("                     aufsteigend sortiert: ");
		Sortieren.sortiere(liste2);
		for (int i = 0; i < liste2.length; i++)
			System.out.print(liste2[i] + " ");
		System.out.println();
		
		System.out.print("absteigend Diff Zähler - Nenner sortiert: ");
		Sortieren.sortiere(liste2, new BruchVergleicher());
		for (int i = 0; i < liste2.length; i++)
			System.out.print(liste2[i] + " ");
		System.out.println();
	}

	/**
	 * Array erstellen mit Brüchen mit zufälligen Werten zwischen 0 und 99 (Zähler) bzw. 1 +
	 * 100 (Nenner) 
	 * 
	 * @param int arraylänge  die Länge des Arrays muss mitgegeben werden, damit ich die flexibel anpassen kann an meine Testbedürfnisse
	 * @return Bruch[] Array gefüllt mit Brücken
	 */

	public static Bruch[] createBruecheArray(int arraylength) {
		Bruch[] brueche = new Bruch[arraylength];

		Random r = new Random();

		for (int i = 0; i < arraylength; i++) {
			brueche[i] = new Bruch(r.nextInt(100), r.nextInt(100) + 1);
		}

		return brueche;
	}
}
