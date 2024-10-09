package lec7.java_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiedEx {
    public static void main(String[] args) {
//        List<String> x = new ArrayList<>();
//        List<String> x = List.of("b", "c");
//        List<String> x = Arrays.asList("b", "c");
//        List<String> a = new ArrayList<>();
//        a.add("b");
//        a.add("c");

        List<String> x = new ArrayList<>(Collections.emptyList());

        x.add("a");

        System.out.println(x);

    }
}
