package streams;

import java.util.Arrays;
import java.util.List;

public class ObjekteSortieren {

    public static void main(String[] args) {
        List<Integer> zahlen = Arrays.asList(5, 2, 9, 1, 5, 6);
      /*  List<Integer> sortierteZahlen = // Implementierung hier
            System.out.println(sortierteZahlen);*/

        List<Integer> sortierteZahlen = zahlen.stream().sorted().toList();
        System.out.println(sortierteZahlen);

        List<String> woerter = Arrays.asList("Banane", "Apfel", "Ananas", "Birne");
      /*  List<String> sortierteWoerter = // Implementierung hier
            System.out.println(sortierteWoerter);*/

        List<String> sortierteWoerter = woerter.stream().sorted().toList();
        System.out.println(sortierteWoerter);

        List<Person> personen = Arrays.asList(
            new Person("Max", 17),
            new Person("Julia", 20),
            new Person("Tom", 16),
            new Person("Anna", 22)
        );

        /*  List<Person> sortiertePersonen = // Implementierung hier
                System.out.println(sortiertePersonen);*/

        //List<Person> sortiertePersonen = personen.stream().sorted((person1, person2) -> person1.compareTo(person2)).toList();
        List<Person> sortiertePersonen = personen.stream().sorted().toList();
        System.out.println(sortiertePersonen);
    }
}
