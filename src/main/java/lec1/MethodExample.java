package lec1;

public class MethodExample {
    public static void main(final String[] args) {



        final int[] s = new int[6];

        for (int i = 0; i < s.length; i++){
            s[i] = i;
        }


        System.out.println(sum(s));
    }


    public static int sum (final int[] integers){
        int sum = 0;

        for(final int i : integers){
            sum += i;
        }

        return sum;
    }
}
