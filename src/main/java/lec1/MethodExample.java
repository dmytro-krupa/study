package lec1;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    public static void main(final String... args) {
        int[] array = new int[3];

        array[0] = 5;
        array[1] = 8;
        array[2] = 10;

        System.out.println(sum(5, 8, 10));
        System.out.println(sum("324r"));
    }

    static int sum (String s, int... someArray){
        System.out.println(s);
        int sum = 0;

        for(var i : someArray){
            sum += i;
        }

        return sum;
    }
    static int sum (int a, int b){
        return a + b;
    }
    static int sum (int a, int b, int c){
        return a + b + c;
    }

}
