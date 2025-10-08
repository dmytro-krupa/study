package lec5;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(5);
//
//        for(var x : set){
//            System.out.println(x);
//        }

        if(set.contains(2)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println(set);
    }
}
