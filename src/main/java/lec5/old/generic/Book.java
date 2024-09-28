package lec5.old.generic;

public class Book {
    private String title;
    private int price;

    public Book(final String title, final int price) {
        this.title = title;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
