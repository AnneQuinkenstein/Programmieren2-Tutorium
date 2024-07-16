package weitereUebungen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoesungUebungMapComparable {
    public static void main(String[] args) {
      Map<String, Integer> population = new HashMap<>();
        population.put("USA", 328_000_000);
        population.put("China", 1_440_000_000);
        population.put("India", 1_380_000_000);
        population.put("Germany", 83_000_000);
        population.put("France", 67_000_000);
        population.put("UK", 66_000_000);
        population.put("Italy", 60_000_000);
        population.put("Chile", 19_000_000);
        population.put("Rumania", 19_000_000);

        //Iteriere über die Map-Einträge (Entry) und gib Schlüssel und Wert jedes Eintrags aus.
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        //Erstelle eine Klasse Country mit den Attributen name und population und erzeuge eine Liste von Country-Objekten aus der Map.
        List<LoesungCountry> countries = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            countries.add(new LoesungCountry(entry.getKey(), entry.getValue()));
        }
        //Implementiere Comparable in Countrys nach Bevölkerungszahl.

        //Sortiere die Liste mit Country Objekten
        countries.sort((c1, c2) -> c1.compareTo(c2));

        System.out.println("Sorted by population:");
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //Geht das auch mit Stream?
        countries.stream()
                 .sorted()
                 .forEach(s -> System.out.println(s));
    }

}
