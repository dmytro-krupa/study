package lec12.cloned;


public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Dmytro");

        Car a = new Car("Audi", 700, driver);

        Car b = a.clone();

        a.setBrand("Kia");
        a.setPower(1000);
        a.getDriver().setName("Igor");

        System.out.println(a);
        System.out.println(b);
    }
}
