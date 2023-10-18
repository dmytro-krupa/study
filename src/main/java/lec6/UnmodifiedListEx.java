package lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiedListEx {
    public static void main(String[] args) {

        List<String> userNames = new ArrayList<>();

        userNames.add("1");
        userNames.add("2");
        userNames.add("3");

        List unmodifiableList = Collections.unmodifiableList(userNames);

//        unmodifiableList.add("4");

        System.out.println(unmodifiableList);

    }


}
