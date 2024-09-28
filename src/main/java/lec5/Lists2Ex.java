package lec5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists2Ex {
    public static void main(String[] args) {
        LinkedList<Integer> arrayList = new LinkedList<>();

        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(87);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);

        List<Integer> filtered = new ArrayList<>();

        for(var x : arrayList){
            if(x > 10){
                filtered.add(x);
            }
        }


        System.out.println(arrayList);
    }

    /*
ArrayList  create = 32072900
ArrayList  create = 46248200
ArrayList  create = 1266000

LinkedList create = 182222500
ArrayList  get = 21500
LinkedList get = 178000

//add by index?
     */
}
