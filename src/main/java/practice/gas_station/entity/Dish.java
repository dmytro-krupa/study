package practice.gas_station.entity;

public class Dish {
    private String title;
    private int price;
    private int size;

    public Dish() {
    }

    public Dish(String title, int price, int size) {
        this.title = title;
        this.price = price;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
