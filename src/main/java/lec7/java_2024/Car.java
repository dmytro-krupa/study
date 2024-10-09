package lec7.java_2024;

public class Car implements Comparable<Car> {
    public int price;
    public int year;
    public String carBrand;

    public Car(int price, int year, String carBrand) {
        this.price = price;
        this.year = year;
        this.carBrand = carBrand;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    //this.compareTo(car)

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