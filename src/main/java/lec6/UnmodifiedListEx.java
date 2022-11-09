package lec6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiedListEx {
    public static void main(String[] args) {
//        List<Integer> a1 = Stream.of(
//                3,4,1
//        ).toList();

        List<Integer> a1 = Stream.of(
                3,4,1
        ).collect(Collectors.toList());


        a1.add(5);

        System.out.println(a1);
    }
}
