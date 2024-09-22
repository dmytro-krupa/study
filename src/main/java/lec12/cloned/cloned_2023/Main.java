package lec12.cloned.cloned_2023;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final List<String> breadComments = new ArrayList<>();
        breadComments.add("good bread");
        final List<String> milkComments = new ArrayList<>();
        milkComments.add("bad milk");

        final Item bread = new Item();
        bread.setName("bread");
        bread.setPrice(BigDecimal.valueOf(5));
        bread.setQuantity(BigDecimal.valueOf(3));
        bread.setTotalPrice(bread.getPrice().multiply(bread.getQuantity()));
        bread.setComments(breadComments);

        final Item milk = new Item();
        milk.setName("milk");
        milk.setPrice(BigDecimal.valueOf(12));
        milk.setQuantity(BigDecimal.valueOf(5));
        milk.setTotalPrice(milk.getPrice().multiply(milk.getQuantity()));
        milk.setComments(milkComments);

        final Check check = new Check();

        check.addItem(bread);
        check.addItem(milk);

        check.printItems();

        check.sellItemForFree(1);

        check.addComment(2, "very good milk");

        System.out.println();
        check.printItems();


    }
}
