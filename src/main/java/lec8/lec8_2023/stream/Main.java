package lec8.lec8_2023.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product(15);
        Product milk = new Product(35);

        milk.setInFridge(true);

        OrderDetails orderDetails1 = new OrderDetails(bread, 3);
        OrderDetails orderDetails2 = new OrderDetails(milk, 2);

        //sum = 115

        Order order = new Order();

        order.getOrderDetails().add(orderDetails1);
        order.getOrderDetails().add(null);
        order.getOrderDetails().add(orderDetails2);

        System.out.println();


//        int totalPrice = 0;
//
//        for(OrderDetails orderDetails : order.getOrderDetails()){
//            totalPrice += orderDetails.getNumberOfProducts() * orderDetails.getProduct().getPrice();
//        }

//        int totalPriceBefore = order.getOrderDetails().stream()
//                .mapToInt(e -> e.getProduct().getPrice() * e.getNumberOfProducts())
//                .sum();
//
//        Stream<OrderDetails> stream = order.getOrderDetails().stream()
//                .filter(e -> e.getProduct().inFridge)
//                .peek(e -> System.out.println("in stream call " + e.getProduct().getPrice()))
//                .peek(e -> e.getProduct().setPrice(e.getProduct().getPrice() * 2));
//
//        System.out.println("some test string");
//
//        stream.forEach(e -> System.out.println("Price changed to: " + e.getProduct().getPrice()));
//
//        int totalPriceAfter = order.getOrderDetails().stream()
//                .mapToInt(e -> e.getProduct().getPrice() * e.getNumberOfProducts())
//                .sum();
//
//        System.out.println("Before :" + totalPriceBefore);
//        System.out.println("After :" + totalPriceAfter);

        List<OrderDetails> list = getAllInFridgeProducts(order);
        System.out.println();
    }

    public static List<OrderDetails> getAllInFridgeProducts(Order order){
        return order.getOrderDetails().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getProduct().inFridge)
                .collect(Collectors.toList());

    }

    public static class Order {
        private List<OrderDetails> orderDetails = new ArrayList<>();

        public List<OrderDetails> getOrderDetails() {
            return orderDetails;
        }
    }

    public static class OrderDetails {
        private Product product;
        private int numberOfProducts;

        public OrderDetails(Product product, int numberOfProducts) {
            this.product = product;
            this.numberOfProducts = numberOfProducts;
        }

        public Product getProduct() {
            return product;
        }

        public int getNumberOfProducts() {
            return numberOfProducts;
        }
    }

    public static class Product {
        private int price;
        private boolean inFridge;

        public Product(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }


        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isInFridge() {
            return inFridge;
        }

        public void setInFridge(boolean inFridge) {
            this.inFridge = inFridge;
        }
    }
}
