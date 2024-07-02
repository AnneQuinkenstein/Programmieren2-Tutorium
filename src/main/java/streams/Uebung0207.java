package streams;

import static java.util.stream.Collector.*;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Uebung0207 {

   /* Schreiben Sie eine Funktion, die einen IntStream mit den Potenzen von 2
    zurückgibt, solange sie in eine int-Variable passen (20…230).
    public static IntStream powersOfTwo()
    Folgende Stream-Methoden könnten nützlich sein: iterate, limit, range, map.*/

    public static IntStream powersOfTwo() {
       return IntStream.range(4, 9).map(x -> (int)Math.pow(2.0, x))
                                        .filter(x -> x >= 20 && x <= 230);
    }


    public static List<Integer> powersOfTwoList() {
        return IntStream.range(4, 9).map(x -> (int)Math.pow(2.0, x))
                        .filter(x -> x >= 20 && x <= 230)
                         .boxed()
                        //.boxed() hinzugefügt, um aus einem IntStream einen Stream<Integer> zu machen.
                        //Eine Collection (Liste) geht nicht mit primitiven Datentypen (int) nur Integer.
                        //.map(x-> Integer.valueOf(x)) geht nicht->
                        // map wird nur für int-zu-int-Mapping benutzt, deswegen hat das nicht funktioniert. Es gäbe mapToObj
                        // .mapToObj(x -> Integer.valueOf(x))
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Print des gesamten IntSteams: " + powersOfTwo());
        powersOfTwo().forEach(x -> System.out.println("hier wird aus dem IntStream geprintet: " + x));

        System.out.println("Print der gesamten Liste: " + powersOfTwoList());
    }

}
