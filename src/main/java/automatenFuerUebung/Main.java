package automatenFuerUebung;


/**
 * Test für automatenFuerUebung.EndlicherAutomat
 * 
 * @author Dorothea Hubrich
 *
 */
public class Main {
	/**
	 * Testet mit Hilfe des Variablennamen-Automatens die G�ltigkeit einiger
	 * Namen f�r Variablen,
	 * im Anschluss wird ein allgemeiner Automat f�r die Sprache "W�rter
	 * aus den Buchstaben a und b, die auf a enden" gebaut; einige W�rter
	 * werden damit gepr�ft.
	*/
	public static void main(String[] args)
	{
		EndlicherAutomat va = new VariablennameAutomat();
		//der Automat prüft auf gültige Variablennamen in C
		/*System.out.println(va.testen("abc"));  //true
		System.out.println(va.testen("1abc"));  //false
		System.out.println(va.testen("a"));  //true
		System.out.println(va.testen("_a_b_c"));  //true
		System.out.println(va.testen("ha.llo"));  //false
		
		va = new AllgemeinerAutomat(new String[] {"a->1, b->0","a->1, b->0"}, new int[] {1});
		//der Automat prüft, ob ein Wort nur aus den Buchstaben a und b besteht und auf a endet
		System.out.println("ab " + va.testen("ab")); //false
		System.out.println("aba " + va.testen("aba"));  //true
		System.out.println("a " + va.testen("a"));  //true
		System.out.println("aabbaa " + va.testen("aabbaa"));  //true
		System.out.println("acb " + va.testen("acb"));   //false
		*/
	}

}
