package lec5.lec5_2023.pair;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pair<Item, Integer>> details = new ArrayList<>();

    public List<Pair<Item, Integer>> getDetails() {
        return details;
    }

    public void add(Pair<Item, Integer> pair){
        details.add(pair);
    }


    public void add(Item item, int amount){
        this.add(new Pair<>(item, amount));
    }



}
