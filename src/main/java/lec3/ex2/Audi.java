package lec3.ex2;

public class Audi extends Car{
    public void audi(){
        System.out.println("oooo");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Audi start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }
}
