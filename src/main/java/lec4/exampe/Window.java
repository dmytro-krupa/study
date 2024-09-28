package lec4.exampe;

public class Window implements Calculation{
    private double price;

    public Window(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
