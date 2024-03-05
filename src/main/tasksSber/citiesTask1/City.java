package citiesTask1;

public class City {
    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + this.name + '\'' +
                ",region='" + this.region + '\'' +
                ",district='" + this.district + '\'' +
                ",population=" + this.population +
                ",foundation='" + this.foundation + '\'' +
                '}';
    }
}
