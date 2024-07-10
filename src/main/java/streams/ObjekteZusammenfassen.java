package streams;

import java.util.Arrays;
import java.util.List;

public class ObjekteZusammenfassen {
    public static void main(String[] args) {
        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
       /* int summe = // Implementierung hier
            System.out.println(summe);*/
        int summe = zahlen.stream().reduce(0, (a, b) -> a + b);
        System.out.println(summe);

        List<String> woerter = Arrays.asList("Hallo", "Welt", "das", "ist", "ein", "Test");
      /*  String result = // Implementierung hier
            System.out.println(result);*/


        String result = woerter.stream().reduce("", (a, b) -> a + " " + b);
        System.out.println(result);


        List<Person> personen = Arrays.asList(
            new Person("Max", 17),
            new Person("Julia", 20),
            new Person("Tom", 16),
            new Person("Anna", 22)
        );
      /*  int gesamtAlter = // Implementierung hier
            System.out.println(gesamtAlter);*/

        int gesamtAlter = personen.stream().map(person -> person.getAge()).reduce(0, (a,b) -> a + b);
        System.out.println(gesamtAlter);
    }
}
