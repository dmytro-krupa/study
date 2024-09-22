package lec12.cloned.cloned_2023;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Item{
    private String name;
    private BigDecimal price;
    private BigDecimal quantity;
    private BigDecimal totalPrice;
    private List<String> comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", comments=" + comments +
                '}' + '\n';
    }

    public Item clone(){
        Item item = new Item();
        List<String> comments = new ArrayList<>(this.comments);

        item.setName(this.name);
        item.setPrice(this.price);
        item.setQuantity(this.quantity);
        item.setTotalPrice(this.totalPrice);
        item.setComments(comments);

        return item;
    }
}
