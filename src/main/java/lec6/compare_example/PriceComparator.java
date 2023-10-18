package lec6.compare_example;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getPrice() == o2.getPrice()){
            return Integer.compare(o1.getYear(), o2.getYear());
        } else {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
