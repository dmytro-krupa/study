package lec15.factory.toys;

public class PlasticCar implements Car{
    public String name = "PlasticCar";

    @Override
    public String getName() {
        return name;
    }
}
