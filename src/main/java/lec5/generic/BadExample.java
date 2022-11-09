package lec5.generic;

import java.util.ArrayList;
import java.util.List;

public class BadExample {
    public static void main(String[] args) {
        //raw types до java 1.5
        List list = new ArrayList();

        list.add("Hello");
        list.add(111);


        if(list.get(0) instanceof String){

        }


        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
