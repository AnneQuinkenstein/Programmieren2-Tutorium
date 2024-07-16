package weitereUebungen;

import java.util.HashMap;
import java.util.Map;

public class UebungMapComparable {
    public static void main(String[] args) {
      Map<String, Integer> population = new HashMap<>();
        population.put("USA", 328_000_000);
        population.put("China", 1_440_000_000);
        population.put("India", 1_380_000_000);
        population.put("Germany", 83_000_000);
        population.put("France", 67_000_000);
        population.put("UK", 66_000_000);
        population.put("Italy", 60_000_000);

        //Iteriere über die Map-Einträge (Entry) und gib Schlüssel und Wert jedes Eintrags aus.

        //Erstelle eine Klasse Country mit den Attributen name und population und erzeuge eine Liste von Country-Objekten aus der Map.

        //Implementiere Comparable in Countrys und vergleiche nach Bevölkerungszahl (Zusatz: wenn Bevölerung gleich ist, nach Name)

        //Sortiere die Liste mit Country Objekten

        //Geht das auch mit Stream?
    }

}
