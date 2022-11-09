package issues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAGAIN {
    public static void main(String[] args) {

        Product product1 = new Product("Milk", 1);
        Product product2 = new Product("Bread", 2);
        Product product3 = new Product("Bread", 6);
        Product product4 = new Product("Milk", 4);
        Product product5 = new Product("Bread", 9);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        System.out.println(productList);

        //=============================================


        List<Product> result = productList.stream()
                .map(e -> {
                    e.setName("9");
                    return e;
                })
                .peek(e -> {
                        System.out.println(e);
                })
                .collect(Collectors.toList());

        //=============================================
        System.out.println(result);
    }






    static class Product{
        private String name;
        private Integer amount;

        public Product(String name, Integer amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
}
