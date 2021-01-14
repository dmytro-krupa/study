package lec15.factory;

import lec15.factory.toys.Car;
import lec15.factory.toys.House;
import lec15.factory.toys.PlasticCar;
import lec15.factory.toys.PlasticHouse;

public class PlasticFactory implements ToyFactory{
    @Override
    public Car getCar() {
        return new PlasticCar();
    }

    @Override
    public House getHouse() {
        return new PlasticHouse();
    }
}
