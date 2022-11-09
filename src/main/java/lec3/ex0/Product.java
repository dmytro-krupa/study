package lec3.ex0;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    public Product withPrice(double price) {
        this.price = price;
        return this;
    }
}
