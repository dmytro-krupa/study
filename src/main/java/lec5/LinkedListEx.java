package lec5;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();

        integers.add(2);
        integers.add(3);
        integers.add(7);

        System.out.println(integers.get(2));
    }
}
