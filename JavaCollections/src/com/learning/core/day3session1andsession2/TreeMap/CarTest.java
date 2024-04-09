package com.learning.core.day3session1andsession2.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import com.learning.core.day3session1andsession2.TreeMap.Car;

public class CarTest {
    public static void main(String[] args) {
        TreeMap<String, Double> car = new TreeMap<String, Double>();
        car.put("Bugatti", 80050.0);
        car.put("Swift", 305000.0);
        car.put("Audi", 600100.0);
        car.put("Benz", 900000.0);

        TreeMap<Car, Double> carMap = new TreeMap<>(Comparator.comparing(Car::getPrice).reversed().thenComparing(Car::getName));

        for (Map.Entry<String, Double> entry : car.entrySet()) {
            String name = entry.getKey();
            Double price = entry.getValue();
            carMap.put(new Car(name, price), price);
        }
        for (Map.Entry<String, Double> entry : car.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            Car car1 = entry.getKey();
            Double price = entry.getValue();
            System.out.println(car1.getName() + " " + price);
        }
        Map.Entry<Car, Double> highEntry = carMap.firstEntry();
        System.out.println(highEntry);
        Map.Entry<Car, Double> lowEntity = carMap.lastEntry();
        System.out.println(lowEntity);
        Map.Entry<Car, Double> removeHighEntry = carMap.pollFirstEntry();
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            Car car1 = entry.getKey();
            Double price = entry.getValue();
            System.out.println(car1.getName() + " " + price);
        }
        String newName = "Reva";
        for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
            if (entry.getValue().equals(80050.0)) { // Find the entry with the value 80050.0
                Car car1 = entry.getKey(); // Get the corresponding key
                car1.setName(newName); // Update the key's name
                Double price = entry.getValue();
                System.out.println(car1.getName() + " " + price);
                break; // Break the loop once the replacement is done
            }
        }
    }

}
