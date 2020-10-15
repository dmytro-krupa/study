package lec3.interfaceEx;

public interface Car {
    int WHEELS = 4;

    int speed();
    int maxSpeed();
    void stop();

    String serialNumber();
}
