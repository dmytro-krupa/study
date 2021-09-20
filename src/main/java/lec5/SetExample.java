package lec5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(5);
        integerSet.add(4);

        System.out.println(integerSet);
    }
}
