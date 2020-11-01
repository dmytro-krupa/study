package lec5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {


        List<String> list = new LinkedList<>();

        list.add("some");
        list.add("text");
        list.add("is");
        list.add("in");
        list.add("list");

        if(list.isEmpty()){
            //
        }



        System.out.println(list);

        System.out.println(list.size());

        for(String s : list){
            System.out.println("123: " + s);
        }

    }
}
