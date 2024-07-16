package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {
        // Erstellen Sie eine Liste mit Integer-Werten
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = List.of("Hallo", "Welt", "Streams", "sind", "toll", "Java");
        List<Integer> mixedNumbers = List.of(-1, 2, -3, 4, -5, 6, -7, 8, -9, 10);
       List<Person> people = Arrays.asList(new Person("Anna", 26), new Person("Alice", 45), new Person("Bahar", 17), new Person("Charlie", 26));

        // Die Methode gibt eine neue Liste zurück in der die Werte jeweils mit 2 multipliziert wurden.
       List<Integer> resultNum = multiplyByTwo(numbers);
        System.out.println("Multiply by Two: " + resultNum);
        

        // Nutzen Sie die Stream API um eine Liste zu erzeugen in der jeweils ein Sternchen * an die Strings angehängt wurde.
        List<String> resultString = appendStar(strings);
        System.out.println("Sternchen an String: " + resultString);

        //  Nutzen Sie die Stream API um eine Liste zu erzeugen in der nur Strings mit mindestens 6 Zeichen enthalten sind.
       List<String> longStrings = filterLongStrings(strings);
        System.out.println("Strings mit mind. 6 Zeichen: " + longStrings);

        // Nutzen Sie die Stream API um eine Liste nur mit den geraden Integers zurückzugeben..
       List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Liste mit geraden Integers: " + evenNumbers);

        // Nutzen Sie die Stream API um eine Liste nur mit den negativen Integers zurückzugeben.
      List<Integer> negativeNumbers = filterNegativeNumbers(mixedNumbers);
        System.out.println("Liste nur mit den negativen Integers: " + negativeNumbers);

        //Nutzen Sie die Stream API um die Summe aller geraden Zahlen aus der Liste zurückzugeben. (schauen Sie sich reduce() an)
        int sumOfEvenNumbers = sumOfEven(numbers);
        System.out.println("Summe aller geraden Zahlen: " + sumOfEvenNumbers);

        String addedString = sumOfStrings(strings);
        System.out.println("Summe aller Strings: " + addedString);
        //Erstelle eine neue Liste, die die Quadrate aller ungeraden Zahlen einer gegebenen Liste enthält.
     List<Integer> squaresOfOddNumbers = squaresOfOdd(numbers);
        System.out.println("Quadrate aller ungeraden Zahlen: " + squaresOfOddNumbers);

        //Erstellen Sie eine Innereklasse Person mit Namen und Alter.
        // Schreiben Sie eine Methode in der Sie per Stream API diese Liste Filtern.
        // Geben Sie die Namen aller Personen über 18 zurück
        // die mit einem der Methode als Parameter übergebenen Buchstaben anfangen
      List<String> filteredPeople = filterPeople(people, 'A');
        System.out.println("Namen aller Personen über 18 zurück, die mit A anfangen: " + filteredPeople);

        //Nutzen Sie die Klasse Person aus Aufgabe 8.
        // Nutzen Sie die Stream API um die Personen nach Alter zu gruppieren
        // und zähle, wie viele Personen es in jeder Altersgruppe gibt.
        // (Schauen Sie sich dafür collect() an und nutzen Sie in collect() Collectors.

      Map<Integer, Long> peopleByAge = groupPeopleByAge(people);
        System.out.println("wie viele Personen es in jeder Altersgruppe: " + peopleByAge);

        Map<String, Long> peopleByName = groupPeopleByName(people);
        System.out.println("wie viele Personen es in jeder Namensgruppe: " + peopleByName);
    }
    //Nutzen Sie die Klasse Person aus Aufgabe 8.
    // Nutzen Sie die Stream API um die Personen nach Alter zu gruppieren
    // und zähle, wie viele Personen es in jeder Altersgruppe gibt.
    // (Schauen Sie sich dafür collect() an und nutzen Sie in collect() Collectors.

    private static Map<Integer, Long> groupPeopleByAge(List<Person> people) {
        return people.stream()
                     .collect(Collectors.groupingBy(x->x.getAge(), Collectors.counting()));
    }

    private static Map<String, Long> groupPeopleByName(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(x->x.getName(), Collectors.counting()));
    }
    //Erstellen Sie eine Innereklasse Person mit Namen und Alter.
    // Schreiben Sie eine Methode in der Sie per Stream API diese Liste Filtern.
    // Geben Sie die Namen aller Personen über 18 zurück
    // die mit einem der Methode als Parameter übergebenen Buchstaben anfangen

    private static List<String> filterPeople(List<Person> people, char a) {
        return people.stream().filter(x->((x.getAge()>=18)&&(x.getName().charAt(0)==a)))
                         .map(x->x.getName()).collect(Collectors.toList());
    }

    //Erstelle eine neue Liste, die die Quadrate aller ungeraden Zahlen einer gegebenen Liste enthält.
    private static List<Integer> squaresOfOdd(List<Integer> numbers) {
   return numbers.stream().filter(n -> n % 2 == 1).map(x->x*x).collect(Collectors.toList());
    }

    //Nutzen Sie die Stream API um die Summe aller geraden Zahlen aus der Liste zurückzugeben. (schauen Sie sich reduce() an)
    private static int sumOfEven(List<Integer> numbers) {
        return numbers.stream().filter(x->x%2==0).reduce(0,(a,b)->(a+b));

    }

    // für strings
    private static String sumOfStrings(List<String> strings) {
        return strings.stream().reduce("", (a, b) -> (a + " " +b));
    }

    // Nutzen Sie die Stream API um eine Liste nur mit den negativen Integers zurückzugeben.

    private static List<Integer> filterNegativeNumbers(List<Integer> mixedNumbers) {
        return mixedNumbers.stream().filter(n -> n < 0).collect(Collectors.toList());
    }

    // Nutzen Sie die Stream API um eine Liste nur mit den geraden Integers zurückzugeben..
    private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
   List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
   return evenNumbers;
    }




    //  Nutzen Sie die Stream API um eine Liste zu erzeugen in der nur Strings mit mindestens 6 Zeichen enthalten sind.
    private static List<String> filterLongStrings(List<String> strings) {
   List<String> result = strings.stream().filter(s->s.length() >= 6).toList();
   return result;
    }

    // Nutzen Sie die Stream API um eine Liste zu erzeugen in der jeweils ein Sternchen * an die Strings angehängt wurde.

    private static List<String> appendStar(List<String> strings) {
    List<String>result=strings.stream()
                              .map(x->x+"*")
                              .collect(Collectors.toList());
    return result;
    }

    // Die Methode gibt eine neue Liste zurück in der die Werte jeweils mit 2 multipliziert wurden.
    // static: man kann die Methode einfach in der Main Methode aufrufen
    private static List<Integer> multiplyByTwo(List<Integer> numbers) {
       List<Integer> result=numbers.stream()
                                   .map(x->2*x)
                                   .toList();
        return result;
    }


}
