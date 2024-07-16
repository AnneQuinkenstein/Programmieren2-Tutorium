import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import weitereUebungen.ConvertInput;

class ConvertInputTest {

    public static Stream<Object[]> getAllScores() {
        return Stream.of(new Object[][]{
                {Arrays.asList("A"), "A"},
                {Arrays.asList("1"), "eins"},
                {Arrays.asList("Sommer"), "Sommer"},
                {Arrays.asList("4","6","7"), "viersechssieben"},
                {Arrays.asList("4","sommer","7"), "viersommersieben"},
                {Arrays.asList("9","5","8"), "neunfünfacht"},
                {Arrays.asList("9","2","8"), "neunzweiacht"},
                {Arrays.asList("3","2","8"), "dreizweiacht"},
                {Arrays.asList("Prüfung","2","Studium"), "PrüfungzweiStudium"},
                {Arrays.asList("Prüfung","0","Studium"), "PrüfungnullStudium"},

        });
    }

    @ParameterizedTest
    @MethodSource("getAllScores")
    public void parameterizedTest(List<String> input, String expected) {
      ConvertInput converter = new ConvertInput();
        assertEquals(expected, converter.convert(input));
    }

}