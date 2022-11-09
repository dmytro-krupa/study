package lec12.cloned;

public class Car {
    private String brand; //Audi
    private int power; //700
    private Driver driver; //Dmytro

    public Car clone(){
        Car cloned = new Car();

        cloned.setBrand(this.getBrand());
        cloned.setPower(this.getPower());
        cloned.setDriver(this.getDriver().clone());

        return cloned;
    }

    public Car(String brand, int power, Driver driver) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", driver=" + driver +
                '}';
    }
}
