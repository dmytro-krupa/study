package lec3.ex2;

public class Audi extends Car{
    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }
}
