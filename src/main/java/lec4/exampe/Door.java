package lec4.exampe;

public class Door implements Calculation{
    private double price;

    public Door(double price) {
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
