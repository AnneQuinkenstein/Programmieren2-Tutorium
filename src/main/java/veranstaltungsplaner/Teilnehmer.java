package veranstaltungsplaner;

public class Teilnehmer {

    // TODO Klassenvariablen (globale Variablen) für vorname, nachname & Geburtsjahr definieren

    private String vorname;
    private String nachname;
    private final int geburtsjahr;

    public Teilnehmer(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    // TODO implementiere equals Methode

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (o == null || o.getClass() != this.getClass()) return false;

        Teilnehmer that = (Teilnehmer) o;
        return(that.geburtsjahr == this.geburtsjahr
            && that.nachname.equals(this.nachname)
            && that.vorname.equals(this.vorname));
    }

    // TODO implementiere hashCode Methode



    // TODO Methode zur Ausgabe eines Teilnehmers als String

    @Override
    public String toString() {
        String s = String.format("%s %s, %d",this.vorname, this.nachname, this.geburtsjahr);
        return s;
    }

    //  (siehe Screenshot in der Aufgabenbeschreibung)

}
