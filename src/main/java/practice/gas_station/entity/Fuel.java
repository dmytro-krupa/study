package practice.gas_station.entity;

public class Fuel {
    private String name;
    private int price;
    private int amountOfFuel;

    public Fuel() {
    }

    public Fuel(String name, int price, int amountOfFuel) {
        this.name = name;
        this.price = price;
        this.amountOfFuel = amountOfFuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
