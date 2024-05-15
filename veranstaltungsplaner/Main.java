package veranstaltungsplaner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO erzeuge einen EventManager

        EventManager eventManager = new EventManager();

        // TODO erstelle 6 Teilnehmer*innen

        Teilnehmer teilnehmer1 = new Teilnehmer("Anna", "Becker", 1997);
        Teilnehmer teilnehmer2 = new Teilnehmer("Maria", "Voucheva", 1997);

        HashSet<Teilnehmer> gruppe1 = new HashSet<>();
        gruppe1.add(teilnehmer1);
        gruppe1.add(teilnehmer2);

        // TODO erstelle 3 Events und füge jeweils 2 bis 4 der Teilnehmer*innen hinzu

        Event event1 = new Event("Weihnachtsfeier", LocalDate.of(2024,12,20));
        event1.teilnehmerHinzufuegen(teilnehmer1);
        event1.mehrereTeilnehmerHinzufuegen(gruppe1);

        // TODO gib auf der Konsole eine Übersicht über alle Event & die dazugehörigen Teilnehmer*innen aus

        System.out.println(eventManager);

        // TODO Entferne aus einem Event einen Teilnehmer und entferne aus einem anderen Event zwei Teilnehmer*innen
        // mit einer Methodenaufruf

        // TODO gib nochmals auf der Konsole eine Übersicht über alle Event & die dazugehörigen Teilnehmer*innen aus
    }

    public List<Integer> entschachteln(List<List<Integer>> input) {
        // TODO gib anstelle des Inputs eine Liste aus, die alle Werte aus den verschachtelten Listen enthält zurück
        // Beispiel input: ((1,3,4),(4,6),(10),()) --> Rückgabe (1,3,4,4,6,10)
        return null;
    }


}
