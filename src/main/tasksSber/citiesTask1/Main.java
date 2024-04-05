package citiesTask1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<City> cities = new ArrayList<>();
        try {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("Tasks.csv");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                cities.add(new City(fields[1], fields[2], fields[3], Integer.parseInt(fields[4]), fields[5]));
            }
            scanner.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (City city1 : cities) {
            System.out.println(city1);
        }
    }

    public static class City {
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
}