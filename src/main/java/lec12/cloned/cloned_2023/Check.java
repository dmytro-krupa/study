package lec12.cloned.cloned_2023;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Check {
    private List<Item> itemList = new ArrayList<>();

    void sellItemForFree(int index){
        if(itemList.size() < index + 1) {
            throw new RuntimeException("(itemList.size() < index + 1)");
        }

        Item copyItem = itemList.get(index).clone();
        copyItem.setTotalPrice(BigDecimal.ZERO);

        itemList.add(copyItem);
    }

    void addItem(Item item){
        itemList.add(item);
    }

    void printItems(){
        System.out.println(itemList);
    }

    void addComment(int index, String comment){
        itemList.get(index).getComments().add(comment);
    }
}
