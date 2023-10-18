package lec6.compare_example;

public class Car implements Comparable<Car>{
    private int price;
    private int year;
    private String id;

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.year, o.year);
    }

    public Car(int price, int year, String id) {
        this.price = price;
        this.year = year;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", year=" + year +
                ", id='" + id + '\'' +
                '}';
    }
}
