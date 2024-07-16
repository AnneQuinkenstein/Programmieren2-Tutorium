package weitereUebungen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusterLoesungConvertInput {

    private final Map<Integer, String> translations;

    public MusterLoesungConvertInput() {
        this.translations = new HashMap<>();
        translations.put(0, "null");
        translations.put(1, "eins");
        translations.put(2, "zwei");
        translations.put(3, "drei");
        translations.put(4, "vier");
        translations.put(5, "fünf");
        translations.put(6, "sechs");
        translations.put(7, "sieben");
        translations.put(8, "acht");
        translations.put(9, "neun");
        translations.put(10, "zehn");
    }

    public String convert(List<String> input) {
        StringBuilder result = new StringBuilder();
        for (String s : input) {
            try {
                int i = Integer.parseInt(s);
                result.append(translations.get(i));
            } catch (NumberFormatException e) {
                result.append(s);
            }
        }

        return result.toString();
    }

}
