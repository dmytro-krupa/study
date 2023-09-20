package lec15.factory;

import lec15.factory.toys.Car;
import lec15.factory.toys.House;

public class FactoryMain {
    public static void main(String[] args) {
        ToyFactory factory = new PlasticFactory();
        //List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();



        Car car = factory.getCar();
        House house = factory.getHouse();

        System.out.println(car.getName());
        System.out.println(house.getName());

    }
}
