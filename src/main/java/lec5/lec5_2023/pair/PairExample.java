package lec5.lec5_2023.pair;

public class PairExample {
    public static void main(String[] args) {
        Item bread = new Item("Bread", 15);
        Item milk = new Item("Bread", 20);

        Order order = new Order();

        order.add(bread, 3);
        order.add(milk, 4); // 125

        int sum = 0;

        for(Pair<Item, Integer> pair : order.getDetails()){
            sum += pair.getKey().getPrice() * pair.getValue();
        }

        System.out.println(sum);

    }
}
