package stream;

public class city {
    private int id;
    private String name;
    private int population;
    private String countryCode;

    public city(int id,String name,int population,String countryCode){
        this.id=id;
        this.name=name;
        this.population=population;
        this.countryCode=countryCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
