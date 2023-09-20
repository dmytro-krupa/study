package lec3.practice_2023;

public class OrderDetail {
    private Item item;
    private int quantity;
    private String comment;

    public OrderDetail() {
    }

    public OrderDetail(Item item, int quantity, String comment) {
        this.item = item;
        this.quantity = quantity;
        this.comment = comment;
    }

    public OrderDetail(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "item=" + item +
                ", quantity=" + quantity +
                ", comment='" + comment + '\'' +
                '}';
    }
}
