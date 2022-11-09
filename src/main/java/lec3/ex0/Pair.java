package lec3.ex0;

import java.util.Objects;

public class Pair {
    private Product product;
    private int count;

    public Pair() {
    }

    public Pair(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return count == pair.count && Objects.equals(product, pair.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, count);
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        ProductRecord record = new ProductRecord("3", 3);
    }
}
