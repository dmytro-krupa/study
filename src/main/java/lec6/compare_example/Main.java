package lec6.compare_example;

import lec8.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10_000, 2023, "car 1");
        Car car2 = new Car(30_000, 2000, "car 2");
        Car car3 = new Car(20_000, 2015, "car 3");
        Car car4 = new Car(20_000, 2020, "car 4");
        Car car5 = new Car(20_000, 2010, "car 5");


        Set<Car> cars = new TreeSet<>(new PriceComparator());
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        System.out.println(cars);

        System.out.println();
        System.out.println();



        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        System.out.println(carList);

        Collections.sort(carList);

        System.out.println(carList);
        Collections.sort(carList, new PriceComparator());

        System.out.println(carList);

    }
}
