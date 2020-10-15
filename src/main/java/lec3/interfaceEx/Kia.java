package lec3.interfaceEx;

public class Kia implements Car {
    @Override
    public int speed() {
        return 60;
    }

    @Override
    public int maxSpeed() {
        return 280;
    }

    @Override
    public void stop() {
        System.out.println("STOP IT!!!!!!!");
    }

    @Override
    public String serialNumber() {
        return "gegetg4444g5g5g";
    }

    public String customMethod(){
        return "custom string";
    }
}
