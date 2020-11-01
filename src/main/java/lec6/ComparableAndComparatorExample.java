package lec6;

import lec2.OOPExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1000, 2001, "A"));
        cars.add(new Car(7500, 2005, "B"));
        cars.add(new Car(3500, 2008, "C"));

/*
    !!!!!!!! all elements in the list must implement the Comparable interface


    compareTo повертає 0 коли об'єкти рівні
    число > 0 коли this більший ніж параметр
    число > 0 коли this менший ніж параметр
 */



        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, new CarYearComparator());
        Collections.sort(cars);

        System.out.println(cars);

    }


}
