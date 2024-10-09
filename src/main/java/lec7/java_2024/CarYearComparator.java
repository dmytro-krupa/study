package lec7.java_2024;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.year > o2.year) {
            return 1;
        }

        if (o1.year < o2.year) {
            return -1;
        }

        return 0;
    }
}
