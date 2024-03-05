package citiesTask4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new LinkedList<>();

        try {
            File file = new File("C:\\Users\\Dimas\\Desktop\\Задача ВС Java Сбер.csv"); // Путь до файла
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                cities.add(new City(fields[1], fields[2], fields[3], Integer.parseInt(fields[4]), fields[5]));
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Integer> regionCounts = new HashMap<>();
        for (City city : cities) {
            regionCounts.put(city.getRegion(), regionCounts.getOrDefault(city.getRegion(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : regionCounts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}