package streams;

import java.util.Arrays;
import java.util.List;

public class ObjekteAussortieren {

    public static void main(String[] args) {
        //Schreiben Sie ein Programm, das alle geraden Zahlen aus der Liste entfernt.
        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // List<Integer> gefilterteZahlen =  Implementierung hier
          //  System.out.println(gefilterteZahlen);

        // Schreiben Sie ein Programm, das alle Wörter entfernt, die mit dem Buchstaben 'a' beginnen.
        List <String> woerter = Arrays.asList("Apfel", "Banane", "Ananas", "Birne", "Aprikose");
       // List<String> gefilterteWoerter = Implementierung hier
           // System.out.println(gefilterteWoerter);

        // Schreiben Sie ein Programm, das alle Produkte über 70 Euro aus der Liste entfernt.
        List<Produkt> produkte = Arrays.asList(
            new Produkt("Laptop", 1000),
            new Produkt("Maus", 50),
            new Produkt("Tastatur", 70)
        );
       // List<Produkt> gefilterteProdukte = Implementierung hier
          //  System.out.println(gefilterteProdukte);

    }
}
