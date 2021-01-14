package lec15.factory.toys;

public class WoodenCar implements Car{
    public String name = "WoodenCar";

    @Override
    public String getName() {
        return name;
    }
}
