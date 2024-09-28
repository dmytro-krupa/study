package lec5.old.generic;

public class SimpleExample {
    public static void main(String[] args) {
        Product milk = new Product(5); //1
        Product bread = new Product(3); //2

        Pair<Product, Integer> milkP = new Pair<>(milk, 1);
        Pair<Product, Integer> breadP = new Pair<>(bread, 2);

        Pair<Product, Integer>[] order = new Pair[2];

        order[0] = milkP;
        order[1] = breadP;

        int sum = 0;

        for(Pair<Product, Integer> pair : order){
            sum += pair.getKey().price * pair.getValue();
        }

        System.out.println(sum);

    }

    static class Product{
        public int price;

        public Product(int price) {
            this.price = price;
        }
    }
}
