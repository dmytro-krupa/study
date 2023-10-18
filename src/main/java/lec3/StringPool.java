package lec3;

public class StringPool {
    public static void main(String[] args) {
        String a = "a";
        String a1 = "a";

        /*
            a -> "a" <- a1
         */

//        System.out.println(a == a1);


        //======================================

        Integer x = 128;
        Integer y = 128;
//-128 ... 127
        System.out.println(x.equals(y));

    }
}
