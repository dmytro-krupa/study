package lec3.interfaceEx;

public class CarInterfaceExample {
    public static void main(String[] args) {
        Car car = new Kia();

        System.out.println(car.maxSpeed());
        System.out.println(car.serialNumber());
        System.out.println(car.speed());

        car.stop();
    }
}
