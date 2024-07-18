package weitereUebungen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
        population.put("Chile", 19_000_000);
        population.put("Rumania", 19_000_000);

        //Iteriere über die Map-Einträge (Entry) und gib Schlüssel und Wert jedes Eintrags aus.
        for(Map.Entry<String, Integer> entry: population.entrySet())
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
        // values verändern
        for(Map.Entry<String, Integer> entry: population.entrySet())
        {
            population.put(entry.getKey(), entry.getValue()+1);
            System.out.println(entry.getKey() +" "+ entry.getValue());


        }
        System.out.println(population.keySet()+" "+ population.values());

         Set<String> countries = population.keySet();

         //für den Iterator gibt es spezielle Methoden um die Elemente der Collection zu bearbeiten
      //die, die wir kennengelernt haben, ist entfernen/ remove (deswegen habe ich die Aufgabe umformuliert)

      //Entferne alle Länder, die mit "G" beginnen.
      Iterator<String> iterator = countries.iterator();
      while(iterator.hasNext())
      {
        if (iterator.next().startsWith("G"))
        {
          iterator.remove();
        }
      }
      System.out.println(countries);


        Set<String> country =countries.stream().map(a-> a.toUpperCase()).collect(Collectors.toSet());
        System.out.println(country);

        //Erstelle eine Klasse Country mit den Attributen name und population und erzeuge eine Liste von Country-Objekten aus der Map.

        Country germany= new Country("Germany", 83_000_000);
        List<Country> countryList = new ArrayList<>();
        countryList.add(germany);
        for(Map.Entry<String, Integer> entry: population.entrySet())
        {
            countryList.add(new Country(entry.getKey(), entry.getValue()));
        }
        System.out.println(countryList);

        //Implementiere Comparable in Countrys und vergleiche nach Bevölkerungszahl (Zusatz: wenn Bevölerung gleich ist, nach Name)

        //Sortiere die Liste mit Country Objekten

        countryList.sort((c1,c2)-> c1.compareTo(c2));
        System.out.println(countryList);

        //Geht das auch mit Stream?

        List<Country> stream =countryList.stream().sorted().toList();
        System.out.println(stream);

    }

}
