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
                                        //.collect(Collectors.toList());
    }

    public static void main(String[] args) {
        powersOfTwo().forEach(x -> System.out.println(x));

    }

}
