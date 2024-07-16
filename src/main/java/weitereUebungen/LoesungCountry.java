package weitereUebungen;

public class LoesungCountry implements Comparable<LoesungCountry>{
    String name;
    int population;

    public LoesungCountry(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int compareTo(LoesungCountry other) {
        if(this.population == other.getPopulation())
        {
            return 0;
            //  wenn Population gleich ist, nach Namen sorieren:  return this.name.compareTo(other.getName());

        }
        else if(this.population > other.getPopulation())
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "LoesungCountry{" +
            "name='" + name + '\'' +
            ", population=" + population +
            '}';
    }
}