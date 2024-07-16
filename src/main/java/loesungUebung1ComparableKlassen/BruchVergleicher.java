package loesungUebung1ComparableKlassen;

import java.util.Comparator;


public class BruchVergleicher implements Comparator <Bruch> {
/**
 * Vergleicht die (absolute) Differenz aus Zähler und Nenner.
 * @author elise, karenina, anne 
 * @param Bruch, Bruch
 * @return int Zahl, die bestimmt ob Bruch kleiner, größer oder gleich 
 * 
 */
	@Override
	public int compare(Bruch a, Bruch b) {
		
		if(a instanceof Bruch && b instanceof Bruch)
	{
		double diffA = Math.abs(((Bruch) a).getZaehler() - ((Bruch) a).getNenner());
		double diffB = Math.abs(((Bruch) b).getZaehler() - ((Bruch) b).getNenner());
		
		if(diffA > diffB) 
			return 1;
		else if(diffA < diffB) 
			return -1;
		else 
			return 0;
	}
	else
	{
		throw new IllegalArgumentException();
	}
}

}
