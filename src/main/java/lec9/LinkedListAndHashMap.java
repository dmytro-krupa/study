package lec9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedListAndHashMap {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(2_000_000);
        List<Integer> integersLinked = new LinkedList<>();

        long start = System.currentTimeMillis();

        for(int i =0; i < 2_000_000; i++){
            integers.add(i);
        }

        long stop = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (stop - start));

        start = System.currentTimeMillis();

        for(int i =0; i < 2_000_000; i++){
            integersLinked.add(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (stop - start));




        long startNano = System.nanoTime();
        integers.get(678);
        integers.get(1_000_124);
        integers.get(6245);
        integers.get(1_985_653);
        integers.get(678_344);
        long stopNano = System.nanoTime();
//        System.out.println("ArrayList time = " + (stopNano - startNano));

        startNano = System.nanoTime();
        integersLinked.get(678);
        integersLinked.get(1_000_124);
        integersLinked.get(6245);
        integersLinked.get(1_985_653);
        integersLinked.get(678_344);
        stopNano = System.nanoTime();
//        System.out.println("LinkedList time = " + (stopNano - startNano));


        //==================================================================================


    }
}
