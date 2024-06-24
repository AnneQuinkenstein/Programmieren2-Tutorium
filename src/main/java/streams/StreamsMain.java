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
      //List<Person> people = Arrays.asList(new Person("Anna", 26), new Person("Alice", 45), new Person("Bahar", 17), new Person("Charlie", 26));

        // Die Methode gibt eine neue Liste zurück in der die Werte jeweils mit 2 multipliziert wurden.
      /*  List<Integer> resultNum = multiplyByTwo(numbers);
        System.out.println(resultNum);*/

        // Nutzen Sie die Stream API um eine Liste zu erzeugen in der jeweils ein Sternchen * an die Strings angehängt wurde.
        /*List<String> resultString = appendStar(strings);
        System.out.println(resultString);
*/
        //  Nutzen Sie die Stream API um eine Liste zu erzeugen in der nur Strings mit mindestens 6 Zeichen enthalten sind.
       /* List<String> longStrings = filterLongStrings(strings);
        System.out.println(longStrings);
*/
        // Nutzen Sie die Stream API um eine Liste nur mit den geraden Integers zurückzugeben..
       /* List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println(evenNumbers);*/

        // Nutzen Sie die Stream API um eine Liste nur mit den negativen Integers zurückzugeben.
      /*  List<Integer> negativeNumbers = filterNegativeNumbers(mixedNumbers);
        System.out.println(negativeNumbers);*/

        //Nutzen Sie die Stream API um die Summe aller geraden Zahlen aus der Liste zurückzugeben. (schauen Sie sich reduce() an)
   /*     int sumOfEvenNumbers = sumOfEven(numbers);
        System.out.println(sumOfEvenNumbers);*/

        //Erstelle eine neue Liste, die die Quadrate aller ungeraden Zahlen einer gegebenen Liste enthält.
     /*   List<Integer> squaresOfOddNumbers = squaresOfOdd(numbers);
        System.out.println(squaresOfOddNumbers);*/

        //Erstellen Sie eine Innereklasse Person mit Namen und Alter.
        // Schreiben Sie eine Methode in der Sie per Stream API diese Liste Filtern.
        // Geben Sie die Namen aller Personen über 18 zurück
        // die mit einem der Methode als Parameter übergebenen Buchstaben anfangen
      /*  List<String> filteredPeople = filterPeople(people, 'A');
        System.out.println(filteredPeople);*/

        //Nutzen Sie die Klasse Person aus Aufgabe 8.
        // Nutzen Sie die Stream API um die Personen nach Alter zu gruppieren
        // und zähle, wie viele Personen es in jeder Altersgruppe gibt.
        // (Schauen Sie sich dafür collect() an und nutzen Sie in collect() Collectors.

      /*  Map<Integer, Long> peopleByAge = groupPeopleByAge(people);
        System.out.println(peopleByAge);*/

    }




}
