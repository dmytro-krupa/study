package lec15.factory;

import lec15.factory.toys.Car;
import lec15.factory.toys.House;
import lec15.factory.toys.WoodenCar;
import lec15.factory.toys.WoodenHouse;

public class WoodFactory implements ToyFactory{
    @Override
    public Car getCar() {
        return new WoodenCar();
    }

    @Override
    public House getHouse() {
        return new WoodenHouse();
    }
}
