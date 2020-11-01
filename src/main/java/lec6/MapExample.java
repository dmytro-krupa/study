package lec6;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        linkedHashMap.put("2","b");
        linkedHashMap.put("1","a");
        linkedHashMap.put("3","d");
        linkedHashMap.put("1","c");

        hashMap.put("2","b");
        hashMap.put("1","a");
        hashMap.put("3","d");
        hashMap.put("1","c");

        treeMap.put("2","b");
        treeMap.put("1","a");
        treeMap.put("3","d");
        treeMap.put("1","c");

        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("hashMap = " + hashMap);
        System.out.println("treeMap = " + treeMap);




        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1000, 2001, "A"));
        cars.add(new Car(3500, 2007, "C"));
        cars.add(new Car(7500, 2005, "B"));

        Map<String, Car> carMap = new TreeMap<>();

        carMap.put(cars.get(0).carBrand, cars.get(0));
        carMap.put(cars.get(1).carBrand, cars.get(1));
        carMap.put(cars.get(2).carBrand, cars.get(2));



        System.out.println("carMap = " + carMap);

    }
}
