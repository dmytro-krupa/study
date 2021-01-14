package lec15.factory;

import lec15.factory.toys.Car;
import lec15.factory.toys.House;

public interface ToyFactory {
    Car getCar();
    House getHouse();
}
