package citiesTask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
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
        cities.sort((city1, city2) -> city2.getName().compareToIgnoreCase(city1.getName()));
        cities.sort((city1, city2) -> city2.getDistrict().compareToIgnoreCase(city1.getDistrict())); //раскоментить чтобы было по двум полям
        for (City city : cities) {
            System.out.println(city);
        }
    }
}