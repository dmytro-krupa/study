package lec5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(1);

        long start = System.nanoTime();
        
        for(int i = 0; i < 10_000; i++){
            arrayList.add(i);
        }

        long arrayListCreate = System.nanoTime() - start;

        
        //=========================
        start = System.nanoTime();

        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 10_000; i++){
            linkedList.add(i);
        }
        long linkedListCreate = System.nanoTime() - start;

        //=========================
        start = System.nanoTime();
        int a1 = arrayList.get(7_943);
        long arrayListGet = System.nanoTime() - start;
        //=========================
        start = System.nanoTime();
        int b1 = linkedList.get(7_943);
        long linkedListGet = System.nanoTime() - start;



        //=========================
        start = System.nanoTime();
        arrayList.remove(Integer.valueOf(7_943));
        long arrayListRemove = System.nanoTime() - start;
        //=========================
        start = System.nanoTime();
        linkedList.remove(Integer.valueOf(7_943));
        long linkedListRemove = System.nanoTime() - start;






        System.out.println();
        System.out.println("ArrayList create =  " + arrayListCreate);
        System.out.println("LinkedList create = " + linkedListCreate);
        System.out.println("===============================================");
        System.out.println("ArrayList get =  " + arrayListGet);
        System.out.println("LinkedList get = " + linkedListGet);
        System.out.println("===============================================");
        System.out.println("ArrayList remove =  " + arrayListRemove);
        System.out.println("LinkedList remove = " + linkedListRemove);

    }

    /*
ArrayList  create = 32072900
ArrayList  create = 46248200
ArrayList  create = 1266000

LinkedList create = 182222500
ArrayList  get = 21500
LinkedList get = 178000
     */
}
