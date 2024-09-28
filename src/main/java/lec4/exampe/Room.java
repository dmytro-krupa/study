package lec4.exampe;

public class Room implements Calculation{
    private Window[] windows = new Window[1];
    private Door door;

    private double square; // in m2

    private double price; //per m2

    //todo: add square and price for renovation

    public Room(Window[] windows, Door door, double square, double price) {
        this.windows = windows;
        this.door = door;
        this.square = square;
        this.price = price;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public double getPrice() {
        return price * square;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
