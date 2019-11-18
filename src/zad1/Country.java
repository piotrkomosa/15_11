package zad1;

public class Country {
    private String code;
    private String name;
    private int population;
    public Country(String code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String id) {
        this.code = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    @Override
    public String toString() {
        return name+"("+code+")"+ " ma "+ population + " ludności";
    }
}
