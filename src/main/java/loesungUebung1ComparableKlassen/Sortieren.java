package loesungUebung1ComparableKlassen;

import java.util.Comparator;

/**
 * enthält den Sortieralgorithmus BubbleSort
 * @author elise, karenina, anne
 * 
 */

public class Sortieren {
	

	/**
	 * sortiert das Array x aufsteigend
	 * @param x das zu sortierende Array
	 * @throws NullPointerException wenn x == null
	 */
	public static void sortiere(Comparable[] x) {
		boolean unsortiert = true;
		Comparable temp;
		while (unsortiert) 
		{
			unsortiert = false;          
			for (int i = 0; i < x.length - 1; i++) 
			{
				if (x[i].compareTo(x[i + 1]) > 0) 
				{
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					unsortiert = true; 
				}
			}
		}
	} 
	
	/**
	 * sortiert das Array x absteigend
	 * @param x das zu sortierende Array
	 * @throws NullPointerException wenn x == null
	 */
	public static void sortiere(Object[] x, Comparator vergleich) {
		boolean unsortiert = true;
		Object temp;
		while (unsortiert)
		{
			unsortiert = false;
			for (int i = 0; i < x.length - 1; i++)
			{
				if (vergleich.compare(x[i],x[i + 1])<0)
				{
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					unsortiert = true;
				}
			}
		}
	}


}
