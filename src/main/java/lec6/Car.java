package lec6;

import java.util.Comparator;
import java.util.Iterator;

public class Car implements Comparable<Car> , Iterable<Car>{
    public int price;
    public int year;
    public String carBrand;

    public Car(int price, int year, String carBrand) {
        this.price = price;
        this.year = year;
        this.carBrand = carBrand;
    }

    @Override
    public Iterator<Car> iterator() {
        return null;
    }

    @Override
    public int compareTo(Car car) {
        if (this.price > car.price) {
            return 1;
        }

        if (this.price < car.price) {
            return -1;
        }

        return 0;
    }


    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", year=" + year +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }

}