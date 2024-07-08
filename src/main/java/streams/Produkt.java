package streams;

public class Produkt {
    String name;
    double preis;

    Produkt(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    void erhoehePreis(double prozentsatz) {
        this.preis += this.preis * prozentsatz / 100;
    }

    @Override
    public String toString() {
        return "Produkt{name='" + name + "', preis=" + preis + '}';
    }
}