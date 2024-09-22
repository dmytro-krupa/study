package lec1;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    public static void main(final String[] args) {
        List<String> q = new ArrayList<>();
        System.out.println(String.join(", ", q));


        final int[] s = new int[6];

        for (int i = 0; i < s.length; i++){
            s[i] = i;
        }


//        System.out.println(sum(s));
    }


    private static int sum (final int[] integers){
        int sum = 0;

        for(final int i : integers){
            sum += i;
        }

        return sum;
    }
}
