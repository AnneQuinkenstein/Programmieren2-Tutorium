package veranstaltungsplaner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

class Event {
    // TODO Klassenvariablen (globale Variablen) für name, date und teilnehmer (Set) definieren

    private String name;
    private LocalDate date;
    private Set<Teilnehmer> teilnehmerSet;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
        this.teilnehmerSet = new HashSet<>();
    }

    // TODO implementiere Methode zum Hinzufügen von einen Teilnehmer

    public void teilnehmerHinzufuegen(Teilnehmer teilnehmer) {
        this.teilnehmerSet.add(teilnehmer);
    }

    // TODO implementiere Methode zum Hinzufügen von mehreren Teilnehmer

    public void mehrereTeilnehmerHinzufuegen(HashSet teilnehmerGruppe) {
        this.teilnehmerSet.addAll(teilnehmerGruppe);
    }

    // TODO implementiere Methode zum Entfernen eines Teilnehmers

    public void teilnehmerEntfernen(Teilnehmer teilnehmer) {
        this.teilnehmerSet.remove(teilnehmer);
    }

    // TODO implementiere Methode zum Entfernen mehrerer Teilnehmer

    public void mehrereTeilnehmerEntfernen(HashSet teilnehmerGruppe) {
        this.teilnehmerSet.removeAll(teilnehmerGruppe);
        }

    // TODO Ausgabe eines Events und der zugehörigen Teilnehmer als String


    //  (siehe Screenshot in der Aufgabenbeschreibung)
}
