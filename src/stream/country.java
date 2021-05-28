package stream;

public class country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private double population;
    private double gnp;
    private int capital;

    public country(String code,String name,String continent,double surfaceArea,double population,double gnp,int capital){
        this.code=code;
        this.name=name;
        this.continent=continent;
        this.surfaceArea=surfaceArea;
        this.population=population;
        this.gnp=gnp;
        this.capital=capital;

    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    public double getGnp() {
        return gnp;
    }

    public int getCapital() {
        return capital;
    }
}
