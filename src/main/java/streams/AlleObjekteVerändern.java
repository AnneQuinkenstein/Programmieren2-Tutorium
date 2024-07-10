package streams;

import java.util.Arrays;
import java.util.List;

public class AlleObjekteVerändern {

    public static void main(String[] args) {

       //Schreiben Sie ein Programm, das alle Zahlen in Strings umwandelt.
        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
        /*List<String> zahlenAlsString = // Implementierung hier
            System.out.println(zahlenAlsString);*/

        List<String> zahlenAlsString = zahlen.stream().map(integer->integer.toString()).toList();
        System.out.println(zahlenAlsString);

        //Schreiben Sie ein Programm, das alle Strings in Großbuchstaben umwandelt.
        List<String> woerter = Arrays.asList("hund", "katze", "vogel");
       /* List<String> woerterGross = // Implementierung hier
            System.out.println(woerterGross); */

        List<String> woerterGross = woerter.stream().map(wort -> wort.toUpperCase()).toList();
        System.out.println(woerterGross);

        //Schreiben Sie ein Programm, das den Preis jedes Produkts um 10% erhöht.
        List<Produkt> produkte = Arrays.asList(
            new Produkt("Laptop", 1000),
            new Produkt("Maus", 50),
            new Produkt("Tastatur", 70)
        );
        /*List<Produkt> erhoehtePreise = // Implementierung hier
            System.out.println(erhoehtePreise);*/

        List<Produkt> erhoehtePreise = produkte.stream().map(produkt -> produkt.erhoehePreis(10.0)).toList();
        System.out.println(erhoehtePreise);
    }
}
