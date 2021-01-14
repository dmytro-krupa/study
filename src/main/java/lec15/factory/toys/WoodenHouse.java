package lec15.factory.toys;

public class WoodenHouse implements House{
    public String name = "WoodenHouse";

    @Override
    public String getName() {
        return name;
    }
}
