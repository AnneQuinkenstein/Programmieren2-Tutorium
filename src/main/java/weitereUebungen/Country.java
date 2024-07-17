package weitereUebungen;
//Erstelle eine Klasse Country mit den Attributen name und population und erzeuge eine Liste von Country-Objekten aus der Map.

public class Country implements Comparable<Country>{

    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int compareTo(Country o) {
        if (this.population == o.population) {
            return this.name.compareTo(o.name);
           // return 0;
        } else if (this.population > o.population) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Country{" +
            "name='" + name + '\'' +
            ", population=" + population +
            '}';
    }
}
